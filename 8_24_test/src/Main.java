import java.util.*;
public class Main {

    public static void main(String[] args) {
        //找出二维数组当中出现的数字
        Scanner scanner = new Scanner(System.in);
        int[][] num = new int[][]{{1,2,3}};
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                if(num[i][j] == 3){
                    System.out.println("找到了");
                }
            }
        }
    }

    public static int find(int[] arr){
        Arrays.sort(arr);
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i - 1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main4(String[] args) {
        //找到数组当中重复的值 找到一个就好 并且返回
        int[] arr = new int[]{2,3,1,0,2,5,3};
        System.out.println(find(arr));
    }

    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int tmp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = tmp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] < 10) {
                    System.out.print(" ");
                }
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main2(String[] args) {
        //求水仙花数
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = (int) Math.pow(10,n - 1);
        for(int i = a; i < a * 10; i++){
            int tmp = i;
            int sum = 0;
            //算出和
            while(tmp != 0){
                sum += (int) Math.pow(tmp % 10, n);
                tmp /= 10;
            }
            //比较
            if(sum == i){
                System.out.println(i);
            }
        }
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = scanner.nextInt();
        n %= 26;
        if(n < 0){
            n = 26 + n;
        }
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 'A' && arr[i] <= 'Z' || arr[i] >= 'a' && arr[i] <= 'z'){
                if(arr[i] + n > 'Z' && arr[i] +n <'a'){
                    arr[i] = (char) (arr[i] + n - 26);
                } else if(arr[i] + n > 'z'){
                    arr[i] = (char) (arr[i] + n - 26);
                } else {
                    arr[i] += n;
                }
            }
        }
        System.out.println(arr);
    }
}
