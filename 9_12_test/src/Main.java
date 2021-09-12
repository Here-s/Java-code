import java.util.*;
public class Main {

    public static void main(String[] args) {
        //输入一个日期 判定是否合法
        Scanner scanner = new Scanner(System.in);
//        int y = scanner.nextInt();
//        int m = scanner.nextInt();
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
//        int day = scanner.nextInt();
        String[] str = scanner.nextLine().split("-");
//        while(scanf("%d %d",&y,&m) != EOF)
//        {
            int y = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            int k = Integer.parseInt(str[2]);
            int day = days[m - 1];
        if(y % 4 == 0 && y % 100 !=0 || y % 100 == 0) {
            if(m == 2) {
                day++;
                if(k <= day && k >0){
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
        if(k <= day && k > 0){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
//            int day = Integer.parseInt(str[2]);
//            if(y % 4 == 0 && y % 100 !=0 || y % 100 == 0)
//            {
//                if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m ==12)
//                {
//                    if(day > 0 && day <32){
//                        System.out.println("yes");
//                    } else {
//                        System.out.println("no");
//                    }
//                }
//            }
//            printf("%d\n",day);
//        }
    }

    public static void main1(String[] args) {
        //求二进制中 1 的个数
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int i = 0;
        while(i < 32){
            if(((n >> i) & 1) == 1){
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}
