package com.web.tcp2;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception{
        // 1、创建Socket对象，并指定要连接的服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1", 8888);

        // 2、获取输出流，向服务器发送数据
        OutputStream os = socket.getOutputStream();

        // 3、把数据写入到输出流中
        DataOutputStream dos = new DataOutputStream(os);

        Scanner sc = new Scanner(System.in);
        while (true) {
            // 4、开始写数据出去了
            System.out.println("请输入要发送的数据：");
            String msg = sc.nextLine();
            // 一旦用户输入了exit，就退出程序
            if ("exit".equals(msg)) {
                //输出提示信息
                System.out.println("程序退出，再见！");
                //释放资源
                dos.close();
                socket.close();
                break;
            }
            dos.writeUTF(msg);
            dos.flush();
        }
    }
}
