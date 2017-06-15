package study.zookeeper;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.cache.NodeCache;
import org.apache.curator.framework.recipes.cache.NodeCacheListener;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by lizhupeng on 2017/6/14.
 */
public class ZKCuratorCallBack {
    private static final String connectString = "192.168.28.101:2181,192.168.28.102:2181,192.168.28.103:2181";

    private static final int sessionTimeout = 5000;

    public static void main(String[] args) throws Exception {
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 10);
        CuratorFramework curatorFramework = CuratorFrameworkFactory
                .builder().connectString(connectString).sessionTimeoutMs(sessionTimeout)
                .retryPolicy(retryPolicy).build();
        final NodeCache nodeCache = new NodeCache(curatorFramework,"/curator/t2",false);
        //启动CuratorFramework
        curatorFramework.start();
        nodeCache.start(true);
        //线程池
        Executor executor = Executors.newFixedThreadPool(10);
        nodeCache.getListenable().addListener(new NodeCacheListener() {
            @Override
            public void nodeChanged() throws Exception {
                if (nodeCache.getCurrentData() != null){
                    System.out.println("------------------");
                    System.out.println(nodeCache.getCurrentData().getPath());
                    System.out.println(new String(nodeCache.getCurrentData().getData()));
                }
            }
        }, executor);
        curatorFramework.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT)
                .forPath("/curator/t2","a".getBytes());
        Thread.currentThread().sleep(10000);
        curatorFramework.setData().forPath("/curator/t2","b".getBytes());
        Thread.currentThread().sleep(10000);
        curatorFramework.delete().forPath("/curator/t2");
    }
}
