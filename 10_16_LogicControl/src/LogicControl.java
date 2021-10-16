import java.util.*;

public class LogicControl {

    //do while() 循环：先执行循环体 再判断  至少被执行一次 很少有人用
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        do{
            sum += i;
            i++;
        }while(i <= 10);
        System.out.println(sum);
    }

    //求 n 的阶乘
    public static void main10(String[] args) {
        int ret = 1;
        int sum = 0;
        for(int i = 1; i <= 5; i++){
            ret *= i;
            //求阶乘的和 再把 sum 加上 ret 就好了
            sum += ret;
        }
        System.out.println(ret);
        System.out.println(sum);
    }

    public static void main9(String[] args) {
        //for 循环里面没表达式 就一直为 true 就一直死循环
        //使用循环的时候，一定要注意判断条件
        for (;;){
            System.out.println(1);
        }
    }

    //for 循环 在 Java 当中直须注意第二个表达式，因为第二个是 boolean 类型
    //foreach 增强 for 循环
    public static void main16(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    //找到 1-100 之间既能被 3 整除 又能被 5 整除的数字 打印出来
    //写成 %15 也可以
    public static void main8(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(i % 3 != 0 || i % 5 != 0){
                continue;
            }
            System.out.println(i);
        }
    }

    /**
     * break 和 continue 都必须在循环当中 break 可以在 switch 当中
     * Java 当中没有 goto 不能一次跳出多个循环 goto 是保留字 随时有一天会被启用
     * 不要用 goto 不如会被 diss 因为 goto 出错不好调试
     * System.exit(0) 调用系统函数，直接终止代码
     * @param args
     */

    //continue 结束本次循环，然后继续从头开始执行循环 就是 continue 下面的代码不执行
    //找到 1-10之间所有的 3 的倍速
    public static void main7(String[] args) {
        int i = 1;
        while(i <= 10){
            if(i % 3 != 0){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }

    //break 跳出循环 各种循环都能跳出 但是只能跳出最近的一个循环
    //找到 1-10 之间被 3 整除的第一个数
    public static void main6(String[] args) {
        int i = 1;
        while(i <= 10){
            if(i % 3 == 0){
                System.out.println(i);
                break;
            }
            i++;
        }
    }

    //求 5 的阶乘
    public static void main5(String[] args) {
        int n = 5;
        int i = 1;
        int ret = 1;
        int sum = 0;
        while(i <= n){
            ret *= i;
            //加上 sum 求得阶乘的和
            sum += ret;
            i++;
        }
        System.out.println(ret);
        System.out.println(sum);
    }

    //while 循环 括号里是布尔表达式 死循环的话 就用 true
    //求 1-10 的和
    public static void main4(String[] args) {
        int i = 1;
        int sum = 0;
        while(i <= 10){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

    //switch 语句
    //Java 当中不能做 switch 参数的是：long float double boolean
    //JDK1.5 开始 枚举也可以作为 switch 的参数
    //项目的时候 尽量不要用 switch
    public static void main3(String[] args) {
        int a = 10;
        switch (a){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("参数不匹配");
                break;
        }
    }

    //else 总是与最近的 if 所匹配

    //输入的时候 next 遇到空格就结束
    //读入整数和字符串的时候 一定要先读入字符串 然后再读入整数 项目中慎用输入
    public static void main2(String[] args) {
        int year = 2000;
        if((year % 100 == 0 && year % 400 == 0) || (year % 4 == 0)){
            System.out.println(year+" 是闰年");
        } else{
            System.out.println(year+" 不是闰年");
        }
    }

    //各种程序 所有代码 都是用逻辑控制实现的。
    public static void main1(String[] args) {
        //顺序结构：就是按照代码由上到下执行
        //if 语句 要有 布尔表达式
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n % 2 == 0){
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
}
