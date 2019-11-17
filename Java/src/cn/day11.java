package cn;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class day11 {
    public static void main(String[] args) {
        // write your code here
        List<String> list = new ArrayList<>();
        String path = "D:\\CloudMusic\\";
        File file = new File(path);
        File[] files = file.listFiles();
        for(File f:files){
           list.add(f.getName());
        }
        System.out.println(list);
    }
}
