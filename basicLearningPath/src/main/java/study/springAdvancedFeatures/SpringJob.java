package study.springAdvancedFeatures;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lizhupeng on 2017/1/16.
 */
@Service
public class SpringJob {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");


    @Scheduled(fixedRate = 5000) //轮询执行
    public void reportCurrentTime() {
        System.out.println("每隔五秒执行一次 " + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 28 11 ? * *")//按照指定时间执行,这个例子是指每天11点28分执行.
    public void fixTimeExecution() {
        System.out.println("指定时间 " + dateFormat.format(new Date()) + "执行");
    }

}
