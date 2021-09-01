import java.util.*;
public class Main {

    public static void main(String[] args) {
        //从键盘输入10个数据 并存入数组 把最大的数和第一个数交换
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int max = 0;
        int b = 0;
        int min = 999;
        int c = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
            if(max < arr[i]){
                max = arr[i];
                b = i;//保存最大数的下标
            }
            if(min > arr[i]){
                min = arr[i];
                c = i;//保存最小数的下标下标
            }
        }
        //交换最大的数和第一个输入的数
        int tmp = arr[b];
        arr[b] = arr[0];
        arr[0] = tmp;
        //最小的数和最后一个数交换
        tmp = arr[c];
        arr[c] = arr[9];
        arr[9] = tmp;
        //输出
        for (int a:arr) {
            System.out.print(a+" ");
        }
    }

    public static void main4(String[] args) {
        //输入 1 - 10 并且逆序输出
        int[] a = new int[10];
        int k = 1;
        for(int i = 0; i < 10; i++){
            a[i] = k;
            k++;
        }
        for(int i = 9; i >= 0; i--){
            System.out.print(a[i]+" ");
        }
    }

    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        if(n == 2){
            return 1;
        }
        int a = 1;
        int b = 1;
        int c = 0;
        for(int i = 3; i <= n; i++){
            c = (a + b) % 1000000007;
            a = b;
            b = c;
        }
        return c;
    }
    public static void main3(String[] args) {
        //求斐波那契数列
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = fib(n);
        System.out.println(ret);
    }

    public static void main2(String[] args) {
        //一个字符串 把空格换成 %20
        String s = "  as s s adaa  ";
        String[] str = s.split("");
        String str1 = "";
        for(int i = 0 ; i< str.length; i++){
            if(str[i].equals(" ")){
                str1 += "%20";
            } else {
                str1 += str[i];
            }
        }
        System.out.println(str1);
    }

    public static void main1(String[] args) {
        //编写代码完成如下功能：删除字符串首尾的空格，中间的连续空格只留一个，原来字符串的顺序不变。
        //如 “*****as****adadq*****”（*是空格） 变成 “as*aadadq”
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split("");
        for(int i = 0; i < str.length; i++){
            if(str[i].equals(" ")){
                continue;
            } else {
                System.out.print(str[i]);
                int count = 0;
                for(int j = i + 1; j < str.length; j++){
                    if(str[j].equals(" ")){
                        count++;
                        continue;
                    } else {
                        if(count != 0){
                            System.out.print(" ");
                        }
                        System.out.print(str[j]);
                        count = 0;
                    }
                }
                break;
            }
        }
    }
}
