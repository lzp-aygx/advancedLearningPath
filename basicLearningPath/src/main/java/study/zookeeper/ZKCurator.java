package study.zookeeper;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.data.Stat;

/**
 * Created by lizhupeng on 2017/6/14.
 */
public class ZKCurator {

    private static final String connectString = "192.168.28.101:2181,192.168.28.102:2181,192.168.28.103:2181";

    private static final int sessionTimeout = 5000;

    public static void main(String[] args) throws Exception {
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 10);
        CuratorFramework curatorFramework = CuratorFrameworkFactory
                .builder().connectString(connectString).sessionTimeoutMs(sessionTimeout)
                .retryPolicy(retryPolicy).build();
        //启动CuratorFramework
        curatorFramework.start();
        //创建节点
        curatorFramework.create().creatingParentsIfNeeded()
                .withMode(CreateMode.EPHEMERAL).forPath("/curator/node","node".getBytes("UTF-8"));
        //获取数据
        System.out.println(new String(curatorFramework.getData().forPath("/curator/node"),"UTF-8"));
        //设置数据
        curatorFramework.setData().forPath("/curator/node","curator".getBytes("UTF-8"));
        //递归删除节点
//        curatorFramework.create().creatingParentsIfNeeded()
//                .withMode(CreateMode.PERSISTENT).forPath("/curator/temp/t1/t2");
        curatorFramework.delete().deletingChildrenIfNeeded().forPath("/curator/temp");
        //检测节点是否存在
        Stat stat = curatorFramework.checkExists().forPath("/curator");
        System.out.println(stat);


        curatorFramework.close();
    }
}
