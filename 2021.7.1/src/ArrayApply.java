public class ArrayApply {

    public static int find(int[] array,int k){//这里是顺序查找 最坏的情况是全部查找一遍 最快的是二分查找
        for(int i = 0;i<array.length;i++){
            if(array[i]==k){
                return i;
            }
        }
        return -1;//表示没有找到这个元素 因为数组是没有-1下标的
    }
    public static void main(String[] args) {
        //查找数组中指定元素(顺序查找)  给定一个数组 在给定一个元素，找出该元素在数组中的位置
        int[] arr = {12,2,18,24,76,13};//假设要找18
        int ret = find(arr,18);
        System.out.println("下标是："+ret);
    }

    public static int maxArray(int[] array){
        int max = array[0];
        for(int i=0;i<array.length;i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        return max;
    }
    public static void main1(String[] args) {
        //找数组中的最大元素  给定一个数组，找到其中的最大元素(找最小元素同理)
        int[] arr = {12,2,18,24,76,13};
        int ret = maxArray(arr);
        System.out.println(ret);
    }
}
