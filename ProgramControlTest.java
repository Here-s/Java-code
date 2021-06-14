import java.util.*;
public class ProgramControlTest {
    public static void main(String[] args) {
        //如果找一个十进制的数字的每一位上是几 只需要除10 模10就行了  二进制的话 就是除2 模2   八进制就是除8 模8

        //数一下1-100之间出现多少个9  先分析 再写代码
        //其实就是找 每个位上的数字是几 是9就++
        int count = 0;
        for(int i=1;i<=100;i++){
            if(i/10==9){
                count++;//这里算的是十位
            }//如果要算有几个数包含9 那只需要把下面的if改成else if就行了因为else的范围太多了
            if(i%10==9){
                count++;//这里算的是个位
            }
        }
        System.out.println(count);
    }

    public static void main4(String[] args) {
        //计算1/1-1/2+1/3-1/4+1/5......+1/99-1/100;
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        double sum=0;
        int flg=1;
        for(int i=1;i<=n;i++){
            sum=sum+ 1.0/i*flg;//这样就使结果变成小数了
            flg=-flg;
        }
        System.out.println(sum);
    }

    public static void main3(String[] args) {
        //计算两个数的最大公约数  辗转相除法 余数为0时 最大公约数就是除数
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c=b;
        while(a%b!=0){
            c=a%b;
            a=b;
            b=c;
        }
        System.out.println(c);
    }

    public static void main2(String[] args) {
        //输出乘法口诀表
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"  ");
            }
            System.out.println();
        }
    }

    public static void main1(String[] args) {
        //输出1000-2000之间的闰年
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int year=1000;year<=n;year++){
            if(year%100!=0 && year%4==0 || year%400==0){
                System.out.println(year);
            }
        }
    }
}
