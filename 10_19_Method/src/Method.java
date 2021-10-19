import java.io.IOException;
import java.util.*;
public class Method {

    //模拟用户登陆页面
    public static void login(){
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        while(count != 0){
            System.out.println("请输入你的密码");
            String password = scanner.nextLine();
            //Java 当中比较字符串是否相等用 equals
            if(password.equals("123456")){
                System.out.println("登录成功！");
                break;
            } else {
                count--;
                System.out.println("你输错密码了，还有 "+count+" 次机会");
            }
        }
    }
    public static void main(String[] args) {
        login();
    }

    //方法的重载 (overload)
        //1 方法名要相同
        //2 方法的参数列表不同（个数，类型）
        //3 函数的返回值不影响重载
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public static double add(double a, double b){
        return a+b;
    }
    public static void main16(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(add(a, b));

        double d1 = 10.5;
        double d2 = 20.1;
        System.out.println(add(d1, d2));
    }

    //交换两个数的值  如果用方法来交换两个数的值的话，只能把 a b 放在堆上
    public static void main15(String[] args) {
        int a = 10;
        int b = 20;
        int c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
    }

    //用方法求阶乘
    public static int fac(int n){
        int ret = 1;
        for(int i = 1; i <= n; i++){
            ret *= i;
        }
        return ret;
    }
    public static void main14(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = fac(n);
        System.out.println(ret);
    }

    //函数开辟的内存：栈帧
    //所有程序的入口都是 main 函数

    /**
     * 求 1-n 的和 方法名一定是小驼峰
     * @param n
     * @return
     */
    public static int sumAdd(int n){//形参  是值传递 在 Java 当中只有值传递
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    //方法  就是C语言当中的函数  是一个功能，是可以重复使用的
    //写方法的模板：public static 返回值 方法名称（参数）{方法功能}
    public static void main13(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = sumAdd(n) * 2;//实参  这里的*2 就是链式调用 函数的返回值支持链式调用
        System.out.println(ret);
    }

    //数一数 1-100 当中有多少个 9
    public static void main12(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++){
            //分析之后发现：9 只出现在个位和10位

            //个位
            if(i % 10 == 9){
                count++;
            }
            //十位
            if(i / 10 == 9){
                count++;
            }
        }
        System.out.println(count);
    }

    //求最大公约数  辗转相除法(除到余数为0，除数就是最大公约数)
    public static void main11(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a % b;
        while (c != 0){
            a = b;
            b = c;
            c = a % b;
        }
        System.out.println(b);
    }

    //输出乘法口诀表
    public static void mai10(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+"="+j*i+"\t");
            }
            System.out.println();
        }
    }

    //输出 1000 - 2000 之间的所有闰年
    public static void main9(String[] args) {
        for (int i = 1000; i <= 2000; i++) {
            if((i % 4 == 0 && i % 100 != 0)||(i % 400 == 0)){
                System.out.print(i + " ");
            }
        }
    }

    //求素数的第二种方法  百度面试题    任何一个数可以写成 n * n = x
    //任何一个数肯定
    public static void main8(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        for (i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.println(n+" 不是素数");
                break;
            }
        }
        if(i > Math.sqrt(n)){
            System.out.println(n+" 是素数");
        }
    }

    //求一个数是不是素数
    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        for (i = 2; i < n; i++){
            if(n % i == 0){
                System.out.println(n+" 不是素数");
            }
        }
        if(i == n){
            System.out.println(n+" 是素数");
        }
    }

    //猜数字游戏
    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();//这里只要给定的数，那么生成的就是伪随机数
        //生成的数就一直一样了  所以写的时候 千万不要在这里写数字
        int rand = random.nextInt(100);//这样的话 生成的就是 0 - 99 左闭右开
        while(true){
            System.out.println("请输入要猜的数字");
            int n = scanner.nextInt();
            if(n < rand){
                System.out.println("猜小了");
            } else if(n > rand){
                System.out.println("猜大了");
            }else{
                System.out.println("猜对啦！");
                break;
            }
        }
    }

    //循环读入整数
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //CTRL + D 来结束一直读取输入
        //用 hasNextInt() 也可以
        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            System.out.println(n);
        }
    }

    //输入一行 读取字符串的时候 先读取字符串 然后再读单个字符
    //因为 Java 的缺陷会导致读取一行的时候 把上一个数据的回车读取掉
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
        scanner.close();//关闭读取的方法
    }

    //常用输入
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);
        double d = scanner.nextDouble();
        System.out.println(d);
    }

    //输入
    public static void main2(String[] args) throws IOException {
        System.out.println("输入一个字符");
        char i = (char) System.in.read();
        System.out.println("输入的字符是 "+i);
    }

    //输出
    public static void main1(String[] args) {
        System.out.println("输出且换行");
        System.out.print("输出不换行");
        System.out.printf("格式化输出 %d\n, 10");
    }
}
