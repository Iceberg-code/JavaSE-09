package cn.itcast.day09.demo04;

import java.util.Calendar;
import java.util.Date;

/*
* Calendar类的成员方法：
*       - public int get(int field)：返回给定日历字段的值
*       - public void set(int field, int value)：将特定的日历字段设置为给定值
*       - public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或者减去指定的时间量
*       - public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象
* 成员方法的参数：
*       int field：日历类的字段，可以使用Calendar类的静态成员变量获取
*       public static final int YEAR = 1;   年
*       public static final int MONTH = 2;  月
*       public static final int DATE = 5;   月中的某一天
*       public static final int DATE_OF_MONTH = 5;  月中的某一天
*       public static final int HOUR = 10;  时
*       public static final int MINUTE = 12;    分
*       public static final int SECOND = 13;    秒
* */
public class Demo02Calendar {
    public static void main(String[] args) {
        demo01();
        System.out.println("===============");

        demo02();
        System.out.println("===============");

        demo03();
        System.out.println("===============");

        demo04();
    }

    /*
    * public int get(int field)：返回给定日历字段的值
    * 参数：传入指定的日历字段(YEAR,MONTH...)
    * 返回值：日历字段代表具体的值
    * */
    private static void demo01(){
        //使用getInstance()方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
//        System.out.println(Calendar.YEAR);  //4


        int month = c.get(Calendar.MONTH);
        System.out.println(month + 1);  //西方的月是0-11月，东方的月是1-12月
//        System.out.println(Calendar.MONTH); //2

        int date = c.get(Calendar.DATE);    //Calendar.DAY_OF_MONTH 一样
        System.out.println(date);
//        System.out.println(Calendar.DATE);  //5
    }

    /*
    * public void set(int field, int value)：将特定的日历字段设置为给定值
    * 参数：
    *       int field：传递指定的日历字段(YEAR,MONTH...)
    *       int value：传递的字段设置的具体的值
    * */
    private static void demo02(){
        //使用getInstance()方法获取Calendar对象
        Calendar c = Calendar.getInstance();

        c.set(Calendar.YEAR, 2100); //设置年为2100
        c.set(Calendar.MONTH, 10);  //设置月为10
        c.set(Calendar.DATE, 10);   //设置天为10

        //也可以同时设置年月日，可以使用set的重载方法
//        c.set(9999, 9, 9);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);

        System.out.println(year + " " + month + " " + date);
    }

    /*
    * public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或者减去指定的时间量
    * 把指定的字段增加/减少指定的值
    * 参数：
    *       int field：传递指定的日历字段(YEAR,MONTH...)
    *       int amount：增加/减少的值
    *           正数：增加
    *           负数：减少
    * */
    private static void demo03(){
        //使用getInstance()方法获取Calendar对象
        Calendar c = Calendar.getInstance();

        c.add(Calendar.YEAR, 1);
        c.add(Calendar.MONTH, -2);
        c.add(Calendar.DATE, 7);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);

        System.out.println(year + " " + (month + 1) + " " + date);
    }

    /*
    * public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象
    * 把日历对象，转换为日期对象
    * */
    private static void demo04(){
        //使用getInstance()方法获取Calendar对象
        Calendar c = Calendar.getInstance();

        Date date = c.getTime();
        System.out.println(date);
    }
}
