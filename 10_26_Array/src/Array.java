import java.util.*;
public class Array {

    //不规则二维数组
    public static void main(String[] args) {
        int[][] array = {{1,2},{4,5,6}};
        System.out.println(Arrays.deepToString(array));
        //Java当中的二维数组可以省略列
        int[][] arr = new int[2][];//有两个元素 每个元素的值是 null
        arr[0] = new int[3];//第一行有三个元素
        arr[1] = new int[2];//第二行有两个元素  不规则二维数组
    }

    //打印二维数组   二维数组其实是一个特殊的一维数组
    public static void main10(String[] args) {
        int[][] array = new int[][]{{1,2,3},{4,5,6}};
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                //array[i].length 就是表示这一行的长度
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //深度打印二维数组
        System.out.println(Arrays.deepToString(array));
    }

    //二维数组
    public static void main9(String[] args) {
        //表示两行三列  前面的 [][] 不能写东西
        int[][] array1 = new int[][]{{1,2,3},{4,5,6}};
        int[][] array2 = new int[2][3];//这里表示两行三列
    }

    //深拷贝：就是把所以对象全拷贝一份
    //浅拷贝：拷贝之后不作任何处理
    //通过 cloneable 接口可以实现深拷贝

    //如果数组里面放的是地址的话：拷贝之后还是地址，修改拷贝数组地址对应的值
    //原来数组地址对应的值也会被改变

    //数组拷贝的原理和刚开始的 for 拷贝一样

    //数组拷贝   Java自带的函数拷贝
    public static void main8(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] ret = Arrays.copyOf(arr,arr.length*2);//参数是拷贝的原数组
        //第二个参数是拷贝长度  乘2 之后就是长度变成了2倍 就是数组扩容

        int[] ret1 = Arrays.copyOfRange(arr,1,3);//拷贝的是下标1 到下标 2  Java当中一般是左闭右开

        //System.arraycopy();  五个参数 第一个是原数组 第二个是从原数组的开始拷贝位置 第三个是拷贝的目的地数组
        //第四个是 目的地数组的开始位置   第五个是拷贝长度。  这种拷贝方法是比较快的

        int[] copy = new int[arr.length];
        System.arraycopy(arr,0,copy,0,arr.length);

        int[] copy1 = arr.clone();//这样就直接把数组克隆出来了。就是产生一个一模一样的副本
        System.out.println(Arrays.toString(copy1));
    }

    //数组的拷贝   通过 for 循环拷贝
    public static int[] copyArray(int[] arr){
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];//改变 copy 数组的值 不会影响原来数组的值
        }
        return copy;
    }
    public static void main7(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] ret = copyArray(arr);
        System.out.println(Arrays.toString(ret));
        System.out.println(Arrays.toString(arr));
    }

    //数组排列  给定一个数组，把偶数全放在前面 奇数放在后面
    //所以前面的遇到奇数 停下来，后面的遇到偶数也停下来 然后交换。
    public static void swap(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while (i <= j){
            while (arr[i]%2 == 0){
                i++;
            }
            //说明遇到奇数了
            while(i < j && arr[j] % 2 != 0){
                j--;
            }
            //说明遇到偶数了
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }
    public static void main6(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }

    //逆置数组
    public static void reverse(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i <= j){
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }
    public static void main5(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    //填充数组
    public static void main4(String[] args) {
        int[] arr = new int[10];
        int[] arr1 = new int[10];
        Arrays.fill(arr,99);//填充 10 个 99
        Arrays.fill(arr1,2,9,999);//填充数组下标的 2-8 为999
        //因为是左闭右开的
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }

    //Java当中也有排序包 Arrays.sort()
    public static void main3(String[] args) {
        int[] arr = new int[]{1,2,3,7,5,4,6,9,8,10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //冒泡排序
    //每一趟之后 最大的元素就排到最后了
    //如果有一次没交换 就说明已经排好序了
    //n个数据 比较 n-1 趟    每趟的比较次数一直减少
    public static void bubbleSort(int[] arr){
        //i 表示比较趟数
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = true;
                }
            }
            if(!flag){
                return;
            }
        }
    }
    public static void main2(String[] args) {
        int[] arr = new int[]{1,2,3,7,5,4,6,9,8,10};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //给定一个数组 判定是否升序
    public static boolean judge(int[] arr){
        for (int i = 1; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }
    public static void main1(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        boolean b = judge(arr);
        System.out.println(b);
    }
}
