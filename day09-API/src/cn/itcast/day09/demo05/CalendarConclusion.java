package cn.itcast.day09.demo05;

import java.util.Calendar;

public class CalendarConclusion {
    public static void main(String[] args) {
        //获取日历类对象
        Calendar c = Calendar.getInstance();

        //get方法
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH) + 1;  //国外月份从0开始，在此基础上+1
        System.out.println(month);
        System.out.println("====================");

        //set方法
        c.set(Calendar.YEAR, 2088);
        year = c.get(Calendar.YEAR);
        System.out.println(year);   //2088
        System.out.println("====================");

        //add方法
        c.add(Calendar.YEAR, 2);    //传入正数年份增加，传入负数年份减少
        year = c.get(Calendar.YEAR);
        System.out.println(year);   //2090
    }
}
