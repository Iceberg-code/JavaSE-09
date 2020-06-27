package cn.itcast.day09.demo09;
/*
* 基本类型与字符串之间的转换
* 基本类型 --> 字符串
*       1、基本类型数据的值 + "" ：最简单的方式（工作中常用）
*       2、使用包装类中的静态方法
*           static String toString(int i)：返回一个表示指定整数的String对象
*       3、使用String类中的静态方法
*           static String valueOf(int i)：返回int参数的字符串表示形式
* 字符串 --> 基本类型      （注意Character包装类除外）
*       使用包装类的静态方法parseXxx("字符串")
*           Integer类：   static int parseInt(String s)
*           Double类：    static double parseDouble(String s)
*           ...
* */
public class Demo03Integer {
    public static void main(String[] args) {
        //基本类型 --> 字符串：基本类型数据的值 + ""
        String str1 = 100 + "";  //加""，转换为字符串
        System.out.println(str1 + 100);  //100100
        System.out.println("============");

        //基本类型 --> 字符串：使用包装类中的静态方法
        String str2 = Integer.toString(100);
        System.out.println(str2 + 200); //100200
        System.out.println("============");

        //基本类型 --> 字符串：使用String类中的静态方法
        String str3 = String.valueOf(100);
        System.out.println(str3 + 300); //100300
        System.out.println("============");


        //字符串 --> 基本类型
        int i = Integer.parseInt("100");
        System.out.println(i + 200);    //300

//        int i1 = Integer.parseInt("a");
//        System.out.println(i1); //NumberFormatException -  数字格式化异常

    }
}
