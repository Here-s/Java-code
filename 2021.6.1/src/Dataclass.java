public class Dataclass {
    public static void main(String[] args) {
        //数据类型和运算符 变量和类型 变量就相当于一个小箱子 放的数据不一样
        int a=10;//a就是一个变量 放在内存里面 就是放在运行内存里面 int是整型变量 在内存当中占用4个字节
        //不论32位 64位 都是4个字节
        //System.out.println(a);//输出a的值的话 就直接在打印里面输入a就行了 当打印后面少了ln 就不换行了
        //一个字节等于8个位 int的取值范围是 有4个字节 所以默认是32位 最高位是符号位 不是数值位 0代表正数 1代表负数
        //剩下的有31位 所以那31位就表示数值 一共有2^31中状态 正数最大取到2^31-1 因为要表示0 最后一位的1表示1不是2
        //负数最小取到-2^31 所以整型的范围就是-2^31到2^31-1  所以int整数的最大值再加1 就变成-1了
        System.out.println(Integer.MAX_VALUE);//这里打印出来就是最大值
        System.out.println(Integer.MIN_VALUE);//这里打印出来就是最小值
        //Integer 是包装类 因为int是简单类型 Java是面向对象的类型 简单类型是不能面向对象的 所以Java就把它
        //把它包装成一个类了 Integer 就是整型的类
        int max=Integer.MAX_VALUE+1;//这样也是打印最大值 +1之后就变成最小值了 那个圆模型 同样 最小值-1
        //最小值-1之后就是最大值了
        System.out.println(max);

//        int a; 如果不知道初始化什么 就初始化为0  Java当中没有全局变量
//        System.out.println(a);//输出a a没定义 Java会认为是程序错误 程序无法运行 在Java中 如果变量没有初始化
        //没有初始化 程序就无法运行 没有初始化 就不能使用这个局部变量

        //在类内部 方法的外部的 成员变量

        //1 整型int  4个字节
        //2 标识符：数字 字母 下划线 $   比如a1 a2 但是不能以数字开头 不建议$符号开头 也不建议下划线开头
        //不用下划线是因为不知道有几个下划线
    }
}
//在不使用编译器的时候 文本文档中有注释的话 用cmd运行的时候 会报乱码
//所以在运行的时候 在后面加上 -encoding utf-8 默认这样的编码模式 就可以了
//windows 创建文本文件的时候 是以UTF-8 创建的 所以编译的时候也以UTF-8编译就行了
//因为Javac是默认gbk去编译的
//import就相当于C语言的#include 导入的意思 不过这里是是导入包
//也可以定义整型变量 int   字符串类型 string  定义数组是int[]
