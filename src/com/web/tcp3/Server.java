package com.web.tcp3;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args)  throws Exception{
        System.out.println("----服务器启动------------！");
        // 1、创建ServerSocket对象，并指定监听的端口号
        ServerSocket serverSocket = new ServerSocket(8888); // 8888是端口号

        while (true) {
            // 2、调用accept()方法，等待客户端的连接
            Socket socket = serverSocket.accept(); // 阻塞方法

            System.out.println((socket.getRemoteSocketAddress() + "_：" + "上线了！"));

            // 3、把这个客户端对应的socket交给一个独立的线程来处理
            new ServerReaderThread(socket).start();
        }


    }
}
