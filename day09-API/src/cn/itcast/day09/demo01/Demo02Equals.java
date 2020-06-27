package cn.itcast.day09.demo01;

import java.util.Random;

/*
* Person类默认继承了Object类，所以可以使用Object类的equals方法
* boolean equals(Object obj)指示其他某个对象是否与此对象“相等”
* Object类equals方法的源码：
*       public boolean equals(Object obj) {
            return (this == obj);
        }
* 参数：
*       Object obj：可以传递任意的对象
* 方法体：
*       ==：比较运算符，返回的就是一个布尔值 true, false
*           基本数据类型：比较的是值
*           引用数据类型：比较的是两个对象的地址值
*   this是谁？哪那个对象调用的方法，方法中的this就是哪个对象；p1调用的是equals方法，所以this就是p1
*   obj是谁？传递过来的参数p2
*   this==obj --> p1==p2
* */
public class Demo02Equals {
    public static void main(String[] args) {
        Person p1 = new Person("安娜", 10);
        Person p2 = new Person("安娜", 10);
//        Person p2 = new Person("源氏", 11);
//        p1 = p2;
        System.out.println("p1:" + p1);
        System.out.println("p2:" + p2);

        Random r = new Random();
        boolean b = p1.equals(p2);  //Person类重写了equals方法，比较两个对象的属性，而不是地址值
        System.out.println(b);

    }
}
