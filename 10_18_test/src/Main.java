import java.util.*;
public class Main {

    //求二进制的1的个数 阿里巴巴面试题版本
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while(n != 0){
            n &= (n - 1);
            count++;
        }
        System.out.println(count);
    }

    //求二进制1的个数。
    public static void main5(String[] args) {
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

    //求两个正整数的最大公约数
    public static void main4(String[] args) {
        //辗转相除法
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int c = Math.min(n, m);
        while(n % m != 0){
            c = n % m;
            n = m;
            m = c;
        }
        System.out.println(c);
    }

    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
    public static void main3(String[] args) {
        double sum = 0;
        int flag = 1;
        for(int i = 1; i <= 100 ; i ++){
            sum += (1.0 / i) * flag;
            flag = -flag;
        }
        System.out.println(sum);
    }

    //求 0~999 的水仙花数
    public static void main2(String[] args) {
        for(int i = 0; i < 1000; i++){
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

    //猜数字游戏
    public static void main1(String[] args) {
        //猜数字
        System.out.println("猜数字游戏");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int num = random.nextInt(100);
        while(true){
            System.out.println("请输入要猜的数字");
            int guess = scanner.nextInt();
            if(guess == num){
                System.out.println("恭喜你，猜对了");
                break;
            } else if(guess < num){
                System.out.println("猜小了");
            } else{
                System.out.println("猜大了");
            }
        }
    }
}
