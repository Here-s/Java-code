class A{

}

public class day1 {//一个Java文件当中 只能有一个public类 类似于C语言中只能有一个main函数 Java的文件名不可以是数字
    //且类名和文件名是相同的  建议左括号是紧跟着当前行的  类名一定要采用大驼峰的形式命名
    //从这里开始的内容被叫做类体 在类体当中包含字段和方法
    public static void main(String[] args) {//使用psvm快捷方式输出的因为psvm是主函数的缩写
        //在Java中 public 和static 是必须要有的 面试问题：main方法 为什么是static的
        //Java当中的main是void 类型 也就是无返回值 string[] args 是一个笔试题 作用是
        //在main函数里面叫方法体 放的是main方法体的主要功能
        System.out.println("hello word");//sout是输出函数的缩写 所以可以使用这个快捷方式 意思是打印后面的东西
        //并且打印完换行 双引号引起来的内容叫字符串 Java当中会有字符串类型
        //JDK命令有Javac Java 最后会在JVM中运行出来
        //JDK 是Java开发工具
        //JRE 是Java运行环境
        //JVM 是Java虚拟机 是Java中最核心的东西 《深入了解JVM虚拟机》这本书不错 虚拟机里面又包括了JDK
        //就是因为上面这种情况 所以就出现了 一次编译 到处运行
        //在运行的时候 会把文件加载到JVM当中 具体怎么加载 就出现了面试问题：双亲委派模型  类加载器
        //字节码文件——class文件，一个类对应一个字节码文件 两个类对应两个字节码文件
        //安装JDK之后 JDK当中会默认包含JRE JRE里面会默认包含JVM

        //一个Java文件只能有一个public类 且类目要和文件名一样

        //如果在上面再加一个类的话 会生成两个字节码文件 是为了做到随用随取 如果用a类 就加载aclass
        //用helloword类 就加载helloword类 Java当中用到哪个类 就加载哪个类 比如说上面的class A 不能改成public
        //因为Java文件当中只能有一个public类 如果一个类是public 那么这个类的类名 一定要和文件名相同 并且一个Java文件中
        //只能有一个共有(public)的类
        //Java注释有  行注释 //    块注释 /*  */   文档注释 类的开始 或者方法的开始 /**  */(使用是/**加回车)
        //文档注释之后 方便写文档
        //既可以用这个注释 也可以用这个取消注释
    }
}
