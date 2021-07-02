import java.util.Arrays;

public class ArrayBinarySearch {

    public static void main(String[] args) {
        //当然Java提供了二分查找的方法
        int[] arr = {2,5,8,9,13};
        int ret = Arrays.binarySearch(arr,13);
        System.out.println(ret);
    }

    public static int binarySearch1(int[] array,int key){
        int left = 0;
        int right = array.length-1;
        while(left<=right){
            int mid = (left+right)/2;//这里也可以不除2 直接>>>1 无符号右移一位 无符号右移是最快的 右移相当于除2
            if(array[mid]<key){//说明中间值比要找的数要小
                left = mid+1;
            }
            else if(array[mid]==key){//说明找到了
                return mid;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main1(String[] args) {
        //查找数组中指定元素(二分查找)
        //针对有序数组  可以使用更高效的二分查找
        //二分查找的思路就是先取中间位置的元素 看要找的值比中间元素大还是小，如果小，就去左边找 否则就去右边找
        int[] arr = {2,5,8,9,13};
        int ret = binarySearch1(arr,19);
        System.out.println(ret);
    }
}
