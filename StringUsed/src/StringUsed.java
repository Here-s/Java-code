import java.util.Arrays;

public class StringUsed {

    //字节与字符串的转化
    public static void main(String[] args) {
        byte[] bytes = {97,98,99,100};
        String str = new String(bytes);
        //这里是把整数变成整数对应的字母了
        System.out.println(str);
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
        String str = "1234567";
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

        //把整个字符串变成数组
        char[] ch1 = str2.toCharArray();
        System.out.println(Arrays.toString(ch1));
    }
}
