package demo;

public class shuzu {
    //    一维数组
    int[] a;
    int[][] b;

    protected void one() {
        a = new int[]{1, 2, 3};
        for (int i : a) {
            System.out.println(i);
        }
    }

    //二维数组
    protected void two() {
        b = new int[][]{{1, 1}, {2, 2}, {3, 3}};
        for (int[] j : b) {
            for (int k : j) {
                System.out.println(k);
            }
        }
    }

    public static void main(String[] args) {
        // write your code here
        shuzu shuzu = new shuzu();
        shuzu.one();
        shuzu.two();
    }

}
