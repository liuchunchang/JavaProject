public class main {
    public static void main(String[] args) {
//         write your code here
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("连接数据库...");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
