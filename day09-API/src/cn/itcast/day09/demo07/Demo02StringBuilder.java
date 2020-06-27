package cn.itcast.day09.demo07;
/*
* StringBuilder类的成员方法：
*       public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身
*       参数：
*           可以是任意的数据类型
* */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        //创建StringBuilder对象
        StringBuilder bu1 = new StringBuilder();
        //使用append方法往StringBuilder中添加数据
        //append方法返回的是this，就是调用方法的对象bu1
        StringBuilder bu2 = bu1.append("abc");
        System.out.println(bu1);
        System.out.println(bu2);
        System.out.println(bu1 == bu2); //true - 说明两个对象的地址值相同，是同一个对象
        System.out.println("=============");

        //使用append方法无需接收返回值
        bu1.append("abc");
        bu1.append(1);
        bu1.append(1.1);
        bu1.append(true);
        bu1.append('中');
        System.out.println(bu1);    //abcabc11.1true中
        System.out.println("=============");

        /*
        * 链式编程：方法的返回值是一个对象，可以根据对象继续调用方法
        * */
        StringBuilder bu3 = new StringBuilder();
        bu3.append("abc").append(1).append(1.1).append('中').append(true);
        System.out.println(bu3);
    }
}
