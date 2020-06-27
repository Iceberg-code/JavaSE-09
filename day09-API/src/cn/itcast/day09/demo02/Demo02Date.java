package cn.itcast.day09.demo02;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {

        //当前系统的日期和时间
        demo01();   //Tue Apr 14 10:40:03 CST 2020
        System.out.println("==================");

        demo02();   //Thu Jan 01 08:00:00 CST 1970
        System.out.println("==================");

        demo03();   //1586833751631
    }


    /*
    * Date类的空参数构造方法：
    *       Date()获取的就是当前系统的日期和时间
    * */
    private static void demo01(){
        Date date = new Date();
        System.out.println(date);   //Tue Apr 14 10:40:03 CST 2020
    }


    /*
    * Date类的带参数构造方法：
    *       把long类型的毫秒值转换为当前日期
    * */
    private static void demo02(){
        Date date = new Date(0L);
        System.out.println(date);   //Thu Jan 01 08:00:00 CST 1970

        System.out.println(new Date(2211235423L));  //Mon Jan 26 22:13:55 CST 1970
    }


    /*
    * Date类的成员方法
    *       long getTime() 把日期转换为毫秒（相当于 System.currentTimeMillis()）
    *       返回自1970.01.01  00：00：00 GMT 以来 此Date对象表示的毫秒数
    * */
    private static void demo03(){
        Date date = new Date();
        long time = date.getTime(); //注意：返回值是long类型
        System.out.println(time);   //1586833751631
    }
}
