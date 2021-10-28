import java.util.*;
public class Main {

    //找出数组当中只出现一次的数字
    public static int one(int[] arr){
        int ret = 0;
        for (int i = 0; i < arr.length; i++){
            ret ^= arr[i];
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,2,1};
        int ret = one(arr);
        System.out.println(ret);
    }

    //实现一个方法 toString, 把一个整型数组转换成字符串
    public static String toString(int[] arr){
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
            if(i < arr.length - 1){
                str += ",";
            }
        }
        str += "]";
        return str;
    }
    public static void main17(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        String str = toString(arr);
        System.out.println(str);
    }

    //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
    public static int[] copyOf(int[] arr){
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            ret[i] = arr[i];
        }
        return ret;
    }
    public static void main16(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] ret = copyOf(arr);
        System.out.println(Arrays.toString(ret));
    }

    //给定一个有序整型数组, 实现二分查找
    public static int binarySearch(int[] arr,int k){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = (left+right)/2;
            if(k > arr[mid]){
                left = mid+1;
            } else if(k < arr[mid]){
                right = mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static void main15(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int ret = binarySearch(arr,5);
        System.out.println(ret);
    }

    //给定一个整型数组, 判定数组是否有序（递增）
    public static boolean judge(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main14(String[] args) {
        int[] arr = new int[]{1,5,9,3,4,8,2,7,6,10};
        boolean b = judge(arr);
        System.out.println(b);
    }

    //实现冒泡排序
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = true;
                }
            }
            if(flag == false){
                return;
            }
        }
    }
    public static void main13(String[] args) {
        int[] arr = new int[]{1,5,9,3,4,8,2,7,6,10};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
    public static void main12(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }

    //打印数组
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main11(String[] args) {
        int[] arr = new int[]{1,2,3};
        printArray(arr);
    }

    //将原数组的值扩大二倍
    public static void transform(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]*2;
        }
    }
    public static void main10(String[] args) {
        int[] arr = new int[]{1,2,3};
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }

    //数组所有元素之和
    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void main9(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int ret = sum(arr);
        System.out.println(ret);
    }

    //求数组的平均值
    public static double avg(int[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
    public static void main8(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        double d = avg(arr);
        System.out.println(d);
    }

    //递归求 N 的阶乘
    public static int fact(int n){
        if(n == 1){
            return 1;
        }
        return n * fact(n - 1);
    }
    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = fact(n);
        System.out.println(sum);
    }

    //递归求 1-n 的和
    public static int addSum(int n){
        if(n == 1){
            return n;
        }
        return n+addSum(n-1);
    }
    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = addSum(n);
        System.out.println(sum);
    }

    //递归打印数字的每一位
    public static void print(int n){
        if(n == 0){
            return;
        }
        print(n / 10);
        System.out.print(n % 10+" ");
    }
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        print(n);
    }

    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
    public static int sumAdd1(int n){
        if(n < 10){
            return n;
        }
        return n % 10 + sumAdd1(n/10);
    }
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = sumAdd1(n);
        System.out.println(sum);
    }

    //递归求斐波那契第 n 项
    public static int fibn(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fibn(n - 1) + fibn(n - 2);
    }
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = fibn(n);
        System.out.println(ret);
    }

    //递归求汉诺塔
    public static void move(char pos1, char pos2){//打印出移动的过程
        System.out.print(pos1+"->"+pos2+" ");
    }
    public static void hanno(int n, char pos1, char pos2, char pos3){
        if(n == 1){//最下面一个 放到最右边
            move(pos1,pos3);
        } else {
            hanno(n - 1,pos1,pos3,pos2);//因为要把其它盘子放到中间
            move(pos1,pos3);//当其它都移走之后 就把 pos1 移到 pos3
            hanno(n - 1,pos2, pos1, pos3);
        }
    }
    public static void main2(String[] args) {
        hanno(1,'A','B','C');
        System.out.println();
        hanno(2,'A','B','C');
        System.out.println();
        hanno(3,'A','B','C');
    }

    //青蛙跳台阶问题
    public static int frog(int n){
        if(n == 1 || n == 2){
            return n;
        }
        int a = 1;
        int b = 2;
        int c = 0;
        while(n > 2){
            c = a + b;
            a = b;
            b = c;
            n--;
        }
        return c;
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = frog(n);
        System.out.println(ret);
    }
}
