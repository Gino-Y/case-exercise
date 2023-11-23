package com.itheima;

import java.util.Random; // 添加 Random 的导入语句

/**
 * 该类用于生成由数字、小写字母和大写字母组成的随机代码。
 */
public class Test2 {
    /**
     * Test2 类的主方法。
     * 它生成一个随机代码并将其打印到控制台。
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        String code = createCode(10);
        System.out.println(code);
    }

    /**
     * 生成指定长度的随机代码。
     *
     * @param n 代码的长度
     * @return 随机生成的代码
     */
    public static String createCode(int n){
        Random r = new Random();

        StringBuilder code = new StringBuilder();
        for(int i = 0; i < n; i++){
            int type = r.nextInt(3); // 0 1 2
            switch(type){
                case 0:
                    // 生成一个随机数字
                    int num = r.nextInt(10); // 0-9
                    code.append(num);
                    break;
                case 1:
                    // 生成一个随机小写字母
                    int lower = r.nextInt(26); // 0-25
                    char lowerChar = (char)('a' + lower);
                    code.append(lowerChar);
                    break;
                case 2:
                    // 生成一个随机大写字母
                    int upper = r.nextInt(26); // 0-25
                    char upperChar = (char)('A' + upper);
                    code.append(upperChar);
                    break;
            }
        }
        return code.toString();
    }
}
