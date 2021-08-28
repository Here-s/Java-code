import java.util.*;
public class Main {

    public static void main(String[] args) {
        //编写一个函数，求一个数字是否是回文数。回文数概念：给定一个数，这个数顺读和逆读都是一样的。例如：
        //121，1221是回文数，123，1231不是回文数
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        int flag = 1;
        while(left <= right){
            if(arr[left] != arr[right]){
                flag = 0;
                break;
            }
            left++;
            right--;
        }
        if(flag == 1){
            System.out.println("回文数");
        } else {
            System.out.println("不是回文数");
        }
    }

    public static void main2(String[] args) {
        //输入两个字符串，从第一字符串中删除第二个字符串中所有的字符
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1 = scanner.nextLine();
        char[] arr = str.toCharArray();
        char[] arr1 = str1.toCharArray();
        int j = 0;
        int flag = 1;
        for(int i = 0; i < arr.length; i++){
            flag = 1;
            for(j = 0; j < arr1.length; j++) {
                if(arr[i] == arr1[j]) {
                    flag = 0;
                    continue;
                }
            }
            if(flag == 1){
                System.out.print(arr[i]);
            }
        }
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //找出数组当中仅出现一次的数
        int[] arr = new int[]{1,3,5,7,1,3,5,9};
        Arrays.sort(arr);
        int ret = 0;
        for(int i = 0; i < arr.length; i++){
            ret ^= arr[i];
        }
        System.out.println(ret);
    }
}
