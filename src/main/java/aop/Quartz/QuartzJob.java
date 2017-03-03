package aop.Quartz;

import aop.service.TestService;
import aop.util.TimeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by wanghao on 17-3-3.
 */
public class QuartzJob {

    @Resource
    private TestService testService;

    public static Logger log= LoggerFactory.getLogger(QuartzJob.class);

    public void work(){
        log.info("time is start: "+ TimeUtil.date2StringByType(new Date(),"yyyy-MM-dd hh:mm:ss"));
        testService.insert();
    }
}
