package study.jdk;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by lizhupeng on 2016/7/19.
 */
/*抢占式的运行方式会使得java多线的使用难免会出现多线程安全问题*/
/*线程安全问题可以是用关键字synchronized来解决,使用synchronized关键字使得代码具有
  1.原子性:代码在jvm上回通过monitor object 保护,防止多个线程在更新共享状态时相互冲突!
  2.可见性:是指线程之间的可见性，一个线程修改的状态对另一个线程是可见的。
使用方法有两种:
*   1.使用synchronized修饰词来修饰线程类的方法,当一个线程使用了该类的synchronized方法,其他线程将无法使用,但是该类
*     的其他非synchronized方法可以访问.
*   2.使用synchronized加上对象锁(每个对象都有对象锁/即对象监听器)来编写同步代码块,
*     相对于同步方法,同步代码块比同步方法使用起来比较灵活.
* */
public class ThreadTest {
//    public static void main(String[] args) {
////        ThreadDemo t1 = new ThreadDemo();
////        ThreadDemo t2 = new ThreadDemo();
////        t1.start();
////        t2.start();
//        ThreadExercise window1 = new ThreadExercise("窗口1");
//        ThreadExercise window2 = new ThreadExercise("窗口2");
//        ThreadExercise window3 = new ThreadExercise("窗口3");
//        Thread t1 = new Thread(window1);
//        Thread t2 = new Thread(window2);
//        Thread t3 = new Thread(window3);
//        t1.start();
//        t2.start();
//        t3.start();
//    }

    //使用线程池与不使用线程池对比
//    使用线程池的情况:
//        通过对比发现使用线程池的执行时间远远比不适用线程池的方式短
//        造成这种原因的最大差异在于,使用线程池的方式是复用线程的,而不使用线程池的方式每次都需要创建线程。
//          并且当线程处理工作比较简单的时候，创建线程消耗的开销占整个事件的比例比较大。
//     下面线程使用的是ThreadPoolExecutor,另外还有定时的线程池,ScheduledThreadPoolExecutor
//   public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
//        final List<Integer> l = new LinkedList<Integer>();
//       int count = 10000;
//       //线程池初始化ThreadPoolExecutor(int corePoolSize,int maximumPoolSize,long keepAliveTime,TimeUnit unit,BlockingQueue<Runnable> workQueue)
//       //corePoolSize:核心线程池大小.maximumPoolSize:最大线程池大小.keepAliveTime:线程池中超过corePoolSize数目的空闲线程最大存活时间
//       //unit:超数空闲线程存活时间的单位 workQueue:阻塞队列,队列带下为count
//       ThreadPoolExecutor tp = new ThreadPoolExecutor(1,1,60, TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>(count));
//       final Random random = new Random();
//       for(int i=0;i<count;i++){
//           tp.execute(new Runnable() {
//               @Override
//               public void run() {
//                   l.add(random.nextInt(100));
//               }
//           });
//       }
//       tp.shutdown();
//       try{
//            tp.awaitTermination(1,TimeUnit.DAYS);
//       }catch(InterruptedException e){
//        e.printStackTrace();
//       }
//       System.out.println(System.currentTimeMillis() - startTime);
//       System.out.println("size: "+l.size());
//    }


    //不使用线程池
    public static void main(String[] args) {
        long starTime = System.currentTimeMillis();
        final List<Integer> l = new LinkedList<Integer>();
        final Random random = new Random();
        int count = 10000;
        for(int i=0;i<count;i++){
            Thread thread = new Thread(){
                @Override
                public void run(){
                    l.add(random.nextInt());
                }
            };
            thread.start();
            try {
                thread.join();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(System.currentTimeMillis()-starTime);
        System.out.println(l.size());
    }
}
