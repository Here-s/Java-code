import java.util.*;
public class Main {

    public static void main(String[] args) {

        //删除字符串的空格，原来字符串的顺序不变
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        for(int i = 0; i < str.length; i++){
            if(str[i].equals(" ")){
                continue;
            }
            System.out.print(str[i]);
        }
    }

    public static void main2(String[] args) {
        //字符串压缩. 输入字符串只包含 a-z 字母以及结束标志，请编写函数实现对连续出现的相同字符进行压缩,例
        //如： ”xxxyyyyz” 压缩后字符串为 ”3x4yz” ， ”yyyyyyy” 压缩后为 ”7y”
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split("");
        int count = 1;
        for(int i = 1; i < str.length; i++){
            if(str[i].equals(str[i - 1])){
                count++;
                if(i == str.length - 1){
                    System.out.print(count+str[i - 1]);
                }
            } else {
                System.out.print(count+str[i - 1]);
                if(i == str.length - 1){
                    count = 1;
                    System.out.print(count+str[i]);
                }
                count = 1;
            }
        }
    }

    public static boolean judge(int n){
        int a = 2;
        while(n != 0){
            if(a == n){
                return true;
            }
            a *= 2;
            if(a > n){
                return false;
            }
        }
        return false;

    }
    public static void main1(String[] args) {
        //判断一个数n是否是2的k次方
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Boolean a = judge(n);
        System.out.println(a);
    }
}
