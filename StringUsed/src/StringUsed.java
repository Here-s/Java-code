import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringUsed {

    //字符串拼接   字符串的 length 是带 () 的  字符串的长度是有效字符的长度
    //Java 的数组 里面机制很多
    public static void main(String[] args) {
        String str = "abcd";
        //拼接后的字符不入池
        String ret = str.concat("ef");
//        System.out.println(ret);
        System.out.println(str.isEmpty());//判断字符串是不是空的
    }

    //字符串大小转化
    public static void main15(String[] args) {
        String str = "abcdefBFEG";
        //把字符全部转化为大写
        String ret = str.toUpperCase();
//        System.out.println(ret);
        //把字符转化为小写
        String tmp = str.toLowerCase();
        System.out.println(tmp);
    }

    //字符串取出左右空格
    public static void main14(String[] args) {
        String str = "    abc   def   ";
        //str.trim  去除左右的空格
        String tmp = str.trim();
        System.out.println(tmp);
    }

    //字符串的截取
    public static void main13(String[] args) {
        String str = "abcdefg";
        //subString 就是提取子串
        String tmp = str.substring(2);//这里九四从二号位置提取子串
        //如果给的是 0 默认返回原来的 不会产生新对象
        //如果再加一个参数 n 的话 就是截取范围 左闭右开
        System.out.println(tmp);
        String tmp1 = str.substring(2,5);
        System.out.println(tmp1);
    }

    public static void main12(String[] args) {
        String str = "Java30 12&21#hello";
        //下面就是按照 ” |&|#“ 来分割字符串  就是一个字符串有多个分隔符的时候 就可以这样写
        String[] tmp = str.split(" |&|#");
        for (String s:tmp) {
            System.out.println(s);
        }
    }

    public static void main11(String[] args) {
        String str = "192.168.1.1";
        //因为 . 是一个特殊的字符 所以要加两个 \\ 来表示转义
        //split 后面加个参数 n 表示最多分几组   要注意转义字符的影响
        String[] strings = str.split("\\.",3);
        for (String s:strings) {
            System.out.println(s);
        }
    }

    public static void main10(String[] args) {
        String str = "name=zhangsan&age=19";
        //split 以 & 分割字符串
        String[] strings = str.split("&");
        for (String s:strings) {
            System.out.println(s);
            String[] ss = s.split("=");
            for (String st:ss) {
                System.out.println(st);
            }
        }
    }

    //字符的替换 replace
    public static void main9(String[] args) {
        String str = "ababcabcdabcde";
        //字符串返回 String 一定是产生了新的对象

        //通过 replace 把 ab 替换成 tp
        String tmp = str.replace("ab","tp");
        //通过 replaceFirst 把第一个 ab 替换为 tp
        String ret = str.replaceFirst("ab","tp");
        System.out.println(tmp);
        System.out.println(ret);
    }

    public static void main8(String[] args) {
        String str = "ababcabcd";
        String tmp = "abc";
        int index = str.lastIndexOf(tmp);//从后往前找 也可以加个参数 从 n 往前找
        System.out.println(index);
        System.out.println(str.startsWith("a",4));//判断是否是 a 开头的
        //也可以加一个参数 从下表为 n 的位置找

        System.out.println(str.endsWith("cd"));//判断是否是以 cd 结尾的
    }

    //判断一个字符串当中是否存在指定内容
    public static void main7(String[] args) {
        String str = "ababcabcd";
        String tmp = "abc";
        boolean flag = str.contains(tmp);//从左往右找 找到第一个 abc a出现的位置，找到为 true 找不到为 false
        System.out.println(flag);
        System.out.println("============================");
        int index = str.indexOf(tmp);//indexOf 就是返回第一次出现的下标位置 -> KMP 算法
        //也可以放第二个参数，就是从下标为 n 的位置请寻找

        System.out.println(index);
    }

    public static void main6(String[] args) {
        String str1 = "abc";
        String str2 = "Abc";
//        System.out.println(str1.equalsIgnoreCase(str2));//equalsIgnoreCase 忽略大小写的情况
        //比较字符串大小
        int n = str1.compareTo(str2);//这里的比较有三种情况：大于0 小于0 等于0
        System.out.println(n);
    }

    //字符串的比较：
    // 1 真假比较
    // 2 大小比较
    public static void main5(String[] args) {
        String str1 = "abcdef";
        String str2 = str1;
        System.out.println(str1.equals(str2));
    }

    //字节数组适合在网络传输 数据存储这样的场景下使用  更适合针对二进制数据来操作
    //字符数组更适合组队文本数据来操作，尤其是包含中文的时候

    //字符串变成字节
    public static void main4(String[] args) {
        String str = "abcdef";
        byte[] bytes = str.getBytes();//可根据编码方式不同填入不同的编码方式 但是结果也不相同
        System.out.println(Arrays.toString(bytes));
    }

    //字节与字符串的转化: 字节变成字符串
    public static void main3(String[] args) {
        byte[] bytes = {97,98,99,100};
        String str = new String(bytes);
        //这里是把整数变成整数对应的字母了
        System.out.println(str);
        String str2 = new String(bytes,1,3);
        System.out.println(str2);
    }

    //给定一个字符串 判断其是否全是有数字组成
    public static boolean isNumberChar(String s){
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            //Character.isDigit() 判断某个字符是不是数字。
            boolean flag = Character.isDigit(c);
            if(flag == false){
                return false;
            }
//            if(c < '0' || c > '9'){
//                return false;
//            }
        }
        return true;
    }
    public static void main2(String[] args) {
        String str = "1234567890";
        System.out.println(isNumberChar(str));
    }

    //字符和字符串的转化
    public static void main1(String[] args) {
        //直接把字符数组转化为字符串
        char[] val = {'a','b','c','d','e','f'};
        String str = new String(val);
        String str1 = new String(val,1,3);//把数组的一部分变为字符串
        //上面这个的意思就是从偏移量为几的位置取元素，取几个 所以这里就应该是 bcd
        System.out.println(str);
        System.out.println(str1);

        //把字符串变成字符
        String str2 = "hello";
        //取字符串的某一个位置字符
        char ch = str2.charAt(2);//获取某个下标位置的字符
        System.out.println(ch);
        //把整个字符串变成数组
        char[] ch1 = str2.toCharArray();
        System.out.println(Arrays.toString(ch1));
    }
}
