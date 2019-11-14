package demo;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class BroadCast {
    String s = "双十一数据造假了吗？";
    int port = 5858;
    InetAddress group = null;
    MulticastSocket socket = null;
    BroadCast(){
        try {
            group=InetAddress.getByName("239.255.8.0");
            socket=new MulticastSocket(port);
            socket.setTimeToLive(1);
            socket.joinGroup(group);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void play(){
        while (true){
            try{
                DatagramPacket packet=null;
                byte data[]=s.getBytes();
                packet=new DatagramPacket(data,data.length,group,port);
                System.out.println(new String(data));
                socket.send(packet);
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // write your code here
        new BroadCast().play();
    }
}
