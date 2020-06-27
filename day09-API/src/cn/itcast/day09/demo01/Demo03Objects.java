package cn.itcast.day09.demo01;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String a1 = null;
        String a2 = "aaa";

        boolean b1 = a1.equals(a2);  //NullPointerException - null是不能调用方法的，会抛出空指针异常
        System.out.println(b1);

        /*
        * Objects类的equals方法：对两个对象进行比较，防止空指针异常
            public static boolean equals(Object a, Object b) {
            return (a == b) || (a != null && a.equals(b));
        }
        * */
        boolean b2 = Objects.equals(a1, a2); //针对String类型防止出现空指针异常，来进行Objects.equals进行比较
        System.out.println(b2);
    }
}
