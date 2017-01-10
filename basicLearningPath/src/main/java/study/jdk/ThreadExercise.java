package study.jdk;

/**
 * Created by lizhupeng on 2016/7/19.
 */
public class ThreadExercise implements Runnable {

    private String windowName;

    public ThreadExercise(String windowName) {
        this.windowName = windowName;
    }

    public Ticket ticket = Ticket.getInstance();

    private int var = 1000;

    //对于var是非线程安全的
    private Object object = new Object();

    public /*synchronized*/ void run() {
        //使用synchronized描述符添加到run函数上并不能解决线程安全问题
        // synchronied同步代码块必须制定锁住的对象,然后实现了线程安全,并且最终结果为首先抢占到ticket对象的线程
        // 会把ticket卖完然后才释放
        synchronized (object) {
            while (ticket.tickAmount > 0) {
                    System.out.println(windowName + " sale ticket success,remain " + --ticket.tickAmount);
            }
        }

        synchronized (object) {
            while (var > 0) {
                System.out.println(windowName + " var: " + --var);
            }
        }

    }

}
