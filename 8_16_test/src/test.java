import java.util.*;
public class test {
        public static void main(String[] args) {


            //判断一个数是不是素数
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            for(int i = 2; i <= (int)Math.sqrt(num);i++){
                if(num % i==0){
                    System.out.println("这个数不是素数");
                    break;
                }
            }
            if(num > (int)Math.sqrt(num)){
                System.out.println("这个数是素数");
            }

            //实现一个猜数字的游戏
//        System.out.println("猜数字游戏：");
//        Scanner scan = new Scanner(System.in);
//        Random random = new Random();
//        int guessNum = random.nextInt(100);
//        System.out.print("请猜数字：");
//        while(true) {
//            int num = scan.nextInt();
//            if (num == guessNum) {
//                System.out.println("恭喜你，猜对了");
//                break;
//            } else if (num > guessNum) {
//                System.out.println("猜大了");
//            } else {
//                System.out.println("猜小了");
//            }
//        }


//        Scanner scan = new Scanner(System.in);
//        while(scan.hasNextInt()){
//            int a = scan.nextInt();
//            System.out.println(a);
//        }

//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//
//        scan.close();//输入结束的时候 就通过close把这个资源关闭 一般打开就要关闭

//        int a = 0;
//        int i = 1;
//        int sum = 0;
//        int ret = 1;
//        Scanner scan = new Scanner(System.in);
//        a = scan.nextInt();
//        for(i = 1;i <= a;i++){
//            ret *= i;
//            sum += ret;
//        }
//        System.out.println(sum);

//        int a = 0;
//        Scanner scan = new Scanner(System.in);
//        a = scan.nextInt();
//        int sum = 1;
//        int ret = 0;
//        int num = 1;
//        while (num <= a) {
//            sum *= num;
//            ret += sum;
//            num++;
//        }
//        System.out.println(sum);
//        System.out.println(ret);

//        int a = 10;
//        int b = 20;
//        if (a == 10) {
//            if (b == 20) {
//                System.out.println("hhh");
//            } else {
//                System.out.println("lll");
//            }
//        }

            //判读一个数是否为闰年
//        Scanner scan = new Scanner(System.in);
//        int a = 0;
//        while(scan.hasNextInt()) {//scan.hasNestInt() 就是一直去读下一个整型
//            a = scan.nextInt();
//            if((a % 4 == 0 && a % 100 != 0) || a % 400 == 0){
//                System.out.println(a+" 是闰年");
//            }
//            else{
//                System.out.println(a+" 不是闰年");
//            }
//        }

//        int a = 10;
//        if (a == 10) {
//            System.out.println(a);
//        }

//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        System.out.println(a);

//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        System.out.println(a);
//        String str = scan.next();
//        System.out.println(str);
//        String str2 = scan.nextLine();
//        System.out.println(str2);

//        int a = 10;
//        int b = 20;
////        System.out.println(a == b);//false 因为Java判断真假只有 true 和 false
//        System.out.println(!(a<b));
//        boolean flag = true;
//        System.out.println(!flag);

//        int i = 10;
//        int a = i++;
//        System.out.println(a);//10 后置++ 先赋值给a 再++
//        System.out.println(i);//11 因为是后置++ 先使用再++

//        String str = "100";
//        int a = Integer .parseInt(str);
//        System.out.println(a);

//        int num = 10;
//        String str = String.valueOf(num);
//        System.out.println(str);

//        long a = 10L;
//        int b = (int)a;
//        System.out.println(b);

//        final int a = 10;//加上 final 之后 就不可修改这个值了
//        System.out.println(a);

//        String a = "hello";
//        String b = "word";
//        String c = a+b;
//        System.out.println(c);
        }
}
