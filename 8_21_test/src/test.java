import java.util.*;

public class test {

    public static void main(String[] args) {
        //输入一个整数序列，判断是否是有序序列，有序，指序列中的整数从小到大排序或者从大到小排序。
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int flag = 1;
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        if(arr[0] > arr[1]) {
            for(int i = 1; i < n; i++) {
                if (arr[i] > arr[i - 1]) {
                    flag = 0;
                }
            }
        } else {
            for(int i = 1; i < n; i++){
                if(arr[i] < arr[i - 1]){
                    flag = 0;
                }
            }
        }
        if(flag == 1){
            System.out.println("sorted");
        } else {
            System.out.println("unsorted");
        }
    }

    //输入n个成绩，换行输出n个成绩中最高分数和最低分数的差。
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(scanner.nextInt());
        }
        System.out.println(Collections.max(list) - Collections.min(list));
    }

    //输入数字N，然后输入N个数，计算这N个数的和。
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum += scanner.nextInt();
        }
        System.out.println(sum);
    }

    //输入10个整数，分别统计输出正数、负数的个数。
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i = 0; i < 10; i++){
            a = scanner.nextInt();
            if(a < 0){
                c++;
            } else {
                b++;
            }
        }
        System.out.println("positive:"+b);
        System.out.println("negative:"+c);
    }

    public static void main2(String[] args) {
        //输入10个整数，要求按输入时的逆序把这10个数打印出来。逆序输出，就是按照输入相反的顺序打印这10个数。
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        for(int i = str.length - 1; i >= 0; i--){
            System.out.print(str[i]+" ");
        }
    }

    //输入10科成绩，换行显示输入的10科成绩。
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
    }
}
