public class DataOperator {
    public static void main(String[] args) {
        //进入字符串 字符串就是引用类型
        //Java当中的数据类型 分为两大类 1 基本数据类型  2 引用数据类型(类 string 数组 抽象类 接口 枚举……)

        //定义一个字符串类型 C语言当中没有布尔类型和字符串类型 Java当中都有
        String str="hello";//一定要大写 不然会报错
        System.out.println(str);

        //转义字符 比如说要打印一个“hello” 不能在原来的基础上面再加一个双引号 应该用\来当转义字符
        String str1="\"hello\"";
        System.out.println(str1);//这样就能打印出双引号加字符了 转义字符和C语言一样
        String str2="\\hello\\";//这里的转义字符是打印出一个\
        System.out.println(str2);
    }

    public static void main5(String[] args) {
        //总结 byte char short int long float double boolean Java当中的8中基本数据类型 对应的包装类分别是
        //是  Byte Character Short Integer Long Float Double Boolean  有两个是特殊的 char是两个字节
    }

    public static void main4(String[] args) {
        //布尔类型  Java独有的
        boolean flg=false;//在Java当中 布尔类型没有明确的大小 在Java当中 布尔类型只有两个取值 true和false
        //没有C语言当中的 0表示假 非0表示真 在Java当中 没有0是假 非0为真 真只有true 假只有false
        //布尔类型是一个简单类型 也有包装类 Boolean 也是大写首字母
        System.out.println(flg);
    }

    public static void main3(String[] args) {
        //短整型  short 两个字节 范围是-32768到32768
        short sh=12;
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(sh);
    }

    public static void main2(String[] args) {
        //字节类型 byte 一个字节 也是数值类型 所以可以取到负数 取值范围是  -128到127 赋值的时候 不能大于范围
        //整型也是 不能大于范围
        byte b=12;
        byte c=21;
        System.out.println(b+" "+c);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        //byte a=Byte.MAX_VALUE+1;//会提示int 转换到byte 会丢失数据类型  这里是一个整型提升 因为byte的最大值是整数
        //后面加的是1 也是整数 所以是整型提升 所以就会报错 把左边改为int 就好了
        System.out.println(Byte.MAX_VALUE+1);//结果是128 println打印是默认以整型来打印的 所以说根本看不到-128的

    }
    public static void main1(String[] args) {
        //字符数据类型
        char ch='a';//字符数据类型 占两个字节 C语言占一个字节 包装类是Character
        System.out.println(ch);
        char ch2='含';//只能写一个汉字 因为多了的话就会报错：字符文字中的字符数过多
        System.out.println(ch2);
        char ch3=97;
        System.out.println(ch3);//这里打印出的还是a 因为a的Unicode值是97 Unicode比ASCII码值包括了更多的东西
        //能表示汉字 马来西亚语等等
        //char是两个字节 表示的范围是 0-65535 因为char是没有负数的
        //char只是一个字符类型 不要和数值类型混合
    }
}
