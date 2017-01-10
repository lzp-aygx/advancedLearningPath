package study.CXF.restful;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by lizhupeng on 2016/7/13.
 */
/*使用@XmlRootElement注解讲POJO转成xml
* name中的名称将会成为Xml的根节点
* */
@XmlRootElement(name = "User")
public class User {
    private long id;
    private String UserName;
    private String Password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
