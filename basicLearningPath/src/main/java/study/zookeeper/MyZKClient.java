package study.zookeeper;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;


/**
 * Created by lizhupeng on 2017/6/8.
 */
public class MyZKClient  {

    private static final String connectString = "192.168.28.101:2181,192.168.28.102:2181,192.168.28.103:2181";

    private static final int sessionTimeout = 5000;

    private static final CountDownLatch countDownLatch = new CountDownLatch(1);

    public static void main(String[] args) throws IOException, InterruptedException, KeeperException {
        final ZooKeeper zooKeeper = new ZooKeeper(connectString, sessionTimeout, new Watcher() {
            @Override
            public void process(WatchedEvent event) {
                Event.KeeperState state = event.getState();
                Event.EventType type = event.getType();
                if (state == Event.KeeperState.SyncConnected && type == Event.EventType.None){
                    System.out.println("connected zk server!");
                    countDownLatch.countDown();
                }
            }
        });

        countDownLatch.await();
        System.out.println("run..." + zooKeeper);
        byte[] data = zooKeeper.getData("/",false,null);
        System.out.println(new String(data));
        List<String> childrens = zooKeeper.getChildren("/",false);
        for(String child : childrens){
            System.out.println(child);
        }
        zooKeeper.close();
    }
}
