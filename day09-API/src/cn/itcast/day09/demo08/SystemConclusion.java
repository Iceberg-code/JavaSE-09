package cn.itcast.day09.demo08;

public class SystemConclusion {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(time);
        System.out.println("===============");

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.arraycopy(arr1, 0, arr2, 0, 4);  //注意arr2是目标数组
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println("\n" + "================");
        int[] arr3 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.arraycopy(arr1, 0, arr3, 5, 4);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
