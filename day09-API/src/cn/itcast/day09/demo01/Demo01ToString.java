package cn.itcast.day09.demo01;
/*
* 直接通过输出语句打印对象，默认就是调用该对象的toString()方法
* */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
* java.lang.Object类
* 类Object是类层次结构的根（最顶层）类，每个类都是用Object类作为父类
* 所有对象（包括数组都实现这个类的方法）
* */
public class Demo01ToString {
    public static void main(String[] args) {
        /*
        * Person类默认继承了Object类，所以可以使用Object类中的toString方法
        * String toString() 返回该对象的字符串表示
        * */
        Person person = new Person("狂鼠", 20);
        String s = person.toString();
        System.out.println(s);  //cn.itcast.day09.demo01.Person@75412c2f

        //直接打印对象的名字，其实就是调用对象的toString方法 - 未重写toString方法
        System.out.println(person); //cn.itcast.day09.demo01.Person@75412c2f

        /*
        * 看一个类是否重写了toString方法，直接打印这个类对应对象名字即可
        * 如果没有重写toString方法，那么打印的就是对象的地址值（默认）
        * 如果重写toString方法，那么就按照重写的方式打印
        * */
        Random r = new Random();
        System.out.println(r);  //未重写toString方法

        Scanner sc = new Scanner(System.in);
        System.out.println(sc); //Scanner类重写了toString方法

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);   //重写了toString方法
    }
}
