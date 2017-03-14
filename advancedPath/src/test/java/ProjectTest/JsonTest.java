package ProjectTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import advancedPath.entity.Paper;

/**
 * Created by lizhupeng on 2017/1/17.
 */
public class JsonTest {

    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        Paper paper = new Paper(1,"P01","牛卡","KRAFT");
        String json = mapper.writeValueAsString(paper);
        System.out.println(json);

        Paper pJ = mapper.readValue(json,Paper.class);
        System.out.println(pJ);
    }



}
