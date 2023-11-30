package com.web.upd2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        // 1. 创建客户端对象（发韭菜出去的人）
        DatagramSocket socket = new DatagramSocket();

        // 2. 创建数据包对象封装要发出去的数据（创建一个韭菜盘子）
        /*
        参数一：要发出去的数据
        参数二：要发出去的数据的长度
        参数三：接收端的IP地址对象
        参数四：接收端的端口号
         */
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要发送的数据：");
            String smg = sc.nextLine();
            // 一旦用户输入了exit，就退出程序
            if ("exit".equals(smg)) {
                //输出提示信息
                System.out.println("程序退出，再见！");
                //释放资源
                socket.close();
                break;
            }
            byte[] bytes = smg.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 6666);

            // 3. 发送数据（把韭菜盘子放到快递车上）
            socket.send(packet);
        }

    }
}
