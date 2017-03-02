package study.jdk; /**
 * Created by lizhupeng on 2017/3/2.
 */

/**
 * 1、避免过大的try块，不要把不会出现异常的代码放到try块里面，尽量保持一个try块对应一个或多个异常。
 　　2、细化异常的类型，不要不管什么类型的异常都写成Excetpion。
 　　3、catch块尽量保持一个块捕获一类异常，不要忽略捕获的异常，捕获到后要么处理，要么转译，要么重新抛出新类型的异常。
 　　4、不要把自己能处理的异常抛给别人。
 　　5、不要用try...catch参与控制程序流程，异常控制的根本目的是处理程序的非正常情况。
 */
public class ExceptionTest {

    public static void main(String[] args) {
        System.out.println("Star");
        try {
            System.out.println(1 / 0);
        }
         catch (ArithmeticException e){
            System.out.println("除数为0!");
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("End");
    }
}


