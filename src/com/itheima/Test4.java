package com.itheima;

public class Test4 {
    public static void main(String[] args) {
        int number = 76390;
        int encryptedNumber = encryptNumber(number);
        System.out.println("Encrypted number: " + encryptedNumber);
    }

    // 加密数字的方法
    public static int encryptNumber(int number) {
        int reversedNumber = reverseNumber(number);
        int encryptedNumber = 0;
        int multiplier = 1;

        while (reversedNumber > 0) {
            int digit = (reversedNumber % 10 + 5) % 10;
            encryptedNumber += digit * multiplier;
            multiplier *= 10;
            reversedNumber /= 10;
        }

        return encryptedNumber;
    }

    // 反转数字的方法
    public static int reverseNumber(int number) {
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }
}
