package cn.itcast.day09.demo01;

import java.util.Objects;

public class Demo05Equals {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        //比较内容，而且区分大小写
        System.out.println(s1.equals(s2));  //ture

        System.out.println("=================");

        Student stu1 = new Student("狂鼠", 10);
        Student stu2 = new Student("狂鼠", 10);
        //重写equals方法前，返回false
//        System.out.println(stu1.equals(stu2));  //false - 因为Student类未重写equals方法，调用父类即Object类的equals方法，
                                                //比较引用数据类型，比较的是地址值；比较基本数据类型，比较的是值

        //此时，认为同姓名和同年龄就是同一个人，这就需要重写Student类中的equals方法
        System.out.println(stu1.equals(stu2));  //重写equals后，返回true
        System.out.println(Objects.equals(stu1, stu2));
    }
}
