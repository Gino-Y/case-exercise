package com.itheima;

import java.util.Random; // Add import statement for Random

public class Test2 {
    public static void main(String[] args) {
        String code = createCode(10);
        System.out.println(code);
    }

    public static String createCode(int n){
        Random r = new Random();

        StringBuilder code = new StringBuilder();
        for(int i = 0; i < n; i++){
            int type = r.nextInt(3); // 0 1 2
            switch(type){
                case 0:
                    // 生成随机数字
                    int num = r.nextInt(10); // 0-9
                    code.append(num);
                    break;
                case 1:
                    // 生成随机小写字母
                    int lower = r.nextInt(26); // 0-25
                    char lowerChar = (char)('a' + lower);
                    code.append(lowerChar);
                    break;
                case 2:
                    // 生成随机大写字母
                    int upper = r.nextInt(26); // 0-25
                    char upperChar = (char)('A' + upper);
                    code.append(upperChar);
                    break;
            }
        }
        return code.toString();
    }
}
