package demo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        // write your code here
        String[] answer={"南非","进入世界杯了","哈哈....问题真逗！"};
        ServerSocket serverSocket=null;
        Socket socket=null;
        DataOutputStream out=null;
        DataInputStream in=null;
        try {
            serverSocket = new ServerSocket(2010);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("等待客户呼叫");
            socket=serverSocket.accept();
            out=new DataOutputStream(socket.getOutputStream());
            in=new DataInputStream(socket.getInputStream());
            for (int i=0;i<answer.length;i++){
                String s=in.readUTF();
                System.out.println("客户的提问：\t"+s);
                Thread.sleep(1000);
                System.out.println("服务器的回答:\t"+answer[i]);
                out.writeUTF(answer[i]);
                Thread.sleep(1000);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}
