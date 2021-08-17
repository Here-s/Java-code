import java.util.*;


public class test {

    public static int sum3(int n){
        if(n < 10){
            return n;
        }
        return n % 10 + sum3(n / 10);
    }
    public static void main(String[] args) {
        //写一个递归方法 输入一个非负整数 返回组成他的数字之和 例如 输入1729  则返回1+7+2+9 他的和是19
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = sum3(n);
        System.out.println(ret);
    }

    public static int sum2(int n){
        if(n > 1){
            return n + sum2(n - 1);
        }else{
            return 1;
        }
    }
    public static void main7(String[] args) {
        //递归求 1加到10
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = sum2(n);
        System.out.println(ret);
    }

    public static void func1(int n){
        if(n > 9){
            func1(n / 10);
        }
        System.out.print(n % 10);
        System.out.println();
    }
    public static void main6(String[] args) {
        //递归打印 123 的每一位
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        func1(n);
    }

    public static int factor2(int n){
        if(n == 1){
            return 1;
        } else{
            return n * factor2(n - 1);
        }
    }

    public static void main5(String[] args) {
        //递归求 n 的阶乘
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factor2(n));
    }

    public static int sum(int a, int b){
        return a+b;
    }
    public static double sum(double a, double b){
        return a+b;
    }

    public static void main4(String[] args) {
        //写一个重载的方法 重载就是方法名相同 参数个数 返回类型 返回值可以不一样
        int a = 10;
        int b = 20;
        System.out.println(sum(a, b));
        double c = 30;
        double d = 40;
        System.out.println(sum(c, d));
    }

    public static int factor(int n){
        int ret = 1;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            ret *= i;
            sum += ret;
        }
        return sum;
    }

    public static void main3(String[] args) {
        //写一个方法 求 1 - n 的阶乘的和
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factor(n));
    }

    public static int sumNum(int a, int b){
        return a + b;
    }

    public static void main2(String[] args) {

        //实现一个方法实现两个整数的相加
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int ret = sumNum(a, b);
        System.out.println(ret);
        System.out.println(sumNum(3,4));
    }

    public static int maxNum(int a, int b) {
        return a > b ? a : b;
    }

    public static int threeNum(int a, int b, int c){
        return maxNum(maxNum(a, b), c);
    }
    public static void main1(String[] args) {

        //写一个方法判断三个数的大小
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int ret = threeNum(a, b, c);
//        System.out.println(ret);

        //写一个方法来判断两个数的大小
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int ret = maxNum(a, b);
//        System.out.println(ret);


        //获取一个二进制序列中所以的偶数位和奇数位 分别输出二进制序列
        //0000 0110 这个数是6  要求是多少 那么肯定要按位与一个1 因为这样就知道是1 还是0
        //所以继续左移就好了 下标是0 最左边的下标是31
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        for(int i = 30; i >= 0; i -= 2){
//            System.out.print(1 & (num >> i));
//        }
//        System.out.println();
//        for(int i = 31; i >= 1; i -= 2){
//            System.out.print(1 & (num >> i));
//        }
//        System.out.println();

        //改进的方法求二进制中 1 的个数
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int count = 0;
//        while(num != 0){
//            num &= (num - 1);
//            count++;
//        }
//        System.out.println(count);

        //写一个函数返回参数二进制中1的个数 比如 15  00001111 返回4个1  就是判断每一个位
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int count = 0;
//        int i = 32;
//        while(i > 0){
//            if((num & 1) == 1){
//                count++;
//            }
//            num >>= 1;
//            i--;
//        }
//        System.out.println(count);
    }
}
//    public static void main(String[] args) {
////    使用指针方式实现两个字符串的连接(不能使用strcat函数），并将连接后的字符串输出
//        Scanner scanner = new Scanner(System.in);
//        String str1 = scanner.nextLine();
//        String str2 = scanner.nextLine();
//        System.out.println(str1 + str2);
//    }
//编写代码模拟三次输入密码的场景，最多能输入三次密码，密码正确，提示登陆成功 密码错误 可以重新输入，
// 最多输入三次，三次均错则提示退出程序
//        int count = 3;
//        Scanner scanner = new Scanner(System.in);
//        while(count !=0){
//            System.out.println("请输入密码");
//            String str = scanner.nextLine();
//            if(str.equals("123456")){
//                System.out.println("密码正确，登录成功");
//                break;
//            } else{
//                count--;
//                if(count == 0){
//                    System.out.println("很遗憾，三次密码全输入错误，登陆失败");
//                }else{
//                    System.out.println("密码错误，还剩"+count+"次机会");
//                }
//            }
//        }

//找出0-999999的 独生数 三位自幂数（水仙花数） 四位 五位 六位自幂数
//做题步骤 先产生数字 然后求位数 然后把值算出来 判断对不对
//        for(int i = 1; i<1000000; i++){
//            int count = 1;
//            int tmp = i;
//            //算出有几位数
//            while(tmp / 10 != 0){
//                count++;
//                tmp /= 10;
//            }
//            //再算值
//            tmp = i;
//            int sum = 0;
//            while(tmp != 0){
//                sum += Math.pow(tmp % 10,count);
//                tmp /= 10;
//            }
//            if(sum == i){
//                System.out.print(i+" ");
//            }
//        }

//数一下1-100之间出现多少个9
//        int count = 0;
//        for(int i = 1; i <= 100; i++){
//            if(i % 10 == 9){
//                count++;
//            }
//            if(i / 10 == 9){//算的就是十位的
//                count++;
//            }
//        }
//        System.out.println(count);

//计算1/1-1/2+1/3-1/4+1/5......+1/99-1/100;
//        double sum = 0.0;
//        int flag = 1;
//        for (int i = 1; i <= 100; i++) {
//            sum += (1.0 / i) * flag;
//            flag = -flag;
//        }
//        System.out.println(sum);

//求最大公约数
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        while(a % b != 0){
//            int c = a % b;
//            a = b;
//            b = c;
//        }
//        System.out.println(b);

//最大公约数也能这样写
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = a;
//        for(c = a; c >= 0; c--){
//            if(a % c == 0 && b % c == 0){
//                System.out.println(c);
//                break;
//            }
//        }

//输出乘法口诀表
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        for(int i = 1;i <= n; i++){
//            for(int j = 1;j <= i; j++){
//                System.out.print(j+"*"+i+"="+i*j+" ");
//            }
//            System.out.println();
//        }

//输出 1000-2000之间的闰年
//        for (int i = 1000; i <= 2000; i++) {
//            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
//                System.out.println(i + " ");
//            }
//        }
//    }
//}
