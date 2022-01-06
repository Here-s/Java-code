import java.util.*;// * 就是通配符 代表这个包地下所有的类
//Java在处理的时候，需要谁拿谁  但是直接写 * 的话 就可能会导致冲突
//import java.sql.*;

//import static java.util.*;//静态导入 用的很少
//import static java.lang.System.*;//静态导入 这样的话输出的时候就不用写类名 System
//import static java.lang.Math.*;
import com.lockey.test.*;//这里写了 * 之后 还是没有导入 所以同名的包就不会报错
//包名必须是小写的

//import 只能导入具体的类 而不是具体的包
import com.lockey.test.Test;

//包名必须是小写的
public class Package {


    //多态：字面上理解：语文层次：一种事务多种形式。


    //组合：和继承类似，组合也是一种表达类之间关系的一种方式，也能达到代码重用的效果
    //就像表示一个学校 可以定义一个学生 老师数组   没有 extends 这样的语法 只是将一个类的实例作为另一个类的字段


    //如果一个类不想被继承 我们可以设置为 final 修饰 这样就不用担心类被继承了
    //final 也可以修饰方法 代表方法

    //面向对象的三大特征：封装 继承 多态
    //继承   所有的父类 都默认是 Object    在继承的时候 继承的链条会越来越长
    //有一个规则：继承层次不要超过三层


    //1. java.lang:系统常用基础类(String、Object),此包从JDK1.1后自动导入。
    //2. java.lang.reflect:java 反射编程包;
    //3. java.net:进行网络编程开发包。
    //4. java.sql:进行数据库开发的支持包。
    //5. java.util:是java提供的工具程序包。(集合类等) 非常重要
    //6. java.io:I/O编程开发包。
    public static void main(String[] args) {
        Test test = new Test();
        //System.out.println(test.val);//报错是因为 test 是默认的包访问权限
    }

    public static void main3(String[] args) {
       System.out.println("efsf");
       System.out.println(Math.max(10,20));//写了静态的 Math 之后 就不用写前面的 Math 了
    }

    public static void main2(String[] args) {
        Date date = new Date();//获取当前的准确时间
        //当导入 java.util.*; 和 java.sql.*; 的时候就造成了冲突 就导致 Date 识别不了了
        //因为编译器不知道改用那个的 date 所以就应该使用完整的类名
        System.out.println(date);
    }

    public static void main1(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(arr));//这里就是导入包
        //所有类名的方法都是静态的
    }
}
