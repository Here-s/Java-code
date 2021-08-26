import java.util.*;
public class Main {

    public static void main(String[] args) {
        //找出数组中重复的数字 只需找到一个就行了
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{1,2,3,4,5,2};
        Arrays.sort(arr);
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i - 1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }

    public static void main1(String[] args) {
        //求一个数的二进制当中有几个1
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int count = 0;
        while(a != 0){
            count++;
            a &= (a - 1);
        }
        System.out.println(count);
    }
}
