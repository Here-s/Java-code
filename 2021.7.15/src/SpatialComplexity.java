public class SpatialComplexity {


    //计算递归Fibonacci的空间复杂度 执行的时候 是分为左右两部分执行的 因为是二叉树 执行完左边之后 右边的也可以使用左边的空间
    //所以左边最多申请 n个空间    所以空间复杂度是 On  空间复杂度的高度就是这棵树的高度  对于整个树来说结点就是 2^n-1
    int Fibonacci(int n){
        return n<2? n:Fibonacci(n-1)+Fibonacci(n-2);
    }

    //计算递归阶乘factorial的空间复杂度  On 因为要递下去 归回来  所以要保护递下去的空间 所以是On
    long factorial(int N){
        return N <2?N:factorial(N-1)*N;
    }

    //fibonacci的空间复杂度  时间复杂度是On
    int[] fibonacci(int n){
        int[] fibArray = new int[n+1];
        fibArray[0] = 0;
        fibArray[1] = 1;
        for(int i = 2;i<=n;i++){
            fibArray[i] = fibArray[i-1]+fibArray[i-2];
        }
        return fibArray;
    }

    //冒泡排序的空间复杂度  是O1  因为没有额外的空间
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean flg = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flg = true;
                }
            }
            if (flg == false) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        //空间复杂度是对一个算法在运行过程中临时占用存储空间大小的量度  也是大O定义
        //比如说逆置一个数组  在原来的情况下 new一个数组 把逆置之后的数组放到新的里面 这个new的就是额外的空间
    }
}
