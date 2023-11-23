package com.itheima;

import java.util.Scanner;

public class Test3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的人数：");
        int number = sc.nextInt();
        double averageScore = getAverageScore(number);
        System.out.println("去掉一个最高分" + "去掉一个最低分" + "平均分为：" + averageScore);

    }

    public static double getAverageScore(int number){
        //1.定义一个动态数组，负责后期存入成绩
        int[] scores = new int[number]; //定义一个长度为number的数组

        //2.遍历数组，给数组中的每个元素赋值
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < scores.length; i++){
            System.out.println("请输入第" + (i + 1) + "个学生的成绩：");
            scores[i] = sc.nextInt();
        }

        //3.遍历数组，算出总和并找出最高分和最低分
        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        for (int score : scores) {
            sum += score;
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
        }

        //4.计算平均分并返回
        return (sum - max - min) / (scores.length - 2) * 1.0;
    }
}
