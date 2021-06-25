import java.util.*;
public class Test {
    public static void main(String[] args) {
        //读入两个整数a b 然后输出两个数的最大值
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a>=b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
}
