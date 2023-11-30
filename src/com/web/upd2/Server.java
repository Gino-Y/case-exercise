package com.web.upd2;


import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws Exception{
        System.out.println("------------服务端启动该-------------");
        // 1. 创建服务器端对象（接收韭菜的人）注册端口号
        DatagramSocket socket = new DatagramSocket(6666);

        // 2. 创建数据包对象，用来接收数据（创建一个韭菜盘子）
        byte[] bytes = new byte[1024 * 64]; // 用来接收数据的字节数组
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);

        while (true) {
            // 3. 接收数据（接韭菜）等待接收数据，如果没有数据，会阻塞
            socket.receive(packet);

            // 4. 解析数据包，并把数据在控制台显示（把韭菜盘子打开，看里面有什么）
            byte[] data = packet.getData();
            int length = packet.getLength();
            System.out.println(packet.getAddress().getHostAddress() + ":" + packet.getPort() + "_:  " + new String(data, 0, length));
            System.out.println("-----------------");
        }
    }

}
