import java.util.*;
public class Array {

    //二分查找  顺序数组才能查找
    public static int binaryNum(int[] arr, int k){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int mid = (left + right)/2;
            if(arr[mid] > k){
                right = mid - 1;
            } else if(arr[mid] < k){
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int num = binaryNum(arr,2);
        System.out.println(num);
        int ret = Arrays.binarySearch(arr, 4);
        System.out.println(ret);
    }

    //找到某个元素 并且返回下标
    public static int findNum(int[] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }
    public static void main7(String[] args) {
        int[] arr = new int[]{12,18,1,2,5};
        int num = findNum(arr,2);
        System.out.println(num);
    }

    //找到数组的最大值
    public static int maxNum(int[] arr){
        if(arr == null){
            return -1;
        }
        if(arr.length == 0){
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main6(String[] args) {
        int[] arr = new int[]{12,18,1,2,5};
        int ret = maxNum(arr);
        System.out.println(ret);
    }

    //实现 toString 方法
    public static String myToString(int[] arr){
        if(arr == null){
            return null;
        }
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            if(i != arr.length - 1){
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }
    public static void main5(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

        System.out.println(myToString(arr));
    }

    //数组作为方法的返回值
    public static int[] func3(int[] arr){
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i] = 2 * arr[i];
        }
        return ret;
    }
    public static void func(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2*arr[i];
        }
    }
    public static void main4(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        //将数组元素扩大二倍
        func(arr);
        System.out.println(Arrays.toString(arr));
        int[] ret = func3(arr);
        System.out.println(Arrays.toString(ret));
    }

    //引用不一定在栈上  一个变量 在不在栈上 是由变量的限制决定的，
    //如果是一个局部变量 那就肯定在栈上  如果是实例成员变量 就不一定在栈上了。

    //Runtime Constant Pool Java运行时常量 JDK 1.8 之后就挪到堆区了

    public static void main3(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = arr1;//代表 arr2 引用 指向了 arr1这个引用指向的对象
        //引用只能指向对象，不能指向引用
        int[] arr3 = null;//这个引用 不指向任何对象

        //一个引用 不能指向多个对象 会出 bug
    }

    public static void func1(int[] array){
        //这里就把指向修改了，把引用的指向 指到了 new 的对象上面
        array = new int[]{11,12,13,14,15,16};
    }
    public static void func2(int[] array){
        array[0] = 899;
        //这里会修改值 因为引用指向的对象没有被修改 所以会改变值
    }
    public static void main2(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        func1(arr);
        System.out.println(Arrays.toString(arr));
        func2(arr);
        System.out.println(Arrays.toString(arr));
    }

    //通过数组来交换两个数的值
    public static void swap(int[] arr){
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }
    public static void main1(String[] args) {
        int a = 3;
        int b = 5;
        int[] arr = new int[]{a,b};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }
}
