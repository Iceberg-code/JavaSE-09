package cn.itcast.day09.demo08;

public class StringBuilderConclusion {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        //append方法
        sb1.append("abc");
        sb1.append(1);
        sb1.append(5.5);
        sb1.append('哦');
        sb1.append(true);
        //toString方法
        System.out.println(sb1);
        System.out.println("============");

        StringBuilder sb2 = new StringBuilder();
        //append方法
        sb2.append("Hello").append("World").append("Java");
        System.out.println(sb2);

        //reverse反转方法
        StringBuilder reverse = sb2.reverse();
        System.out.println(reverse);
    }
}
