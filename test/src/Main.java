import java.util.*;

public class Main {


	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i <n; i++) {
			String a = sc.next();
			int b = Integer.parseInt(a,16);
		//	System.out.println(b);
			String ss =Integer.toString(b, 8);
			System.out.println(ss);
		}
	}

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int p = 1;
        int q = 1;
        int sum = 0;
        for (int i = 2; i < n; i++) {
            sum = (p + q)%10007;
            p = q;
            q = sum;
        }
        return sum;
    }
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = fib(n);
        System.out.println(sum);
    }

    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int min = 999;
        int max = -9999;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            sum += arr[i];
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int j = 0;
        int flag = 0;
        for (j = 0; j < n; j++) {
            if (arr[j] == k) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println(j+1);
        } else {
            System.out.println(-1);
        }
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
