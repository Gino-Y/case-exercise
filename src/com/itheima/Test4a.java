package com.itheima;

public class Test4a {
    public static void main(String[] args) {
        int number = 1983;
        String encryptedNumber = encrypt(number);
        System.out.println("加密后的结果是: " + encryptedNumber);

    }

    public static String encrypt(int number) {
        // number = 1983
        // 1. 把密码拆分成单独的数字
        int[] numbers = split(number);
        // numbers = [1, 9, 8, 3]

        // 2. 遍历这个数组中的每个数字，对其进行加密处理
        for (int i = 0; i < numbers.length; i++) {
            //i = 0 1 2 3
            numbers[i] = (numbers[i] + 5) % 10;
        }
        // numbers = [6, 4, 3, 8]

        // 3. 开发一个独立的方法把这个数组中的数字反转
        reverse(numbers);
        // numbers = [8, 3, 4, 6]

        // 4. 把反转后的数字拼接起来作为结果返回
        String data = "";
        for (int i = 0; i < numbers.length; i++) {
            data += numbers[i];
        }
        // data = "8346"
        return data;
    }

    public static int[] split(int number) {
        int[] numbers = new int[4];
        numbers[0] = number / 1000;
        numbers[1] = number / 100 % 10;
        numbers[2] = number / 10 % 10;
        numbers[3] = number % 10;

        return numbers;
    }

    public static void reverse(int[] numbers) {
        for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;

        }
    }
}
