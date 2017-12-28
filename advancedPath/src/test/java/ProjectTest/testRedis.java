package ProjectTest;

import redis.clients.jedis.Jedis;

/**
 * Created by lizhupeng on 2017/12/19.
 */
public class testRedis {


    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.163.128",6379);
        jedis.auth("myRedis");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
        System.out.println(jedis.get("userId"));
    }
}
