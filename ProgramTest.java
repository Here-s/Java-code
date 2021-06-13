import java.util.*;
public class ProgramTest {
    public static void main(String[] args) {
        //打印1-100间的所有素数
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1;i<=n;i++){//这里是循环判断1-n那个数是素数
            int j=2;
            for(j=2;j<=(int)Math.sqrt(i);j++) {//这是判断i这个数是不是素数
                if(i%j == 0){
                    break;//这个是跳出最近的循环 因为不是素数 所以直接跳出循环
                }
            }
            if(j>(int)Math.sqrt(i)){//判断这个数是不是素数
                System.out.println(i+" 是素数");
            }
        }
    }

    public static void main2(String[] args) {
        //判断一个数是否是素数（百度面试题）  素数就是只能除以1和它本身
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
//        for(int i=2;i<=n;i++) {//使i从2开始 这样就跳过1和n本身去掉了 如果这个范围内 能除开任何一个数字 就说明这个数不是素数
//            if(n%i == 0){
//                System.out.println("这个数不是素数");
//                break;
//            }
//        }

        //也能这样写 如果一个数不是素数 比如8 那么就能写成 a*b 这种形式 所以一定有一个数字是小于二分之八的 也就是<=n/2
        //所以可以在n/2区间内寻找这个数  还能优化 如果是素数的话 就会有一个数小于根号n 如果一个类是java.lang 那么这个类
        //这个类就不需要手动导入了（就是不需要在最上面导入了） 就写成 i<=(int)Math.sqrt(n) 了 强制转换一下
        //强制转化一次就是 因为是double转化为int
        for(int i=2;i<=n/2;i++) {
            if(n%i == 0){
                System.out.println("这个数不是素数");
                break;
            }
        }

    }

    public static void main1(String[] args) {
        //根据年龄，来打印出当前年龄的人是少年（低于18），青年（19-28），中年（29-55），老年（56以上）
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if(age<=18){
            System.out.println("青少年");
        }
        else if(age>=19 && age<=28){
            System.out.println("青年");
        }
        else if(age>=29 && age<=55){
            System.out.println("早年");
        }
        else{
            System.out.println("老年");
        }
    }
}
