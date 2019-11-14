package demo;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        // write your code here
        java.util.List<String> name = new ArrayList<>();
        name.add("liu");
        name.add("chun");
        name.add("chang");
        System.out.println(name);
        System.out.println(name.get(0));
        System.out.println(name.get(1));
        System.out.println(name.get(2));

    }
}
