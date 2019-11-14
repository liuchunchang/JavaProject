package demo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        // write your code here
        String [] mess={"2010世界杯在哪举行？","巴西进入世界杯了吗？","中国进入世界杯了吗？"};
        Socket mysocket;
        DataInputStream in=null;
        DataOutputStream out =null;
        try {
            mysocket=new Socket("127.0.0.1",2010);
            in =new DataInputStream(mysocket.getInputStream());
            out=new DataOutputStream(mysocket.getOutputStream());
            for(int i=0;i<mess.length;i++){
                System.out.println("客户的提问:\t"+mess[i]);
                out.writeUTF(mess[i]);
                String s=in.readUTF();
                Thread.sleep(1000);
                System.out.println("服务器的回答：\t"+s);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("服务器已断开"+e);
        }
    }
}
