import java.util.*;
public class Main {

    //根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age < 19){
            System.out.println("少年");
        } else if(age < 29){
            System.out.println("青年");
        } else if(age < 56){
            System.out.println("中年");
        } else {
            System.out.println("老年");
        }
    }

    //输出 1 - 100 之间的所有素数
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        boolean flag = false;
        int j = 0;
        for(j = 2; j <= Math.sqrt(i); j++){
            if(i % j == 0){
                break;
            }
        }
        if(j > Math.sqrt(i)){
            flag = true;
        }
        if(flag){
            System.out.println("是素数");
        } else {
            System.out.println("不是素数");
        }
    }

    //输出 1000 - 2000 之间所有的闰年
    public static void main4(String[] args) {
        int count = 0;
        for(int i = 1000; i <= 2000; i++){
            if((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)){
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }

    //编写程序数一下 1到 100 的所有整数中出现多少个数字9
    public static void main3(String[] args) {
        int count = 0;
        for(int i = 1; i <= 100; i++){
            //先求十位
            if(i / 10 == 9){
                count++;
            }
            //再求个位
            if(i % 10 == 9){
                count++;
            }
        }
        System.out.println(count);
    }

    //打印一个字符串,需要使其输出结果为：\"hello\"，
    public static void main2(String[] args) {
        System.out.println("\\\"hello\\\"");
    }

    public static void main1(String[] args) {
        double a = 2.0;
        int y = 4;
        a /= ++y;
        System.out.println(a);
    }
}
