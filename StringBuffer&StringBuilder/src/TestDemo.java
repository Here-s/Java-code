public class TestDemo {

    //StringBuffer 和 StringBuilder 转化为 String 调用 toString 方法
    public static String func2() {
        StringBuffer s = new StringBuffer();
        return s.toString();
    }
    /**
     * 把 String 转化为 StringBuffer 或者 StringBuilder
     * 使用构造方法
     * @return
     */
    public static StringBuffer func() {
        String str = "abcdef";
        //把字符串转化为 StringBuffer
        StringBuffer s = new StringBuffer();
        s.append(str);
        return s;
        //return new StringBuffer(str);
    }
    public static void main(String[] args) {

    }

    //StringBuffer 比 StringBuilder 多了一个关键字 synchronized 保证线程的安全
    //在多线程的情况下 用 StringBuffer 会更安全  如果是单线程 就用 StringBuilder
    public static void main2(String[] args) {
        StringBuilder s = new StringBuilder("abcdef");
        //reverse 逆序字符串
        s.reverse();
        System.out.println(s);
        StringBuffer s1 = new StringBuffer("12345");
        s1.reverse();
        System.out.println(s1);
    }

    //如果是在循环里面，进行字符串的拼接 尽量不要使用 String
    //优先使用 StringBuffer 和 StringBuilder


    //StringBuffer 和 StringBuilder 和 String 是不相同的东西
    //从内部的方法上来说 StringBuffer 和 StringBuilder 是差不多的
    public static void main1(String[] args) {
        //第一种：直接赋值
        StringBuilder s = new StringBuilder("abcdef");
        System.out.println(s);
        //第二种：append 拼接
        StringBuilder s1 = new StringBuilder();
        s1.append("abcdef");//append 就是把这个对象放到这个里面
        s1.append("123");//这样就完成了 append 的连续拼接

        //append 可以连着用
        s1.append("456").append("789");
        System.out.println(s1);
    }
}
