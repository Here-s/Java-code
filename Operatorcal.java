public class Operatorcal {
    public static void main(String[] args) {
        //int和String之间的转换
        int num=10;
        String str1=num+"";//这样就把int转化为字符串了 这是方法一  后面拼接了一个空的字符串 但""是一个字符串类型
        //所以就整体转换为字符串类型了

        String str2=String.valueOf(num);//方法二  调用String的一个叫value的方法 这个方法把数字传进去 就把数字
        //把数字转化为字符串了 这就是Java的方便之处 要注意valueOf 的Of是大写O
        System.out.println(str2);

        //String转化为整型的方法
        String str="100";//在100后面加一个a的话  这样会导致异常
        int num1=Integer.parseInt(str);//利用库函数来进行转变 将String转化为int
        System.out.println(num1);
    }

    public static void main5(String[] args) {
     //类型转换 有隐式类型转换和显式类型转换
     //隐式类型转换： 把一个小类型数据给一个大类型数据   比如：int a=10;  long b=a; 这里就是隐式类型转换
     //显式类型转换： 把一个大类型给小类型 需要强制类型转换
        int a=10;//隐式类型转换例子
        long b=a;
        System.out.println(b);
        long c=10L;//显式类型转换例子
        int d=(int)c;//把大类型给了小类型 对于Java这样的安全语言来说的话 会报错 所以加一个括号进行强制类型转换 就不报错了
        System.out.println(d);

        //int和boolean类型不能相互赋值 因为boolean就是boolean类型 只有true和false int不能和他们进行相互赋值
        int e=10;
        //boolean f=e;//这样就报错了 就是上面写的这种情况

        //int赋值给byte的时候 给的值不能超过byte的最大范围
    }

    public static void main4(String[] args) {
        //常量 常量分为两种 分别是 1 字面常量  2 final修饰的变量   变量是运行时可以被改变的量  常量是不能被改变的
        //字面常量： 10  "abc"  1.0   被final修饰的常量  final int maxNum=10; 这样的maxNum就是一个常量了
        //一般规定常量的变量名全部都要大写 就变成了 final int MAXNUM =10; 如果是一个常量的话 名字最好全部大写
        final int MAXNUM=10;
        //MAXNUM=999;//这里不能修改 因为会报错 常量只能被初始化一次 所以报错     如果先定义常量 然后再初始化就没问题
        //常量只能初始化一次 而且使用的时候 一定要初始化  final修饰变量 使变量变为常量 且要全部大写
        System.out.println(MAXNUM);
    }

    public static void main3(String[] args) {
        //局部变量的作用域在对应的函数里面

        //写代码一定不要写本地代码块  本地代码块是定义在方法内的一个代码块  因为作用域内的代码
        //作用域外不能使用

        //变量命名规则 数字不能开头   变量名是大小写敏感的 即num和Num是两个不同的变量 要采用小驼峰的方式来写 例如
        int maxNum=10;//这样就是小驼峰命名方式
        //代码可读性要高 不应该使用拼音 应该使用英文

    }

    public static void main2(String[] args) {
        //用+号可以拼接字符串 例如
        String a="hello";
        String b="world";
        String c=a+b;
        System.out.println(c);
        //还可以进行字符和整数的拼接
        String str="result = ";
        int d=10;
        int e=20;
        String out=str+d+e;
        System.out.println(out);
    }

    public static void main1(String[] args) {
        //整型提升  对于下面的byte类型运算 算的时候 会先将操作符两边的值提升为整型
        //byte a=127+1;
        //byte=Byte.MAX_VALUE+1;//这两个代码对于Byte来说 是编译不通过的 因为进行了整型提升
        byte a=10;
        byte b=20;
        //byte c=a+b;//这里会报错 因为是整型提升  整型提升就是：小于四个字节的类型的数据 在进行算术运算的时候
        //会先都提升为整型 然后在参与运算 比如说a b 都是byte类型 10和20加起来是30 完全可以存在c里面 但是java
        //Java在处理的时候 因为Java很安全 所以会有一个整型提升的概念 运算的时候 a b都提升为整型 那么a+b之后的
        //的值 也是整型 要把一个整型的值赋给byte类型 肯定会报错 让代码跑过的话 有两种方法 1是把c前面的byte改为int
        //或者把b+c 强制转换为byte   就是 byte c=(byte)(a+b);  这里就是强制转换为byte

        //在long 和int 混合运算的时候 会把int转化为long类型 在来运算

        //提升为整型是因为 cpu读数据和存数据都是以四个字节为单位的 所以会有整型提升
    }
}
