import java.util.Scanner;
public class Programcontrol {
    public static void main(String[] args) {
        //循环读入n个数字
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int num=scan.nextInt();
            System.out.println(num);//输出读取的整型
        }
    }

    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        scan.close();//输入结束的时候 就通过close把这个资源关闭 一般打开就要关闭
    }

    public static void main2(String[] args) {
        //do while 循环  应用场景：这个代码必须要执行一次
        int num=0;
        do {
            System.out.println("best offer");
        }while(num!=0);//当num不等于0的时候才执行 但是不论如何都会先执行一次 然后再判断 所以这里会输出一次
    }

    public static void main1(String[] args) {
        //for循环

        //计算1！+2！+3！+4！+5！
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();

        int sum=1;
        for(int i=0;i<=num;i++){
            int a=1;
            for(int j=1;j<=i;j++){
                a*=j;
            }
            sum+=a;//每次的a都是一个数的阶乘 所以每次算完阶乘都要加一下
        }
        System.out.println(sum);
    }
}
