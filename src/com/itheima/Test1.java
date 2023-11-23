package com.itheima;

public class Test1 {
    public static void main(String[] args) {
        // 1、定义变量
        double price = 3542;
        int month = 3;
        String type = "经济舱";
        // 2、调用方法
        double result = calculate(price, month, type);
        // 3、输出结果
        System.out.println("最终票价为：" + result);

    }

    public static double calculate(double price, int month, String type){
        // 1、判断当月份淡旺季
        if (month >= 5 && month<= 10){
            //switch判断仓位类型
            switch (type){
                case "头等舱":
                    price *= 0.9;
                    break;
                case "商务舱":
                    price *= 0.8;
                    break;
                case "经济舱":
                    price *= 0.7;
                    break;
                default:
                    System.out.println("仓位类型输入错误");
                    break;
            }
        }else {
            //switch判断仓位类型
            switch (type){
                case "头等舱":
                    price *= 0.5;
                    break;
                case "商务舱":
                    price *= 0.4;
                    break;
                case "经济舱":
                    price *= 0.3;
                    break;
                default:
                    System.out.println("仓位类型输入错误");
                    break;
            }
        }
        return price;
    }
}
