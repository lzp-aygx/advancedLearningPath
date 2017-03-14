package advancedPath.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by lizhupeng on 2016/12/29.
 */

/*Mybatis工具类*/
public class MyBatisUtilDaoSDMS {
    private static SqlSessionFactory sqlSessionFactory;

    /*静态代码块创建SessionFactory*/
    static {
        try {
            Reader reader = Resources.getResourceAsReader("mybatisConfig-sdms.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*获取sqlSession*/
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
