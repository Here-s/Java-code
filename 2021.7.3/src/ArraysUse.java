import java.util.Arrays;

public class ArraysUse {

    public static boolean isUp(int[] array){//是升序，返回true 否则返回false
        for(int i = 0;i< array.length;i++){
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //给定一个整型数组，判断是否该数组是有序的(升序)
        int[] arr = {1,2,3,10,5,6};//判断数组是不是升序的
        boolean a = isUp(arr);
        System.out.println(a);
    }

    public static void main2(String[] args) {
        //排序 sort
        int[] array = {12,2,5,78,95,34};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void main1(String[] args) {
        //Arrays中的常用方法介绍
        //toString()  binarySearch()   copyOf()   二分查找还可以弄成从哪里开始查找 从那里结束  Java的查找范围一般都是左闭右开
        //copyOfRange 拷贝区间
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] ret = Arrays.copyOfRange(arr,2,5);//也是证明了左闭右开
        System.out.println(Arrays.toString(ret));
        //equals 判断两个数组一样不一样
        System.out.println(Arrays.equals(arr, ret));//equals是布尔类型
        //fill 是填充的意思
        int[] arr2 = new int[10];
        Arrays.fill(arr2,8);//表示填充的对象是arr2 填充值是8 也可以局部填充 就和什么那个一样
        System.out.println(Arrays.toString(arr2));
    }

}
