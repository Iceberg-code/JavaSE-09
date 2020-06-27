package cn.itcast.day09.demo05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConclusion {
    public static void main(String[] args) throws ParseException {
        //空参构造方法
        Date d1 = new Date();
        System.out.println(d1);  //Mon Apr 20 10:11:46 CST 2020
        System.out.println(d1.toLocaleString()); //2020年4月20日 上午10:40:59    过时的方法
        System.out.println("==================");

        Date d2 = new Date(3000L);
        System.out.println(d2.toLocaleString());    //1970年1月1日 上午8:00:03       过时的方法
        System.out.println("==================");

        //创建日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format = sdf.format(d2);
        System.out.println(format); //1970年01月01日 08:00:03
        System.out.println("==================");

        String str = "2088年08月08日 08:08:08";
        Date parse = sdf.parse(str);
        System.out.println(parse);  //Sun Aug 08 08:08:08 CST 2088

    }
}
