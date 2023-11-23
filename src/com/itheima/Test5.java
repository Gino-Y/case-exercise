package com.itheima;

public class Test5 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {11,22,33,44,55};
        //调用copy方法，接收返回值
        int[] arr2 = copy(arr);

        printArray(arr2);

    }

    //定义一个方法，负责打印数组
    public static void printArray(int[] arr){
        //遍历数组
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            System.out.print((i == arr.length - 1 ? arr[i] : arr[i] + ","));
        }
        System.out.println("]");
    }

    public static int[] copy(int[] arr){
        //arr = {11,22,33,44,55};
        //创建一个长度一样的数组
        int[] arr2 = new int[arr.length];
        //遍历arr数组，将arr数组中的元素赋值给arr2数组
        for(int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }
        return arr2;
    }
}
