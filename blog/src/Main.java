import java.util.*;
public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(a < b && b < c);
    }

    public static void main17(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);
    }

    public static void main16(String[] args) {
        int a = 10;
        int b = ++a;
        System.out.println(b);
        int c = a++;
        System.out.println(c);
        System.out.println(a);
    }

    public static int search(int[] arr, int a){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == a){
                return i + 1;
            }
        }
        return -1;
    }
    public static void main15(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int a = scanner.nextInt();
        int ret = search(arr, a);
        System.out.println(ret);
    }

    public static long sum(long n){
        long sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    public static void main14(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long ret = sum(n);
        System.out.println(ret);
    }

    public static void main13(String[] args) {
        System.out.println(11.5 % 2.0);
    }

    public static void main12(String[] args) {
        int a = 1;
        int b = 0;
        System.out.println(a / b);
    }

    public static void main11(String[] args) {
        String str = "Lockey";
        String str1 = "qwer";
        System.out.println(str+str1);
        System.out.println(str+123);
    }

    public static void main10(String[] args) {
        String name = "Lockey";
        System.out.println(name);
    }

    public static void main9(String[] args) {
        boolean value = true;
        System.out.println(value);
    }

    public static void main8(String[] args) {
        short value = 10;
        System.out.println(value);
    }

    public static void main7(String[] args) {
        byte value = 10;
        System.out.println(value);
    }

    public static void main6(String[] args) {
        char ch = 'A';
        System.out.println(ch);
    }

    public static void main5(String[] args) {
        double num = 1.1;
        System.out.println(num * num);
    }

    public static void main4(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a / b);
    }

    public static void main3(String[] args) {
        float a = 1.0f;
        System.out.println(a);
    }

    public static void main2(String[] args) {
        long a = Long.MAX_VALUE;
        long b = Long.MIN_VALUE;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main1(String[] args) {
        int num = 10;
        System.out.println(num) ;
        System.out.println(Integer.MAX_VALUE);  // int 的最大值
        System.out.println(Integer.MIN_VALUE);  // int 的最小值
    }
}
