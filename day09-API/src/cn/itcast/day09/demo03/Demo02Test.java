package cn.itcast.day09.demo03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
* 练习：
*       使用日期相关的API，计算处一个人已经出生了多山天。
* 分析：
*       1、使用Scanner类中的next方法，获取出生日期
*       2、使用DateFormat类中的方法parse，把字符串的出生日期解析为Date格式
*       3、把Date格式的出生日期转换为毫秒值
*       4、获取当前的日期，转换为毫秒值
*       5、使用当前日期的毫秒值-出生日期的毫秒值
*       6、把毫秒值的茶汁转换为天(s/1000/60/60/24)
* */
public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        //1、使用Scanner类中的next方法，获取出生日期
        Scanner sc = new Scanner(System.in);
        System.out.println("输入出生日期，格式为yyyy-MM-dd");
        String birthdayDateString = sc.next();

        //2、使用DateFormat类中的方法parse，把字符串的出生日期解析为Date格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayDateString);

        //3、把Date格式的出生日期转换为毫秒值           只有毫秒才能减，日期本身不能减
        long birthdayDateTime = birthdayDate.getTime();

        //4、获取当前的日期，转换为毫秒值
        long todayTime = new Date().getTime();

        //5、使用当前日期的毫秒值-出生日期的毫秒值
        long time = todayTime - birthdayDateTime;

        //6、把毫秒值的差值转换为天(s/1000/60/60/24)
        System.out.println((time / 1000 / 60 / 60 / 24) + "天");
    }
}
