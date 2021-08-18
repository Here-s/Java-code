import java.util.*;

public class test {

    public static void swap1(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 1){
                for(int j = arr.length - 1; j >= i; j--){
                    if(arr[j] % 2 == 0){
                        int tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        //给定一个整形数组 将所有的偶数放在前半部分 将所有的奇数放在数组后半部分
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        swap1(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }
    public static void main19(String[] args) {
        //数组逆序  假设有一组数据{1，2，3，4，5}  将它前后逆序
        int[] arr = new int[]{1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void main18(String[] args) {
        //给定一个整型数组，判断是否该数组是有序的(升序)
        int[] arr = new int[]{1,2,3,5,4};
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr,arr2));
    }

    public static void main17(String[] args) {
        //Arrays中的常用方法介绍
        //toString()  binarySearch()   copyOf()   二分查找还可以弄成从哪里开始查找 从那里结束  Java的查找范围一般都是左闭右开
        //copyOfRange 拷贝区间
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] ret = Arrays.copyOfRange(arr,2,8);
        System.out.println(Arrays.toString(ret));
        //equals 比较两个字符串是否相等
        System.out.println(Arrays.equals(arr,ret));
        //fill 是填充的意思
        int[] arr2 = new int[10];
        Arrays.fill(arr2,8);//表示填充的对象是arr2 填充值是8 也可以局部填充
        System.out.println(Arrays.toString(arr2));
    }

    public static void main16(String[] args) {
        //完成一个二分查找
        int[] arr = new int[]{5, 2, 13, 8, 9};
        Arrays.sort(arr);
        int ret = Arrays.binarySearch(arr,8);
        System.out.println(ret);
    }

    public static int find(int[] arr, int k){
        for(int i = 0; i < arr.length; i++){
            if(k == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main15(String[] args) {
        //查找数组中指定元素(顺序查找)  给定一个数组 在给定一个元素，找出该元素在数组中的位置
        int[] arr = new int[]{1,12,3,6,2,7,9,23,56};
        int k = 7;
        System.out.println("找到了，下标是："+find(arr, k));
    }

    public static int maxNum(int[] arr){
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main14(String[] args) {
        //找数组中的最大元素  给定一个数组，找到其中的最大元素(找最小元素同理)
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(maxNum(arr));
    }

    public static void main13(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] ret = arr.clone();
        System.out.println(Arrays.toString(ret));
    }

    public static void main12(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr,0,arr2,0,arr.length);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr));
    }

    public static void main11(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr2));
    }

    public static String tomyString(int[] arr){
        String str = "[";
        for(int i = 0; i < arr.length; i++){
            str += arr[i];
            if(i != arr.length - 1){
                str += ",";
            }
        }
        str += "]";
        return str;
    }
    public static void main10(String[] args) {
        //通过自己的方法来实现toString
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        System.out.println(tomyString(arr));
    }

    public static void main9(String[] args) {
        //对数组进行排序
        int[] arr = new int[]{12,34,65,12,3,4,6,6,8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] func1(int[] arr){
        int[] tmp = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            tmp[i] = arr[i] * 2;
        }
        return tmp;
    }
    public static void main8(String[] args) {
        //使用一个方法把数组的值扩大二倍  并且不能在原来的数组上面修改  所以就一个重新申请一块内存来修改
        int[] arr = new int[]{1,2,3,4,5};
        int[] ret = func1(arr);
        System.out.println(Arrays.toString(ret));
    }
    public static void main7(String[] args) {
        //将数组以字符串的形式输出
        int[] arr = new int[]{1,2,3,4,5};
        String str = Arrays.toString(arr);
        System.out.println(str);
    }

    public static void swap(int[] arr){
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }
    public static void main6(String[] args) {
        //通过数组来交换两个数
        int[] arr = new int[]{1, 2};
        for (int x: arr) {
            System.out.println(x);
        }
        swap(arr);
        for (int ret: arr) {
            System.out.println(ret);
        }
    }

    public static void printarr(int[] arr){
        for (int ret: arr) {
            System.out.println(ret);
        }
    }

    public static void main5(String[] args) {
        //数组作为参数传递
        int[] arr = new int[]{1,2,3,4,5};
        printarr(arr);
    }

    public static void main4(String[] args) {
        //定义数组
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[4];
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int ret: arr) {
            System.out.println(ret);
        }
    }

    public static int JumpFloor(int target) {
        if (target == 1) {
            return 1;
        } else if (target == 2) {
            return 2;
        } else {
            return JumpFloor(target - 1) + JumpFloor(target - 2);
        }
    }

    public static void main3(String[] args) {
        //青蛙跳台阶
        //考得比较多  一个青蛙一次可以跳上1级台阶，也可以跳上2级，求该青蛙跳上一个n级台阶总共有多少种跳法（先后次序不同不算不同的结果）
        //有一个台阶 只有一种跳法    有两个台阶 就有两种跳法   有三个台阶 就是一个台阶的跳法加上两个台阶的跳法 三种跳法
        //如果有四个台阶 就是一个台阶的跳法加上另外三个台阶的跳法
        //当n>2时 就有两种选择 第一种是跳一个台阶 剩下的跳法是n-1个台阶的跳法
        //第二种是跳2个台阶 剩下的跳法是n-2个台阶的跳法
        //所以n个台阶的总的跳法就是 n-1的跳法加上n-2的跳法  所以四个台阶就是两个台阶的跳法加上3个台阶的跳法 就是五种方法
        //就是刚开始跳一个台阶还是跳两个台阶 问题就是在这里发生变化 所以剩下的n-1 n-2个台阶 就有是这种情况 所以就可以直接调用
        //所以用递归来写就很好写
        System.out.println(JumpFloor(4));
    }

    public static void move(char pos1, char pos2) {//表示是从pos1到pos2
        System.out.print(pos1 + "->" + pos2 + " ");
    }

    public static void hanoi(int n, char pos1, char pos2, char pos3) {
        //n表示盘子的数量  pos1是起始位置 pos2是中途位置
        //pos3是目的地位置
        if (n == 1) {
            move(pos1, pos3);
        } else {
            hanoi(n - 1, pos1, pos3, pos2);//就是把那n-1个盘子挪到中间的B上面
            move(pos1, pos3);
            //继续递归之后 A上的盘子就挪到了C上面 所以再把B的盘子通过A挪到Ｃ上面
            hanoi(n - 1, pos2, pos1, pos3);
        }
    }

    public static void main2(String[] args) {
        //递归求汉诺塔  输出步骤
        hanoi(1, 'A', 'B', 'C');
        System.out.println();
        hanoi(2, 'A', 'B', 'C');
        System.out.println();
        hanoi(3, 'A', 'B', 'C');
    }

    public static int fab2(int n) {
        int n1 = 1;
        int n2 = 1;
        int n3 = 1;
        for (int i = 3; i <= n; i++) {
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }

    public static int fab(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fab(n - 1) + fab(n - 2);
    }

    public static void main1(String[] args) {
        //递归计算斐波那契数列
        System.out.println(fab(2));
        System.out.println(fab2(2));
    }
}
