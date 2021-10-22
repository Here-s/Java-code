<<<<<<< HEAD
import java.util.*;

public class Main {

    //找出只出现一次的数
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,3,1};
        int sum = arr[0];
        for(int i = 0; i < arr.length; i++){
            sum ^= arr[i];
        }
        System.out.println(sum);
    }

    //求二进制1的个数。
    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for(int i = 0; i < 32; i++){
            if((n & 1) == 1){
                count++;
            }
            n >>= 1;
        }
        System.out.println(count);
    }

    //输出 0 - 999 之间的水仙花数
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            int count = 1;
            int k = i;
            //用 count 求位数
            while(k / 10 != 0){
                count++;
                k /= 10;
            }
            k = i;
            double num = 0;
            int sum = 0;
            //求每位的平方和
            int ret = count;
            while(count != 0){
                num = Math.pow(k % 10, ret);
                sum += num;
                count--;
                k /= 10;
            }
            if(sum == i){
                System.out.print(i+" ");
            }
        }
    }


    //输出n*n的乘法口诀表
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }

    //输出一个整数的每一位，如：123的每一位是1 2 3
    public static void print(int n) {
        if (n > 9) {
            print(n / 10);
        }
        System.out.print(n % 10 + " ");
    }

    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        print(n);
    }

    //编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”
    //密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
    public static void login() {
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        String password = "123456";
        while (count > 0) {
            System.out.println("请输入登陆密码");
            String input = scanner.nextLine();
            if (input.equals(password)) {
                System.out.println("登陆成功");
                break;
            } else {
                count--;
                System.out.println("密码错误，请重新输入，还有 " + count + " 次机会");
            }
        }
    }

    public static void main2(String[] args) {
        login();
    }

    //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("偶数位：");
        for (int i = 30; i >= 0; i -= 2) {
            System.out.print((n >> i) & 1);
        }
        System.out.println();
        System.out.println("奇数位：");
        for (int i = 31; i >= 0; i -= 2) {
            System.out.print((n >> i) & 1);
        }
    }
}
=======
import java.util.*;

public class Main {

    //找出只出现一次的数
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,3,1};
        int sum = arr[0];
        for(int i = 0; i < arr.length; i++){
            sum ^= arr[i];
        }
        System.out.println(sum);
    }

    //求二进制1的个数。
    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for(int i = 0; i < 32; i++){
            if((n & 1) == 1){
                count++;
            }
            n >>= 1;
        }
        System.out.println(count);
    }

    //输出 0 - 999 之间的水仙花数
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            int count = 1;
            int k = i;
            //用 count 求位数
            while(k / 10 != 0){
                count++;
                k /= 10;
            }
            k = i;
            double num = 0;
            int sum = 0;
            //求每位的平方和
            int ret = count;
            while(count != 0){
                num = Math.pow(k % 10, ret);
                sum += num;
                count--;
                k /= 10;
            }
            if(sum == i){
                System.out.print(i+" ");
            }
        }
    }


    //输出n*n的乘法口诀表
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }

    //输出一个整数的每一位，如：123的每一位是1 2 3
    public static void print(int n) {
        if (n > 9) {
            print(n / 10);
        }
        System.out.print(n % 10 + " ");
    }

    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        print(n);
    }

    //编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”
    //密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
    public static void login() {
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        String password = "123456";
        while (count > 0) {
            System.out.println("请输入登陆密码");
            String input = scanner.nextLine();
            if (input.equals(password)) {
                System.out.println("登陆成功");
                break;
            } else {
                count--;
                System.out.println("密码错误，请重新输入，还有 " + count + " 次机会");
            }
        }
    }

    public static void main2(String[] args) {
        login();
    }

    //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("偶数位：");
        for (int i = 30; i >= 0; i -= 2) {
            System.out.print((n >> i) & 1);
        }
        System.out.println();
        System.out.println("奇数位：");
        for (int i = 31; i >= 0; i -= 2) {
            System.out.print((n >> i) & 1);
        }
    }
}
>>>>>>> 4886dd884e79977758744274aaf8326ea7ae3755
