import java.util.*;
public class Main {

    public static void main(String[] args) {
        //
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
