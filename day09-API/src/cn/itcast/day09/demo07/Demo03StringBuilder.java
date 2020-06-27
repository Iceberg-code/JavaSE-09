package cn.itcast.day09.demo07;
/*
* StringBuilder和String之间可以相互转换：
*       String -> StringBuilder：可以使用StringBuilder的构造方法：
*           StringBuilder(String str)：构造一个字符串生成器，并初始化为指定的字符串内容
*       StringBuilder -> String：可以使用StringBuilder中的toString方法
* */
public class Demo03StringBuilder {
    public static void main(String[] args) {
        //String -> StringBuilder
        String str = "Hello";
        System.out.println("str:" + str);
        StringBuilder bu = new StringBuilder(str);  //将String变换为StringBuilder
        //往StringBuilder中添加数据
        bu.append("World");
        System.out.println("bu:" + bu);
        System.out.println("================");

        //StringBuilder -> String
        String s = bu.toString();
        System.out.println("s:" + s);
    }
}
