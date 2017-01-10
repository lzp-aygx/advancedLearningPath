package study.jdk;

/**
 * Created by lizhupeng on 2016/8/29.
 */


public class BusyThreadTest implements Runnable{

    /*线程死循环测试*/
    public static void createBusyThread(){
        Thread thread = new Thread(new Runnable() {

            public void run() {
                while (true)
                    ;
            }
        },"testBusyThread");
        thread.start();
    }

    /*线程等待测试*/
    public static void createLockThread(final Object lock){
        Thread thread =new Thread(new Runnable() {
            public void run() {
                synchronized (lock) {
                    try {
                        lock.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        },"testLockThread");
        thread.start();
    }

    /*线程死锁测试*/
    int a,b;
    public BusyThreadTest(int a, int b){
        this.a=a;
        this.b=b;
    }

    public void run() {
        /*造成死锁的原因是Integer.valueOf()方法基于减少对象创建次数和节省内存的考虑,
        * [-128,127]质检的数字会被缓存,当valueOf()方法传入参数在这个范围之内,将直接返回缓存中的对象
        * 也就是说代码中调用了200次Integer.valueOf()方法一共就只返回了两个不同的对象.
        * 假如在某个线程中的两个synchronozed块之间发生了一次线程切换,那就会出现线程A等着被线程B持有的Integer.valueOf(1),
        * 线程B又等着被线程A持有的Intege.valueOf(2),结果出现了两个线程都在等待对方持有对象的资源无法继续跑*/
        synchronized(Integer.valueOf(a)){
            synchronized (Integer.valueOf(b)){
                System.out.println(a+b);
            }
        }
    }

    public static void main(String[] args) throws Exception{
//        Object obj = new Object();
//        createLockThread(obj);
        for(int i = 0;i<100;i++){
            new Thread(new BusyThreadTest(1,2),"A"+i).start();
            new Thread(new BusyThreadTest(2,1),"B"+i).start();
        }
    }
}
