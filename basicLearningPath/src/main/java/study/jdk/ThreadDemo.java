package study.jdk;

/**
 * Created by lizhupeng on 2016/7/19.
 */
/*进程：是一个正在执行中的程序
 * 		每个进程执行都有一个执行顺序，该顺序是一个执行路劲，或者叫控制单元
 * 线程：就是进程中的一个独立的控制单元
 * 		一个进程至少有一个线程
 *
 * java vm 启动的时候回有一个进程：java.exe
 * 该进程中至少有一个线程负责java程序的执行.
 * 而且这个线程运行的代码存在于main方法中
 * 该线程称之为主线程.
 *
 * 扩展:
 * jvm中至少有两个线程,因为还有一个负责清理垃圾的线程
 * 如何在自定义的代码中定义一个线程:
 *      有两个方法:1.继承Thread类  2.实现Runnable接口
 *              两个放都是要编写线程的实现方法run方法.
 *              提供Runnable接口来定义线程的好处是避免了Java只能单继承的尴尬.
 * 创建线程的第一种方式就是继承Thread类
 * 			步骤:
 * 				1.继承Thread类
 * 				2.复写Thread类中的run方法
 * 					即:定义该线程的运行体
 * 				3.调用线程的start方法
 * 					该方法两个作用:启动线程,调用run方法.
 * */


public class ThreadDemo extends Thread{
        public void run(){
            for(int i=0;i<100;i++){
                System.out.println("ThreadDemo run "+i);
            }
        }
}


