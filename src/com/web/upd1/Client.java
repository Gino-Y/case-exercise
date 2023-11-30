package com.web.upd1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

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

        byte[] bytes = "我是客户端，我发韭菜了".getBytes();
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 6666);

        // 3. 发送数据（把韭菜盘子放到快递车上）
        socket.send(packet);

        // 4. 关闭资源（关闭快递车）
        System.out.println("客户端数据发送完毕~");
        socket.close();
    }
}
