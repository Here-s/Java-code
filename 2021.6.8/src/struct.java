import java.util.Scanner;
public class struct {
    public static void main(String[] args) {
        //悬垂else问题
        int x=10;
        int y=10;
        if(x==10) {//输出aaa 方式和C语言一样 写的时候 要加方括号 不然看的很乱
            if (y == 10) {
                System.out.println("aaa");
            } else {
                System.out.println("bbb");
            }
        }
    }

    public static void main2(String[] args) {
        //判断一年是不是闰年
        Scanner scan = new Scanner(System.in);

        while(scan.hasNextInt()) {//scan.hasNextInt() 这样就是一直去读下一个整型
            int year = scan.nextInt();
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("这年是闰年");
            } else {
                System.out.println("不是闰年");
            }
        }
    }

    public static void main1(String[] args) {
        //顺序结构 就是按照代码从上到下一行一行运行
        //分支结构  if else  switch
        //if的判断条件只能是布尔表达式 boolean  if(布尔表达式){}
        int a=10;
//        if(a){
//            System.out.println("hello offer");//报错是因为括号里面写的不是布尔表达式
//        }
        if(a==110){//一定要注意 这是和C语言的区别
            System.out.println("hello offer");//这样就没问题了 因为括号里面是布尔判断类型
        }
        else{
            System.out.println("offer");
        }
    }
}
