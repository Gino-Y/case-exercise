package com.web.tcp1;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args)  throws Exception{
        System.out.println("----服务器启动------------！");
        // 1、创建ServerSocket对象，并指定监听的端口号
        ServerSocket serverSocket = new ServerSocket(8888); // 8888是端口号

        // 2、调用accept()方法，等待客户端的连接
        Socket socket = serverSocket.accept(); // 阻塞方法

        // 3、获取输入流，读取客户端发送的数据
        InputStream is = socket.getInputStream(); // 字节输入流

        // 4、把输入流包装成DataInputStream
        DataInputStream dis = new DataInputStream(is); // 字符输入流

        // 5、使用readUTF()方法读取数据
        String msg = dis.readUTF(); // 阻塞方法

        // 6、打印数据
        System.out.println(socket.getRemoteSocketAddress() + "_：" + msg);

        // 7、关闭流
        dis.close();

        // 8、关闭Socket
        socket.close();



        System.out.println("服务器端接收数据完毕！");
    }
}
