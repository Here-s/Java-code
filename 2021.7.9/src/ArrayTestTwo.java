public class ArrayTestTwo {


    public static void main(String[] args) {
        //面试常考数组和字符串

        //一个数组 [1,4,3,1,6,4] 找出这个数组当中只出现一次的数字 这里有两个出现一次的数
        int[] arr = {1,3,4,1,6,4};
        int tmp = 0;
        for(int i=0;i<arr.length;i++){
            tmp ^= arr[i];
        }
        //异或之后的结果就是3和6异或的结果 就是0011^0110=0101 既然结果是0101 那就说明两个1的地方之前不一样
        //找到第一个1之后 说明这里原来不一样 然后根据异或的结果 进行分类 对异或的结果的 从左往右/从右往左的第一次出现1的位置进行分类
        //找到第一个1的时候 就说明这个位置 原来的两个数 一个为1一个为0 接下来进行分类 根据异或的结果进行分类
        //对异或的结果进行分类  0000 0110    0000 0011  最终分的结果就说4 4 6    1 1 3 这两组 两个组都进行异或 就能得到结果了
        //只要分为两组 且每一组里面肯定只有一个出现一次的数字  446 是分到的一样的数字 因为情况一样  前提是有两个出现一次的数
    }
}
