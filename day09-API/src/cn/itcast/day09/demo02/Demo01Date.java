package cn.itcast.day09.demo02;
/*
* java.util.Date：表示日期和时间的类
* 类Data表示特定的瞬间，精确到毫秒        1000毫秒=1秒
*
* 毫秒值的作用：可以对时间和日期进行计算
* 将日期转换为毫秒进行计算，计算完毕，再把毫秒转换为日期
*
* 把日期转换为毫秒：
*       当前日期：2020.04.14
*       时间原点：1970.01.01   00：00：00 （英国格林威治时间）
*       就是当前日期到时间原点之间一共经历了多少毫秒（1586830745113L），是一个long类型的值
* 注意：中国属于东八区，会把时间增加8小时：1970.01.01   08：00：00
*
* 把毫秒转换为日期：
*       1天 = 24 * 60 * 60 = 86400秒 = 86400000毫秒
*
* */
public class Demo01Date {
    public static void main(String[] args) {

        //获取当前系统时间到1970.01.01   00：00：00经历了多少毫秒
        System.out.println(System.currentTimeMillis());
    }
}
