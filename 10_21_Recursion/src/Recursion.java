<<<<<<< HEAD
import java.util.Scanner;

public class Recursion {

    //青蛙跳台阶  一个青蛙一次可能跳一节台阶，也可能一次跳两个台阶
    //也就是变相的斐波那契数列

    //斐波那契数列  面试的时候 一定要写循环 不要写递归
    public static int fib(int n){
        if(n == 1 || n ==2){
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    public static void main4(String[] args) {
        int ret = fib(4);
        System.out.println(ret);
    }

    //输入一个数字 返回所以数字的和
    public static int sumEverone(int n){
        if(n < 10){
            return n;
        } else {
            return n % 10 + sumEverone(n / 10);
        }
    }
    public static void main3(String[] args) {
        int sum = sumEverone(1789);
        System.out.println(sum);
    }

    //按照顺序打印一个数的每一位
    public static void print(int n){
        if(n == 0){
            return;
        }
        print(n / 10);
        System.out.println(n % 10);
    }
    public static void main2(String[] args) {
        print(1024);
    }

    //方法自己调用自己，就是递归
    //1 有一个趋近于终止的条件
    //2 实现递归要去推导出一个递推公式

    //递归是：递下去，归回来

    //求 1-n 的和
    public static int sumAdd(int n){
        if(n == 0){
            return n;
        }
        return n + sumAdd(n - 1);
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = sumAdd(n);
        System.out.println(sum);
    }
}
=======
import java.util.Scanner;

public class Recursion {

    //青蛙跳台阶  一个青蛙一次可能跳一节台阶，也可能一次跳两个台阶
    //也就是变相的斐波那契数列

    //斐波那契数列  面试的时候 一定要写循环 不要写递归
    public static int fib(int n){
        if(n == 1 || n ==2){
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    public static void main4(String[] args) {
        int ret = fib(4);
        System.out.println(ret);
    }

    //输入一个数字 返回所以数字的和
    public static int sumEverone(int n){
        if(n < 10){
            return n;
        } else {
            return n % 10 + sumEverone(n / 10);
        }
    }
    public static void main3(String[] args) {
        int sum = sumEverone(1789);
        System.out.println(sum);
    }

    //按照顺序打印一个数的每一位
    public static void print(int n){
        if(n == 0){
            return;
        }
        print(n / 10);
        System.out.println(n % 10);
    }
    public static void main2(String[] args) {
        print(1024);
    }

    //方法自己调用自己，就是递归
    //1 有一个趋近于终止的条件
    //2 实现递归要去推导出一个递推公式

    //递归是：递下去，归回来

    //求 1-n 的和
    public static int sumAdd(int n){
        if(n == 0){
            return n;
        }
        return n + sumAdd(n - 1);
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = sumAdd(n);
        System.out.println(sum);
    }
}
>>>>>>> 4886dd884e79977758744274aaf8326ea7ae3755
