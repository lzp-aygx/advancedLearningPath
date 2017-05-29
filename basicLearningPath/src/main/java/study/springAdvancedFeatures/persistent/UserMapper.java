package study.springAdvancedFeatures.persistent;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by lizhupeng on 2017/5/26.
 */

public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User getUser(@Param("id") int id);

    @Select("select * from user")
    List<User> getUsers();

    @Insert("insert into user(id,name,password,address,age) values(#{id},#{name},#{password},#{address},#{age})")
    int insertUser(User user);

}
