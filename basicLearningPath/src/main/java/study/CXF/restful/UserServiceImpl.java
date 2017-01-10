package study.CXF.restful;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lizhupeng on 2016/7/13.
 */
public class UserServiceImpl implements UserService{

    public User queryUser(long id) {
        User user = new User();
        user.setId(id);
        user.setUserName("张三");
        user.setPassword("Password");
        return user;
    }


    public List<User> queryUserList() {
        List<User> userList = new ArrayList<User>();
        User user1= new User();
        User user2= new User();
        User user3= new User();
        user1.setId(1);
        user1.setUserName("张三");
        user1.setPassword("Password");
        user2.setId(2);
        user2.setUserName("李四");
        user2.setPassword("Password");
        user3.setId(3);
        user3.setUserName("王五");
        user3.setPassword("Password");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        return userList;
    }
}
