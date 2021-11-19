import java.util.Arrays;

public class StringTest {

    public static void func2(String s) {
        if(s == null || s.length() == 0){
            //通过这样来判断是否空指针
        }
        assert s != null;//要使用 assert 要设置 IDEA
    }
    public static void main(String[] args) {
        String str1 = null;//代表 str1 这个引用不指向任何对象
        String str2 = "";//代表 这个引用指向的字符串是空的
        System.out.println(str2.length());
        func2(str1);
    }

    public static void main11(String[] args) {
        //数组的整体赋值，只有一次机会，就是创建数组的时候
        int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[]{3,4,5,6};
        //当数组指向一个值的时候 就不能让重新指向另外一个值了
        //就比如第二行写成 arr = new int[]{3,4,5,6}; 就会报错
    }

    public static void main10(String[] args) {
        String str1 = null;
        String str2 = "11";//可以把 11 改成 22 但是要通过反射才能修改
        System.out.println(str1.equals(str2));
        //这里就会空指针异常 因为是 str1 调用的 equals

        // 如果换一下 换成这样 就不会有空指针异常了
        System.out.println("hello".equals(str2));
    }

    public static void main9(String[] args) {
        String str1 = "11";
        String str2 = new String("1")+new String("1");
        str2.intern();//当哈希常量池当中没有这个值的时候，才会手动入池，如果有了 就不会入池
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));//通过 equals 来比较是否相同
        //因为 str1 str2 都是引用 所以也会有空指针异常
    }

    public static void main8(String[] args) {
        String str1 = new String("1")+new String("1");
        str1.intern();
        String str2 = "11";
        System.out.println(str1 == str2);
        //这样就是 true 了 因为 intern 就是手动入池的意思，就是把 str1 11 放到池里面

    }

    public static void main7(String[] args) {
        String str1 = "11";
        String str2 = new String("1")+new String("1");
        System.out.println(str1 == str2);//false 因为str2 new 1 的时候 StringTable 里面
        //      并没有 1 所以就是单独放的  所以第二个 new 的时候 已经有了 1
        //      所以第二个 new 的 1 和第一个都是同一个 因为这里的 1 是常量 1
        //      这里的就是 StringBuilder 对象 拼接就是 append
        // str2 并没有进入 StringTable 池
    }

    public static void main6(String[] args) {
        String str1 = "hello";
        String str2 = "he"+"llo";
        System.out.println(str1 == str2);
        //还是 true 因为 str2 在编译的时候就确定了是 hello 所以还是相等
        //字节码文件当中把 str2 当成了 hello

        String str3 = "he";
        String str4 = str3+"llo";//str3 是一个变量，编译的时候，不知道是啥 所以结果是 false
        System.out.println(str3 == str4);
    }

    public static void main5(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1 ==str2);
        //这里是相等的 因为在放第二个 hello 的时候，发现常量池里面有 所以就不会重复创建
    }

    public static void main4(String[] args) {
        String str1 = "hello";//这个字符串的对象，本质是两个东西，一个是 val 一个是哈希结构
        // String 是存放在 StringTable 里面的
        String str2 = new String("hello");
        //当再存一份的时候 会检查一遍有没有这个值，如果有的话 就 new 一个对象，然后去引用这个值
        //

        System.out.println(str1 == str2);//这里比较的不是内容 而是比较地址

        //只要是 双引号 引起来的字符串常量 才会放到字符串常量池当中
        //双引号引起来的字符串常量 从 JDK1.8 开始 放在了堆里面

        //什么是哈希表：描述和组织数据的一种方式最后一个下标是 9 第一个是 0
        // 例如：12 45 2 7 15 92   问题：如何区查到一个关键字
        // 1 顺序查找：通过关键字 一个一个的比较 才能找到 O(n)
        // 2 排序+二分查找  最快也是 二分查找的时间复杂度
        // 3 哈希表 存储的时候，会根据一个映射关系进行存储，如何映射，需要设计一个函数（哈希函数）

        // 举例：长度为 10 的数组，比如说存一个数 key 存的时候用 key % len(数组的长度)的下标去放这个元素
        // 会把下标冲突的元素放在一起，放在一起的是一个链表，这样就方便查找元素了
        // 哈希表里面 认为 数组长度 链表长度 是一个常数

        //概念：
        // Class 文件常量池  ：int a = 10;
        // 运行时常量池       ：当程序把编译好的字节码文件，加载到 JVM 当中后，
        //                  会生成一个运行时常量池【方法区】 实际上是 class 文件常量池
        // 字符串常量池       ：里面主要存放字符串常量，字符串常量池 本质上是一个 哈希表 StringTable

        //什么是池（为了提高效率）：
        // 数据库连接池
        // 线程池
    }

    public static void func(String s, char[] array) {
        s = "Lockey";
        array[0] = 'p';
    }

    public static void main3(String[] args) {
        String str = "abcdef";
        char[] chars = {'q','w','e'};
        func(str, chars);
        //传了引用之后，并没有改变 str 的值，所以，不是说 传引用 就能改变实参的值，
        // 你要看，到底这个引用干啥了
        System.out.println(str);
        System.out.println(Arrays.toString(chars));
    }

    public static void main2(String[] args) {
        String str = "abcdef";
        String str2 = str;
        System.out.println(str);
        System.out.println(str2);
        //str1 和 str2 都指向 abcdef   是否可以通过 str1 修改 abcdef 为 gbcdef
        //不能修改 因为 abcdef 是一个字面值常量
        str2 = "Lockey";
        System.out.println(str);
        System.out.println(str2);
    }

    public static void main1(String[] args) {
        //字符串：使用双引号 "abcdef"  "a"
        //字符：使用单引号 '汉' 'a'
        //在 Java 当中 没有所谓的字符串以 \0 结尾
        String str = "abcdef";
        String str2 = new String("hello");
        char[] chars = {'a', 'b', 'c'};
        String str3 = new String(chars);//
    }
}
