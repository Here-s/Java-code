public class ArrayTest {

    public static void main(String[] args) {
        //一个数组 [1,4,3,1,2,3,4] 找出这个数组当中只出现一次的数字  这里用位运算符  & | ^ 这三个经常考  这里考异或
        //两个相同的数字 如果进行异或 那么结果就是0  0异或任何数字的结果都是任何数字  因为异或是二进制位相同为0 相异为1
        //位运算符也有交换律  所以这里的抑或结果就是2
        int[] arr = {1,4,3,1,2,3,4};
        int tmp = 0;
        for(int i=0;i<arr.length;i++){
            tmp ^= arr[i];
        }
        System.out.println(tmp);
    }
}
