import java.util.*;
public class Main {

    public static int[] twoSum(int[] arr, int k){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] + arr[j] == k && i != j){
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args){
        //求一个有序数组中两个元素值相加为k的数字，返回这两个元素的下标
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr1 = twoSum(arr,5);
        for (int a:arr1) {
            System.out.print(a+" ");
        }
    }

    public static int myPow(int x, int y){
        int a = 1;
        while(y != 0){
            a *= x;
            y--;
        }
        return a;
    }
    public static void main1(String[] args) {
        //模拟实现函数 pow(x,y)
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int ret = myPow(x, y);
        System.out.println(ret);
    }
}
