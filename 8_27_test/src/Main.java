import java.util.*;
public class Main {


    public static void main(String[] args) {
        //对于一个字符串，找到第一次重复出现的字符
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] arr = str.toCharArray();
        int flag = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    flag = 1;
                    break;
                }
            }
            if(flag == 1){
                break;
            }
        }
    }

    public static void main3(String[] args) {
        //在字符串中找出第一个只出现一次的字符
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for(int i = 2; i < arr.length; i++){
            if(arr[i - 1] != arr[i - 2] && arr[i - 1] != arr[i]){
                System.out.println(arr[i - 1]);
                break;
            }
        }
    }

    public static void main2(String[] args) {
        //求数组中元素出现次数超过数组长度一半的数字。如： {1,2,3,2,2,2,5,4,2}
        //数字 2 为超过数组长度一半的数字
        int[] arr = new int[]{1,2,3,2,2,2,5,4,2};
        Arrays.sort(arr);
        int count = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i - 1]){
                count++;
                if(count > (arr.length / 2)){
                    System.out.println(arr[i]);
                }
            } else {
                count = 1;
            }
        }
    }

    public static int min(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }
    public static void main1(String[] args) {
//        有一个数组 a , 编写函数，求数组中前K个最小的数字
        int[] arr = new int[]{2,1,3,4,5,6};
        int ret = min(arr);
        System.out.println(ret);
    }
}
