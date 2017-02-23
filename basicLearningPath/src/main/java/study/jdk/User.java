package study.jdk;


/**
 * Created by lizhupeng on 2016/7/13.
 */


public class User {
    private long id;
    private String UserName;
    private String Password;

    public User() {
    }


    public User( long id, String password,String userName) {
        this.id = id;
        Password = password;
        UserName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", UserName='" + UserName + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
        System.out.println("设置UserId为: "+this.id);
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

}
