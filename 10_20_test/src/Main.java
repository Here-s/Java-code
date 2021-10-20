import java.util.*;
public class Main {


    //递归输出数字的每一个位
    public static void print(int n){
        if(n > 9){
            print(n / 10);
        }
        System.out.print(n % 10 +" ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        print(n);
    }

    //请按从小到大的顺序输出长度为5位的一个01的这32种01串
    public static void main1(String[] args) {
        for (int i = 0; i < 32; i++){
            int count = 5;
            while (count != 0){
                int k = i;
                k >>= count - 1;
                System.out.print((k & 1));
                count--;
            }
            System.out.println();
        }
    }
}
