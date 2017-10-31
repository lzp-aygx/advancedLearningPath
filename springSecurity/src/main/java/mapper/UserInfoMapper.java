package mapper;

import domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by lizhupeng on 2017/9/21.
 */


@Mapper
public interface UserInfoMapper {

    @Select("slect * from user where id = #{id}")
     User getUserInfoById(int id );


}
