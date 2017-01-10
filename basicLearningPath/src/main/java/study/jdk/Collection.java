package study.jdk;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by lizhupeng on 2016/7/18.
 */
/*jdk中的容器类有五个
*   list:
*       ArrayList
*       LinkedList
*       Vector
*   Set:
*       HashSet
*       TreeSet
* */
public class Collection {
    public static void baseMethod() {
        User user1 = new User(1, "1", "1");
        User user2 = new User(2, "2", "2");
        User user3 = new User(3, "3", "3");
        ArrayList arrayList = new ArrayList();
        arrayList.add(user1);
        arrayList.add(user2);
        arrayList.add(user3);
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        arrayList.remove(0);//remove element by index
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        arrayList.remove(user2);//remove element by object
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());
    }

    /*Iterator是各种容器类的一个内部类,用来作为提取方式
    * 内部类的访问规则:
    *       1.内部类可以直接访问外部类中的成员,包括私有的
    *       2.外部类访问内部类,必须建立内部类对象
    *       3.直接访问内部类的格式为Outer().new Inner();
    * */
    public static void testIterator() {
        User user1 = new User(1, "1", "1");
        User user2 = new User(2, "2", "2");
        User user3 = new User(3, "3", "3");
        ArrayList arrayList = new ArrayList();
        arrayList.add(user1);
        arrayList.add(user2);
        arrayList.add(user3);
        Iterator iterator = arrayList.iterator();//内部类的使用.
        while (iterator.hasNext()) {
            User user = (User) iterator.next();
            System.out.println(user.toString());
        }

    }

    public static void main(String[] args) {
        // baseMethod ();
        testIterator();
    }


}
