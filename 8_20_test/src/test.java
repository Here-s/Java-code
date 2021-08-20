import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[20];
        int i = 0;
        while (scanner.hasNextLine()) {
            str[i] = scanner.nextLine();
            if (str[i].equals("#")) {
                break;
            }
            i++;
        }
        for (int k = 0; k < i - 1; k++) {
            for (int j = 0; j < i - 1 - k; j++) {
                if (str[j].length() > str[j + 1].length()) {
                    String str1 = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = str1;
                }
            }
        }
        for (int j = 0; j < i; j++) {
            System.out.print(str[j]+" ");
        }
    }

    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        int count = 1;
        while (i < n) {
            i = 1 + i * 10;
            count++;
        }
        while (true) {
            System.out.print(i / n);
            if (i % n == 0) {
                break;
            }
            i %= n;
            i = 1 + i * 10;
            count++;
        }
        System.out.println(" " + count);
    }

    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = str.length();
        char[] arr = str.toCharArray();
        if (count == 6) {
            for (int i = 0; i < 6; i++) {
                if (i == 4) {
                    System.out.print("-");
                }
                System.out.print(arr[i]);
            }
        } else {
            if (((arr[0] * 10) + arr[1]) - 528 < 22) {
                System.out.print("20");
                for (int i = 0; i < 4; i++) {
                    if (i == 2) {
                        System.out.print("-");
                    }
                    System.out.print(arr[i]);
                }
            } else {
                System.out.print("19");
                for (int i = 0; i < 4; i++) {
                    if (i == 2) {
                        System.out.print("-");
                    }
                    System.out.print(arr[i]);
                }
            }
        }
    }

    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] arr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '6') {
                count++;
            } else {
                if (count > 3 && count <= 9) {
                    System.out.print("9");
                    count = 0;
                } else if (count > 9) {
                    System.out.print("27");
                    count = 0;
                } else {
                    for (int j = 0; j < count; j++) {
                        System.out.print("6");
                    }
                    count = 0;
                }
                System.out.print(arr[i]);
            }
        }
        if (count > 3 && count <= 9) {
            System.out.print("9");
        } else if (count > 9) {
            System.out.print("27");
        } else {
            for (int j = 0; j < count; j++) {
                System.out.print("6");
            }
        }
    }

    public static void main3(String[] args) {
        int[][] arr = new int[30][30];
        arr[0][0] = 1;
        int n = 6;
        int i = 0;
        for (i = 1; i <= n; i++) {
            arr[i][0] = 1;
            int j = 0;
            for (j = 1; j <= i; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
            }
        }
        for (i = 0; i < n; i++) {
            int j = 0;
            for (j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                if (arr[i][j] == 10) {
                    System.out.print("  " + arr[i][j]);
                    continue;
                }
                System.out.print("   " + arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main2(String[] args) {
        System.out.println("             1");
        System.out.println("           1   1");
        System.out.println("         1   2   1");
        System.out.println("       1   3   3   1");
        System.out.println("     1   4   6   4   1");
        System.out.println("   1   5   10  10  5   1");
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[1000];
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        int n = scanner.nextInt();
        int j = 2;
        for (int i = 0; i < n; i++) {
            int c = arr[i] * arr[i + 1];
            if (c >= 10) {
                arr[j] = c / 10;
                j++;
                arr[j] = c % 10;
                j++;
                c /= 10;
            } else {
                arr[j] = c;
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
    }
}
