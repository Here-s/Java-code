import java.util.*;
public class Main {

    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        do {
            sum += num;
            num++;
        } while (num <= 100);
        System.out.println(sum);
    }

    public static void main33(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    public static void main32(String[] args) {
        int num = 100;
        while (num <= 200) {
            if (num % 3 != 0) {
                num++; // 这里的 ++ 不要忘记! 否则会死循环.
                continue;
            }
            System.out.println("找到了 3 的倍数, 为:" + num);
            num++;
        }
    }

    public static void main31(String[] args) {
        int num = 1;
        while (num <= 10) {
            if (num % 3 == 0) {
                System.out.println("找到了 3 的倍数 为:" + num);
                break;
            }
            num++;
        }
    }

    public static void main30(String[] args) {
        int num = 1;
        while (num <= 10)
            System.out.println(num);
        num++;
    }

    public static void main29(String[] args) {
        int n = 1;
        int sum = 0;
        while (n <= 10){
            sum += n;
            n++;
        }
        System.out.println(sum);
    }

    public static void main28(String[] args) {
        int day = 7;
        switch (day) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("此数字不属于星期");
                break;
        }
    }

    public static void main27(String[] args) {
        int x = 10;
        int y = 10;
        if (x == 20)
            if (y == 10)
                System.out.println("aaa");
            else
                System.out.println("bbb");
    }

    public static void main26(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
            System.out.println(i + " 是闰年");
        } else {
            System.out.println(i + " 不是闰年");
        }
    }

    public static void main25(String[] args) {
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println(max);
    }

    public static void main24(String[] args) {
        int a = 10;
        a = a >> 1;
        System.out.println(a);
    }

    public static void main23(String[] args) {
        int a = 10;
        a = a << 1;
        System.out.println(a);
    }

    public static void main22(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a | b);
    }

    public static void main21(String[] args) {
        int a = 10;//01010
        int b = 20;//10100
        System.out.println(a & b);
    }

    public static void main20(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(!(a < b));
    }

    public static void main19(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(a < b || b < c);
    }

    public static void main18(String[] args) {
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

    public static int search(int[] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main15(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int a = scanner.nextInt();
        int ret = search(arr, a);
        System.out.println(ret);
    }

    public static long sum(long n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
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
        System.out.println(str + str1);
        System.out.println(str + 123);
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
        System.out.println(num);
        System.out.println(Integer.MAX_VALUE);  // int 的最大值
        System.out.println(Integer.MIN_VALUE);  // int 的最小值
    }
}
