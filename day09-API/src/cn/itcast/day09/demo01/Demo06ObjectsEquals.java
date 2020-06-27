package cn.itcast.day09.demo01;

import java.util.Objects;

public class Demo06ObjectsEquals {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "abc";
//        System.out.println(s1.equals(s2));  //true

        boolean result = Objects.equals(s1, s2);
        System.out.println(result); //false

    }
}
