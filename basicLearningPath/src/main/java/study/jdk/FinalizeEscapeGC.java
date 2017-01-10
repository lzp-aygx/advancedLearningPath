package study.jdk;

/**
 * Created by lizhupeng on 2016/8/26.
 */
public class FinalizeEscapeGC {
    public static FinalizeEscapeGC SAVE_HOOK = null;

    public void isAlive() {
        System.out.println("I am still alive :");
    }

    //在内存回收系统中。对象在被真正回收前都会执行对象的finalize方法(仅第一次)
    //所以在finalize方法中使得对象从新与引用链建立关联可以完成对象的自救
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Finalize method executed !");
        //从新与引用链建立关联,那么再第二次标记时它
        FinalizeEscapeGC.SAVE_HOOK = this;
    }

    public static void main(String[] args) throws InterruptedException {
        SAVE_HOOK = new FinalizeEscapeGC();
        //对象实现第一次自我拯救
        SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("I am dead :");
        }
        //从结果看来对象的第二次自救失败
        //是因为任何一个对象的finalize()方法只会被系统自动调用一次.
        //所以当对象第二次面临回收的时候,他的finalize()方法不会再次执行
        SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("I am dead :");
        }
    }
}
