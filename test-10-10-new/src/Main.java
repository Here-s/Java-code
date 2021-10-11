import java.util.*;
public class Main {

    //短整型 short
    public static void main(String[] args) {
        short s = 10;//两个字节
        System.out.println(s);
    }

    //byte 类型
    public static void main7(String[] args) {
        byte b = 10;//byte 占一个字节 是字节类型
        //byte 的大小范围是 -128到127 也是那个圆盘模型
        System.out.println(b);
    }

    //字符类型
    public static void main6(String[] args) {
        char ch = 'a';//Java 当中 char 是两个字节
        System.out.println(ch);
    }

    public static void main5(String[] args) {
        //double 双精度浮点型
        double a = 12.3;//8 个字节
        System.out.println(a);
        //将两个double 变量相除 结果就是小数  在程序里面 小数是没有精确的
        //double 遵守的是 IEEE754 标准

        //float 单精度  在Java 当中 精度变换也会报错 因为Java 是一门安全的语言
        float f = 12.5f;//f 原来表示单精度浮点数
        System.out.println(f);
    }

    public static void main4(String[] args) {
        //比 int 大的类型 long  Java不存在 long long 类型
        System.out.println(Long.MAX_VALUE);

        //定义 long 数据的时候 后面要加 L
        Long a = 10L;
        System.out.println(a);
    }

    /**
     * 变量的命名：小驼峰 数字 字母 下划线 美元符号 -> 不能数字开头
     * 不建议下划线  因为不知道有几个线条  也不能用美元符号开头
     * 不要用拼音  变量定义一定要初始化 避免不安全
     * @param args
     */

    public static void main3(String[] args) {
        //变量：程序运行时可以改变的量 每个变量都是不同的数据类型  也就是运行时参数

        int a = 10;//4个字节 不管多少位 什么系统 都是 4 个字节  因为跨平台 一次编译 多次运行
        //Java当中的 int 没有无符号的 都是有符号的
        int b = Integer.MAX_VALUE;
        System.out.println(b);
        System.out.println(Integer.MIN_VALUE);
        //整型大小也是那个圆盘模型
        //Java 是Unicode 比 C语言的要多很多 所以也可以用中文命名变量 但是不要这样
    }

    public static void main2(String[] args) {
        //args 命令行参数
        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println("hello word");
    }

    public static void main1(String[] args){

        //安装后 JDK 之后 就有了 JDK JRE JVM
        //因为安装之后 最外层有 JDK 里面一层是 JRE 最里面是 JVM
        //JVM 就是虚拟机 来运行代码   程序跑的原理是：代码去寻找虚拟机

        //如果这个类是 public 修饰的  类目要和文件名一样
        //一个类对应一个字节码
        System.out.println("hello word");
    }
}
