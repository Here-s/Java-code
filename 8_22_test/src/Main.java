import java.util.*;

public class Main {

    public static void main(String[] args) {
//        KiKi想知道一个n阶方矩是否为上三角矩阵，请帮他编程判定。上三角矩阵即主对角线以下的元素都为0的矩阵，
//        主对角线为从矩阵的左上角至右下角的连线。
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        int flag = 1;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(arr[i][j] != 0){
                    flag = 0;
                }
            }
        }
        if(flag == 1){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main8(String[] args) {
        //KiKi想从n行m列的方阵队列中找到身高最高的人的位置，请你帮助他完成这个任务。
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        int max = 0;
        int a = 0;
        int b = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = scanner.nextInt();
                if(max < arr[i][j]){
                    max = arr[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println((a+1)+" "+(b+1));
    }

    public static void main7(String[] args) {
        //KiKi现在得到一个包含n*m个数的整数序列，现在他需要把这n*m个数按顺序规划成
        //一个n行m列的矩阵并输出，请你帮他完成这个任务。
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] arr = new int[a * b];
        for(int i = 0; i < a * b; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < a * b; i++){
            System.out.print(arr[i]+" ");
            if((i + 1) % b == 0){
                System.out.println();
            }
        }
    }

    public static void main6(String[] args) {
        //KiKi得到了一个n行m列的矩阵，现在他想知道第x行第y列的值是多少，请你帮助他完成这个任务。
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(arr[x - 1][y - 1]);
    }

    public static void main5(String[] args) {
        //输入一个班级5个学生各5科成绩，输出5个学生各5科成绩及总分。
        Scanner scanner = new Scanner(System.in);
        double[][] arr = new double[5][5];
        double[] sum = new double[5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = scanner.nextDouble();
                sum[i] += arr[i][j];
            }
        }
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++){
                System.out.print(String.format("%.2f",arr[i][j])+" ");
                if(j == 4){
                    System.out.println(sum[i]);
                }
            }
        }
    }

    public static void main4(String[] args) {
        //输入两个升序排列的序列，将两个序列合并为一个有序序列并输出。
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n + m];
        for(int i = 0; i < n + m; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int s:arr) {
            System.out.print(s+" ");
        }
    }

    public static void main3(String[] args) {
        //输入n个整数的序列，要求对这个序列进行去重操作。所谓去重，是指对这个序列中每个重复出现的整数，
        //只保留该数第一次出现的位置，删除其余位置。
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int j = 0;
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
            for(j = 0; j <= i; j++){
                if(arr[i] == arr[j]){
                    break;
                }
            }
            if(i == j){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main2(String[] args) {
        //有一个整数序列（可能有重复的整数），现删除指定的某一个整数，输出删除指定数字之后的序列，
        //序列中未被删除数字的前后位置没有发生改变。
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        int a = scanner.nextInt();
        for(int i = 0; i < n; i++){
            if(arr[i] == a){
                continue;
            }
            System.out.print(arr[i]+" ");
        }
    }

    public static void main1(String[] args) {
        //有一个有序数字序列，从小到大排序，将一个新输入的数插入到序列中，保证插入新数后，序列仍然是升序。
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        arr[n] = scanner.nextInt();
        Arrays.sort(arr);
        for (int s:
             arr) {
            System.out.print(s+" ");
        }
    }
}
