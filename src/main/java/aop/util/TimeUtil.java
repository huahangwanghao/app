package aop.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wanghao on 17-3-3.
 */
public class TimeUtil {

    private static SimpleDateFormat sdf=null;

    /**
     *
     * @param date
     * @param formate
     * @return
     */
    public static String date2StringByType(Date date, String formate){
        sdf=new SimpleDateFormat(formate);
        return sdf.format(date);
    }


}
