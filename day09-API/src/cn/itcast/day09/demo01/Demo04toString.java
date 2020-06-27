package cn.itcast.day09.demo01;
/*
* 直接通过输出语句打印对象，默认就是调用该对象的toString()方法
* */
public class Demo04toString {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str.toString());    //等价于：System.out.println(str.toString());   打印出abc

        Student stu = new Student("安娜", 10);

                /*
        * Object类的toString方法
                public String toString() {
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
            }
        * */
        //getClass().getName() ： 返回包名和类名
//       System.out.println(stu);  等价于   System.out.println(stu.toString());

        //重写了Student的toString方法后
        System.out.println(stu.toString());    //cn.itcast.day09.demo01.Student@75412c2f

    }



}
