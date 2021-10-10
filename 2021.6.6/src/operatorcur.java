import java.util.Scanner;
public class operatorcur {
    public static void main(String[] args) {
        //运算符优先级  如果不知道那个优先 那么就加括号
        //关键字 就是类中会用到  关键字是不能用作标识符的

        //Java当中的输入是 Scanner scan = new Scanner(system.in) ;   int a = scan.nextIn();
        //scan是和下一句的scan相对应 如果这里不一样 那么后面的也得改
        Scanner scan = new Scanner(System.in);//使用Scanner 就要导入Java的包 就是import java.util.Scanner;
        //Scanner是Java的一个类 在java.util包下面   System.in 是指键盘输入

        int a=scan.nextInt();//nextInt 表示输入的是一个整型
        System.out.println(a);

        //读入一行字符串
        String str = scan.next();//读入一行 所以是nextline  改成next 就不会出现下面说的那种情况了
        //用nextLine的话 会把空格也输出 而next的话 遇到空格会结束
        System.out.println(str);

        //nextLine 和nextInt 一般不放在一起来使用 因为输入nextInt的时候会回车 nextLine会把回车读进去 所以不能放在一起
        //所以应该放的是next
    }

    public static void main1(String[] args) {
        // &  |  ^  按位与  按位或  按位异或
        //注意按位异或  异 就是不一样的再进行或
        //按位与 有一个不是1 结果为0   按位或 有一个为1 结果为1   按位异或 不相同为1 相同为0

        //移位运算符 << >> >>>
        //例如 11  00001011 >>右移一位 就变成00000101(5) 因为左边要补符号位 左边是0 所以补0
        //11右移两位 00000010 变成2 右移相当于是除法 右移一位相当于除(2^1) 右移两位相当于(2^2)
        //位运算的速度大于* /
        //11左移一位 00010110 是22  11左移两位 00101100 左移相当于乘法 也是乘法算的
        //>>>无符号右移 假设原来是-1 11111111  那么右移之后 第一个位也是补0
        //没有无符号左移

        //条件运算符 只有一个 表达式1? 表达式2：表达式3   也是三目运算符
        //如果表达式1为真 就执行表达式2 如果表达式1为假 就执行表达式3
    }
}
