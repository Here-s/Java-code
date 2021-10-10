import java.util.Arrays;

public class ArrayTwo {
    public static void main(String[] args) {
        //打印数组   没必要和C语言一样每次都写一个打印
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        String ret = Arrays.toString(arr);//将数组以字符串的形式进行输出  就不用循环去输出了
        System.out.println(ret);
    }

    public static void swap(int[] array){
        int tmp = array[0];//tmp也在栈上 所以就把地址交换掉了
        array[0] = array[1];
        array[1] = tmp;
    }
    public static void main3(String[] args) {
        //通过数组来交换两个数
        int[] arr = {10,20};
        System.out.println(arr[0]+" "+arr[1]);
        swap(arr);
        System.out.println(arr[0]+" "+arr[1]);//也会把实参的值交换
    }

    public static void printarr(int[] array){
        //传的时候也是传地址
        for (int x:array) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main2(String[] args) {
        //数组作为参数进行传递
        int[] arr = {1,2,3,4};
        printarr(arr);
    }

    public static void main1(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(arr[100]);//程序错了 报异常Exception  数组下标越界 循环当中 也取不到数组的length
    }
}
