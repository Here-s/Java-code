import java.util.Arrays;

public class ArrayReverse {

    public static void swap(int[] array){
        int left = 0;
        int right = array.length-1;
        while(left<right){
            while(left < right && array[left]%2 == 0){//说明是偶数 left<right 是为了防止数组越界
                left++;//是偶数 所以left++
            }
            //如果走到这里 说明left遇到奇数了
            while(left < right && array[right]%2 !=0){//！=0是因为这里是奇数
                right--;
            }
            //走到这里 说明right肯定指向一个偶数  那么接下来进行交换就好了
            if(left<right){//说明是上面那两个情况留下来的 因为如果走到下面来的话 可能是left和right相遇了 所有要加if
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        //数组数字排列 给定一个整形数组 将所有的偶数放在前半部分 将所有的奇数放在数组后半部分
        //例如 1 2 3 4 结果就是 2 4 1 3 这道题的做法和刚刚其实是一样的 要注意偶数在前面 技术在后面 如果后面遇到偶数了 就不动了
        //当不动的时候 就再看前面的那个数 如果前面那个数遇到奇数了 就也不需要动了 然后利用第三个变量来进行交换就好了
        //当两个下标一样就退出
        int[] arr = {1,2,3,4,5,6};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] array){
        int left = 0;
        int right = array.length-1;
        while(left < right){
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }
    public static void main1(String[] args) {
        //数组逆序  假设有一组数据{1，2，3，4，5}  重新等于一个tmp的值 来通过tmp的来交换值
        int[] arr = {1,2,3,4,5,6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
