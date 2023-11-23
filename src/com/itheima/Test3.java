package com.itheima;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 这个类表示一个计算一组选手平均分的程序。
 * 它提示用户输入每个选手的分数，直到用户输入-1为止。
 * 程序验证分数以确保它们在0到100之间
 * 然后，它通过排除最高分和最低分来计算平均分。
 */
public class Test3 {
    /**
     * 程序的主方法。
     * 它提示用户输入每个选手的分数，直到用户输入-1为止。
     * 它验证分数并计算平均分。
     * 最后，它打印平均分。
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        List<Double> scores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("请输入选手的成绩（输入-1结束录入）：");
                double score = scanner.nextDouble();
                if (score == -1) {
                    break;
                }
                if (isValidScore(score)) {
                    scores.add(score);
                } else {
                    System.out.println("请输入0~100之间的数字！");
                }
            } catch (Exception e) {
                System.out.println("请输入有效的数字！");
                scanner.nextLine(); // 清空输入缓冲区
            }
        }

        double averageScore = calculateAverageScore(scores);
        System.out.println("平均分为：" + averageScore);
    }

    /**
     * 计算一组选手的平均分。
     * 它排除最高分和最低分进行计算。
     *
     * @param scores 分数列表
     * @return 平均分
     */
    private static double calculateAverageScore(List<Double> scores) {
        if (scores.size() <= 2) {
            return 0;
        }

        double sum = 0;
        double maxScore = Collections.max(scores);
        double minScore = Collections.min(scores);

        for (double score : scores) {
            if (score != maxScore && score != minScore) {
                sum += score;
            }
        }

        return sum / (scores.size() - 2);
    }

    /**
     * 检查分数是否有效。
     * 有效分数在0到100之间。
     *
     * @param score 要检查的分数
     * @return 如果分数有效则返回true，否则返回false
     */
    private static boolean isValidScore(double score) {
        return score >= 0 && score <= 100;
    }
}
