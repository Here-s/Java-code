import java.util.*;
public class Main {

    public static void move(int a, char pos1,char pos2){//表示是从pos1到pos2
        System.out.println(a +": "+pos1+" -> "+pos2);
    }
    public static void hanoi(int a, int n,char pos1,char pos2,char pos3){
        //n表示盘子的数量  pos1是起始位置 pos2是中途位置
        //pos3是目的地位置
        if(n==1){
            move(a, pos1, pos3);
        }
        else{
            hanoi(a - 1, n-1,pos1,pos3,pos2);//就是把那n-1个盘子挪到中间的B上面
            move(a,pos1,pos3);
            //继续递归之后 A上的盘子就挪到了C上面 所以再把B的盘子通过A挪到Ｃ上面
            hanoi(a - 1,n-1,pos2,pos1,pos3);
        }
    }
    public static void main18(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str1 = scanner.nextLine();
        String str = scanner.nextLine();
        hanoi(n,n,'a','b','c');
        System.out.println();
    }

    public static void main17(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
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
                    System.out.print(" " + arr[i][j]);
                }
                System.out.println();
            }
        }
    }

    public static void main16(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int c = 0;
        int d = A * B;
        while(A % B != 0){
            c = A % B;
            A = B;
            B = c;
        }
        System.out.println("large_n="+c+",least_n="+d / c);
    }

    public static void main15(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        while(scanner.hasNextLine()) {
            String[] str = scanner.nextLine().split("");
            if(str[0].equals("#")){
                break;
            }
            s += str[0];
        }
        System.out.println(s);
    }

    public static void main14(String[] args) {
        Scanner sc=new Scanner(System.in);
        long s=sc.nextLong();
        long h=s/3600;
        long m=(s%3600)/60;
        long s1=s%60;
        System.out.println(h+":"+m+":"+s1);
    }

    public static void main13(String[] args) {
        //求水仙花数
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = (int) Math.pow(10,n - 1);
        for(int i = a; i < a * 10; i++){
            int tmp = i;
            tmp = i;
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

    public static void main12(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int a = str.length;
        System.out.println(a);
    }

    public static void main11(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        for(int i = a; i <= b; i++){
            int j = 0;
            for(j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    break;
                }
            }
            if(j > Math.sqrt(i)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main10(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = (int) Math.pow(2,n);
        System.out.println(2+"^"+n+" = "+a);
    }

    public static void main9(String[] args) {
        //统计字符串当中 CHN 的个数
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split("");
        int count = 0;
        int a = 0;
        int b = 0;
        for(int i = 0; i < str.length; i++){
            if(str[i].equals("C")){
                count++;
            } else if (str[i].equals("H")) {
                a += count;
            } else if (str[i].equals("N")) {
                b += a;
            }
        }
        System.out.println(b);
    }

    public static void main8(String[] args) {
        //老师给了小乐乐一个正整数序列，要求小乐乐把这个序列去重后按从小到大排序。
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[0]+" ");
        for(int i = 1; i < n; i++){
            if(arr[i] == arr[i - 1]){
                continue;
            } else {
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static int fab(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;
        int b = 2;
        int c = 0;
        if(n == 0){
            return n;
        } else if (n == 1 || n == 2){
            return n;
        } else {
            for(int i = 3; i <= n; i++){
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }
    public static void main7(String[] args) {
        //小乐乐上课需要走n阶台阶，因为他腿比较长，所以每次可以选择走一阶或者走两阶，那么他一共有多少种走法？
        int a = fab();
        System.out.println(a);
    }

    public static void main6(String[] args) {
        //如果某一位是奇数，就把它变成1，如果是偶数，那么就把它变成0。
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] n = str.split("");

        for(int i = 0; i < n.length; i++){
            int m = Integer.parseInt(n[i]);
            if(m % 2 == 0){
                n[i] = "0";
            } else {
                n[i] = "1";
            }
        }
        int d = 0;
        for(int i = 0; i < n.length; i++){
            if(!n[i].equals("0")){
                d++;
            }
            if(d == 0){
                continue;
            }
            System.out.print(n[i]);
        }
    }

    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        String[] hou = str[0].split(":");
        int hour = Integer.parseInt(hou[0]);
        int minute = Integer.parseInt(str[1]);
        minute += Integer.parseInt(hou[1]);
        int m = minute / 60;
        minute %= 60;
        m += hour;
        m %= 24;
        System.out.printf("%02d:%02d",m,minute);
    }

    public static void main4(String[] args) {
        //小乐乐最近接触了求和符号Σ，他想计算的结果。但是小乐乐很笨，请你帮助他解答。
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main3(String[] args) {
        //KiKi和BoBo玩 “井”字棋。也就是在九宫格中，只要任意行、列，或者任意对角线上面出现三个连续相同的棋子
        //就能获胜。请根据棋盘状态，判断当前输赢。
        Scanner scanner = new Scanner(System.in);
        String[][] str = new String[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                str[i][j] = scanner.next();
            }
        }
        int i = 0;
        for(i = 0; i < 3; i++) {
            if (str[i][0].equals(str[i][1]) && str[i][1].equals(str[i][2])) {
                if(str[i][0].equals("K")){
                    System.out.println("KiKi wins!");
                    break;
                } else if (str[i][0].equals("B")){
                    System.out.println("BoBo wins!");
                    break;
                }
            } else if (str[0][i].equals(str[1][i]) && str[1][i].equals(str[2][i])){
                if(str[0][i].equals("K")){
                    System.out.println("KiKi wins!");
                    break;
                } else if (str[0][i].equals("B")){
                    System.out.println("BoBo wins!");
                    break;
                }
            } else if (str[0][0].equals(str[1][1]) && str[1][1].equals(str[2][2])){
                if(str[0][0].equals("K")){
                    System.out.println("KiKi wins!");
                    break;
                } else if (str[0][0].equals("B")){
                    System.out.println("BoBo wins!");
                    break;
                }
            } else if (str[0][2].equals(str[1][1]) && str[1][1].equals(str[2][0])){
                if(str[0][2].equals("K")){
                    System.out.println("KiKi wins!");
                    break;
                } else if (str[0][2].equals("B")){
                    System.out.println("BoBo wins!");
                    break;
                }
            }
        }
        if(i == 3){
            System.out.println("No winner!");
        }
    }

    public static void main2(String[] args) {
        //输出杨辉三角
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[30][30];
        arr[0][0] = 1;
        int n = scanner.nextInt();
        for(int i = 1; i < n; i++){
            arr[i][0] = 1;
            for(int j = 1; j < n; j++){
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.printf("%5d",arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main1(String[] args) {
        //KiKi有一个矩阵，他想知道经过k次行变换或列变换后得到的矩阵。请编程帮他解答。
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();
        for(int j = 0; j < k; j++) {
            String t = scanner.next();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (t.equals("r")) {//行行变换
                for (int i = 0; i < m; i++) {
                    int tmp = arr[a - 1][i];
                    arr[a - 1][i] = arr[b - 1][i];
                    arr[b - 1][i] = tmp;
                }
            } else if (t.equals("c")){//列列变换
                for (int i = 0; i < n; i++) {
                    int tmp = arr[i][a - 1];
                    arr[i][a - 1] = arr[i][b - 1];
                    arr[i][b - 1] = tmp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
