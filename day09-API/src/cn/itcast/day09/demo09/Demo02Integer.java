package cn.itcast.day09.demo09;

import java.util.ArrayList;

/*
* 自动装箱与自动拆箱：
*       基本类型的数据和包装类之间可以自动的相互转换
*       JDK 1.5+ 之后出现的新特性
* */
public class Demo02Integer {
    public static void main(String[] args) {
        /*
        * 自动装箱：直接把int类型的整数赋值给包装类
        * Integer in1 = 1;  相当于  Integer in1 = new Integer(1);
        * */
        Integer in = 1;

        /*
        * 自动拆箱：in是包装类，无法直接参与运算，可以自动转换为基本类型的数据，在参与计算
        * in + 2;  相当于  in.intValue() + 2;   结果就是int类型的3
        * in = in + 2;   相当于   in = new Integer(3);   自定装箱
        * */
        in = in + 2;
        System.out.println(in);

        //ArrayList集合无法直接存储整数，可以存储Integer包装类
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);    //自动装箱：list.add(new Integer(1));

//        Integer integer = list.get(0);    快捷键返回的是Integer类

        //用int类型接受也可以
        int a = list.get(0);    //自动拆箱：list.get(0).intValue();
    }
}
