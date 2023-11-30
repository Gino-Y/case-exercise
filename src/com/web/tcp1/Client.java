package com.web.tcp1;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception{
        // 1、创建Socket对象，并指定要连接的服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1", 8888);

        // 2、获取输出流，向服务器发送数据
        OutputStream os = socket.getOutputStream();

        // 3、把数据写入到输出流中
        DataOutputStream dos = new DataOutputStream(os);

        // 4、开始写数据出去了
        dos.writeUTF("Hello, Server! I'm Client.");

        // 5、关闭流
        dos.close();

        // 6、关闭Socket
        socket.close();

        System.out.println("客户端发送数据完毕！");
    }
}
