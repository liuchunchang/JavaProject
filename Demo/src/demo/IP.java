package demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IP {
    public static void main(String[] args) {
        // write your code here
        try {
//            获取域名绑定的IP
            InetAddress address=InetAddress.getByName("www.nfu.edu.cn");
            System.out.println(address.toString());
        } catch (UnknownHostException e) {
            e.printStackTrace();
            System.out.println("无法找到");
        }
    }
}
