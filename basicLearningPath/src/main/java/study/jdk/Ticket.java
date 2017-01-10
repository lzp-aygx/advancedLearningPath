package study.jdk;

/**
 * Created by lizhupeng on 2016/7/20.
 */
//懒汉式实现单例模式等到调用的时候才进行实例化
//饿汉式就是在类中一开始就已经实例化
public class Ticket{
    public static int tickAmount;
    //构造函数私有化
    private Ticket() {
        this.tickAmount=1000;
    }
    //定义静态类,但是没有实例化
    private static Ticket ticket = null;//如果是饿汉式就是private static Ticket ticket = new ticket;
    //外部访问方法
    public static Ticket getInstance() {
        if (ticket == null) {
            ticket = new Ticket();
        }
        return ticket;
    }
}
