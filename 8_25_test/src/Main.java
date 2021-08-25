import java.util.*;

public class Main {

    public static int num(int n){
        int count = 0;
        while(n != 0){
            n &= (n - 1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        //求unsigned int 型变量x在内存当二进制的个数
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = num(a);
        System.out.println(n);
    }

    public static int fib(int n){
        int a = 1;
        int b = 1;
        int c = 0;
        if(n == 0){
            return 0;
        } else if (n == 1 || n == 2){
            return 1;
        } else {
            while(n > 2){
                c = a + b;
                a = b;
                b = c;
                n--;
            }
            return c;
        }
    }
    public static void main1(String[] args) {
        //用非递归方法求斐波那契数列
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = fib(n);
        System.out.println(num);
    }
}
