import java.util.*;

public class Main {

    public static void main(String[] args) {
        //计算数值的整数平方
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int a = x;
        while(n > 1){
            x *= a;
        }
        System.out.println(x);
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int k = 0; k < n; k++) {
            int m = scanner.nextInt();
            int[][] arr = new int[m][m];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < m; i++) {
                Arrays.sort(arr[i]);
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main1(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split("-");
        int y = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int day = Integer.parseInt(str[2]);
        if(y < 2021){
            System.out.println("no");
        } else {
            if (y == 2021 && m < 9) {
                System.out.println("no");
            } else if (y == 2021 && m == 9 && day <= 9){
                System.out.println("no");
            } else {
                if(m > 12 || m < 1){
                    System.out.println("no");
                } else if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
                    if(day < 32){
                        System.out.println("yes");
                    } else {
                        System.out.println("no");
                    }
                } else if(m == 2){
                    if (y % 4 == 0 && y % 100 != 0 || y % 100 == 0) {
                        if(day < 30){
                            System.out.println("yes");
                        } else {
                            System.out.println("no");
                        }
                    } else {
                        if(day < 29){
                            System.out.println("yes");
                        } else {
                            System.out.println("no");
                        }
                    }
                } else {
                    if(day < 31){
                        System.out.println("yes");
                    } else {
                        System.out.println("no");
                    }
                }
            }
        }
    }
}
