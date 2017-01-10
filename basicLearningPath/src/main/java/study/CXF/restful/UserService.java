package study.CXF.restful;


import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by lizhupeng on 2016/7/13.
 */
@WebService
@Path("/user")
public interface UserService {
    @GET//HTTP Get Method
    @Path("/query/{id}")//transfer id by url
    @Produces(MediaType.APPLICATION_XML)//set MediaType to XML
    public User queryUser(@PathParam("id") long id);

    @GET
    @Path("/querylist")
    //设置返回数据类型可以为json和xml,默认为xml,
    //访问方式 http://127.0.0.1:12345/rest/user/querylist?_type=json
    @Produces({"application/json;charset=utf-8",MediaType.APPLICATION_XML})
    public List<User> queryUserList();
}
