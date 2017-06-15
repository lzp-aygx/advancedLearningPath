package study.zookeeper;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * Created by lizhupeng on 2017/6/14.
 */
public class DistributedZKClient {

    private static final String root = "/root";

    private static final String lock = "lock_";

    private String thisPath;

    private String waitPath;

    private ZooKeeper zooKeeper;

    private static final int sessionTimeout = 5000;

    private static final String connectString = "192.168.28.101:2181,192.168.28.102:2181,192.168.28.103:2181";

    private static final CountDownLatch countDownLatch = new CountDownLatch(1);

    public void doTask() throws KeeperException, InterruptedException {
        System.out.println(Thread.currentThread().getName() + "获取到锁,开始执行任务...");
        //释放锁
        zooKeeper.delete(root + "/" + lock, -1);
    }

    public void lock() throws IOException {
            zooKeeper = new ZooKeeper(connectString, sessionTimeout, new Watcher() {
                @Override
                public void process(WatchedEvent event) {
                    if(event.getState() == Event.KeeperState.SyncConnected){
                        if (event.getType() ==Event.EventType.None){
                            countDownLatch.countDown();
                        }else if(event.getType() == Event.EventType.NodeDeleted){
                            try{
                                List<String> childrens = zooKeeper.getChildren(root,false);
                                Collections.sort(childrens);
                                int index = childrens.indexOf(thisPath);
                                if (index == 0){
                                    doTask();//获取锁,并且开始执行任务
                                }else if (index > 0){
                                    waitPath = childrens.get(index - 1);
                                    if (zooKeeper.exists(root + "/" + waitPath,true) == null){
                                        doTask();
                                    }
                                }
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            } catch (KeeperException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            });

    }

}
