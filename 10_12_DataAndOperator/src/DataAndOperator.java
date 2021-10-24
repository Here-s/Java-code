public class DataAndOperator {
    
    //不需要去记运算符的优先级 只需要根据自己的逻辑去加括号就行了

    //条件运算符
    //表达式1？表达式2：表达式3
    //如果表达式1为真 就返回表达式2 否则返回表达式3
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println(max);
    }

    //移位运算符 << >> >>>
    // 左移操作符：就是结乘 2^n 右边补 0
    // 右移操作符：就是除 2^n 左边补符号位
    // >>> 无符号右移
    //移动负数位或者移位位数过大都没有意义
    public static void main17(String[] args) {
        int a = 11;
        //-1 右移 1位 补符号位 还是 -1
        //所以 如果是 负数 就使用无符号右移 不管符号位是啥 左边统一补 0
        //没有无符号左移
    }

    //进制转化 一定要先变成 二进制 然后在转换

    // 按位与之类的那三个 不存在短路 就是操作符两边的表达式都执行
    public static void main16(String[] args) {
        //按位与 &：对应位都是 1 结果是 1 否则为 0
        //按位或 |：对应位有一个 1 结果就是 1
        //按位异或（找不同）^：一样的地方 结果是 0 不一样的地方 结果是 1
        //按位取反 ~：把 0 变成 1  把 1 变成 0
    }

    public static void main15(String[] args) {
        System.out.println(10 > 20 && 10 / 0 == 0); // 打印 false
        //因为第一个表达式为真 所以就不执行第二个了
        System.out.println(10 < 20 || 10 / 0 == 0); // 打印 true
    }

    //所以表达式 必须是布尔表达式
    public static void main14(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(a < b && b < c);//true

        System.out.println(a < b || b < c);//true

        System.out.println(!(a < b));//这种就错了 因为 ！后面跟着一个整数 a 所以报错
        //括号括起来就好了
    }

    //使用关系运算符 其结果就是 布尔 值    if 语句里面的条件只能写布尔表达式
    //表达式1 && 表达式2   这两个表达式都为真 结果就为真 如果表达式1为假 就不执行表达式2
    //表达式1 || 表达式2   只要有一个表达式为真 结果就为真 如果表达式1为真 就不执行表达式2
    // ！后面也是布尔表达式
    public static void main13(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a == b);//false
        System.out.println(a != b);//true
        System.out.println(a < b);//true
        System.out.println(a > b);//false
        System.out.println(a <= b);//true
        System.out.println(a >= b);//false
    }

    public static void main12(String[] args) {
        int a = 10;
        a += 1;
        System.out.println(a);
        short s = 10;
        s = (short)(s + 9);//这样就会报错 因为 9 是整型 这里要发生转化 所以应该强制类型转换
        //但是写成复合运算符 += 就不会报错 因为复合运算符会自动发生类型转换

        //自增 自减  ++  --  和C语言一样
        int c = 10;
        int e = ++c;//前置++ 先++ 后使用
        int d = 10;
        int f = d++;//后置++ 先使用 后++
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }

    //运算符
    public static void main11(String[] args) {
        int a = 10;
        int b = 2;
        //Java当中 除数不能为 0 不然会抛出异常 抛出异常之后 程序就不能执行了
        System.out.println(a / b);

        //% 取余 求模 取模 就是求余数
        int c = 3;
        System.out.println(a % c);
        System.out.println(-10 % 3);//-1 因为是 -10 所以结果是 -1
        System.out.println(10 % -3);//1
        System.out.println(-10 % -3);//-1 因为 -3 * 3 = -9  所以结果是 -1
    }

    //int 对应的包装类 Integer  char 的包装类 Character
    //剩下的其它八种类型 首字母大写就是包装类
    //局部变量使用的时候 一定要有默认值
    public static void main10(String[] args) {
        String str = "123";
        int ret = Integer.parseInt(str);//使用包装类的方法把字符串变为整数
        System.out.println(ret);
    }

    //int 和 String 的转换
    public static void main9(String[] args) {
        int num = 10;
        String str = String.valueOf(num);
        System.out.println(str);
        String str2 = num + "";//这样就变成字符串了 但是尽量使用方法
    }

    //类型转换
    //不同类型数据的计算 把范围小的转换为范围大的然后计算
    public static void main8(String[] args) {
        //高的数据类型转换为低的数据类型就会报错
        //浮点数赋值给整型 就会报错  强制类型转换之后就可以了

        boolean b = true;
        //int a = (int)b;//因为本就是两种 所以强制转换也不行

        //给 byte 赋值
        byte a = 1;//byte 的最大范围是 127  但是如果赋值的大小超过 127 就会报错

        //byte 类型不能直接相加减 因为对于 cpu 来说 小于 4 个字节的话 运算的时候
        //会提升为 int 类型 然后再运算  所以不能把 int 赋值给 byte 但是强制类型转换就好了
        //但是可能会导致精度丢失
        byte c = 2;
        byte d = (byte) (a + c);//这样就完成了强制类型转换

        //如果直接写成 1+2 就没事  因为编译器把 1+2 当作 3 了
        byte e = 1 + 2;//1 2 都是常量 在程序编译的时候 就已经是 3 了
    }

    //常量：是常量 就尽量写成大写  在程序运行开始的时候 就已经创建好了
    // 1 字面值常量
    // 2 final 修饰的变量 就是常量
    public static void main7(String[] args) {
        final int A = 100;//这样就不能改变 a 的值了
        System.out.println(A);
    }

    //变量的命名规则：
    // 变量：程序运行时可以改变的量
    // 硬性规则：一个变量名只能包括：字母 下划线 数字
    // 数字不能开头
    // 变量名大小写不相同 是两个变量
    // 软性规则：看剧名字之后 知道其表示的意思
    // 不要使用拼音

    //普通成员变量：只能在类的内部 方法外部使用
    //局部变量：只能在其作用域使用
    public static void main6(String[] args) {
        //Java 当中 没有全部变量的概念
    }

    //short 的包装类是 Short   Short 可以看成 short 的 plus 版本
    public static void main5(String[] args) {
        short s = Short.MAX_VALUE;
    }

    //转义字符 \   \n 换行    \t tab键
    public static void main4(String[] args) {
        System.out.println("\"Lockey\"");
    }

    //Java 的数据类型有两种：
    // 基本数值类型：数据（int byte short long） 浮点数 字符 布尔
    // 引用类型（变量存储的是地址）：String 数组 类 接口 枚举……

    //字符串类型 String 也叫引用类型
    public static void main3(String[] args) {
        String str = "hello";//单引号引起来的数据是字符 双引号引起来的若干字符叫字符串
        System.out.println(str + "Mashdhad");//用 + 来拼接字符串 结果就是一个字符串
        System.out.println(10 + "" + 20);
        System.out.println(10 + 20);
        System.out.println(str + (10 + 20));
        System.out.println("a = " + 10 + " b = " + 20);
    }

    //boolean 布尔类型 用来表示真假 在 Java 当中 布尔类型只有两种 true或者flase
    //在 JVM 的规范当中 并没有规范布尔类型的大小 有的书说的是应该比特位 有的书说的是 1 个字节
    //boolean 类型不能加减数字 因为布尔类型就不是数字
    public static void main2(String[] args) {
        boolean flag = true;
        System.out.println(flag);
        boolean flag2 = false;
        System.out.println(flag2);
    }

    public static void main1(String[] args) {
        //大驼峰：MaxNum  小驼峰：maxNum
        //类名：建议用大驼峰 不要出现数字

        //短整型：short 2个字节 16个比特位
        short s = 10;//对应的包装类是 Short
        System.out.println(s);
    }

}
