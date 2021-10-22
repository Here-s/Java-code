import java.util.*;
public class Main {

    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
    public static int sumAdd1(int n){
        if(n < 10){
            return n;
        }
        return n % 10 + sumAdd1(n/10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = sumAdd1(n);
        System.out.println(sum);
    }

    //递归求斐波那契第 n 项
    public static int fibn(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fibn(n - 1) + fibn(n - 2);
    }
    public static void main10(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = fibn(n);
        System.out.println(ret);
    }

    //青蛙跳台阶
    public static int frog(int n){
        if(n == 1 || n == 2){
            return n;
        }
        int a = 1;
        int b = 2;
        int c = 0;
        while(n > 2){
            c = a + b;
            a = b;
            b = c;
            n--;
        }
        return c;
    }
    public static void main9(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = frog(n);
        System.out.println(ret);
    }

    //求最大值方法的重载
    public static int maxV(int a, int b){
        return Math.max(a, b);
    }
    public static double maxV(double a, double b){
        return Math.max(a, b);
    }
    public static int maxV(int a, int b, int c){
        return Math.max(c, Math.max(a, b));
    }
    public static void main8(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(maxV(a , b));

        double d = 12.3;
        double d1 = 3.4;
        System.out.println(maxV(d , d1));
    }

    //求和方法的重载
    public static int add(int a, int b){
        return a + b;
    }
    public static double add(double a, double b){
        return a + b;
    }
    public static void main7(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(add(a , b));

        double d = 12.3;
        double d1 = 3.4;
        System.out.println(add(d , d1));
    }

    //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
    //要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
    public static int max(int m, int n, int k){
        return Math.max(k, Math.max(m, n));
    }
    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int ret = max(m, n, k);
        System.out.println(ret);
    }

    //调整数组顺序使得奇数位于偶数之前
    public static void reverse(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            if(arr[i] % 2 == 0){
                for(int j = arr.length - 1; j >= 0; j--){
                    if(arr[j] % 2 == 1){
                        int tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        }
    }
    public static void main5(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    //求 n 的阶乘
    public static int fact(int n){
        if(n == 0){
            return 0;
        }
        int ret = 1;
        for(int i = 1; i <= n; i++){
            ret *= i;
        }
        return ret;
    }
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = fact(n);
        System.out.println(sum);
    }

    //求阶乘 1 - n 的和
    public static int sumAdd (int n){
        if(n == 0){
            return 0;
        }
        int sum = 0;
        int ret = 1;
        for(int i = 1; i <= n; i++){
            ret *= i;
            sum += ret;
        }
        return sum;
    }
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = sumAdd(n);
        System.out.println(sum);
    }

    //循环实现斐波那契数列
    public static int fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        int a = 1;
        int b = 1;
        int c = 0;
        while (n >= 3){
            c = a + b;
            a = b;
            b = c;
            n--;
        }
        return c;
    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = fib(n);
        System.out.println(ret);
    }

    //找出只出现一次的数字  可以用按位异或
    //因为两个一样的数 按位异或的结果是 0
    public static void main1(String[] args) {
        int[] arr = new int[]{1,2,3,2,1};
        int ret = 0;
        for(int i = 0; i < arr.length; i++){
            ret ^= arr[i];
        }
        System.out.println(ret);
    }
}
