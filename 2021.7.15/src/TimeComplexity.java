public class TimeComplexity {
    //二叉树基本都是多路递归实现的

    //计算斐波那契数列的时间复杂度   这个是多路递归 因为要同时求两个  最好情况下：每个地方都要递归 所以递归了：2^n-1
    //所以时间复杂度就是2^n
    int fibonacci(int N){
        return N<2? N :fibonacci(N-1)+fibonacci(N-2);
    }

    //计算阶乘递归的时间复杂度    递归了多少次:递归下去再回来 所以时间复杂度就说：O(n)
    long factorial(int N){
        return N<2? N:factorial(N-1)*N;
    }

    //一般时间复杂度最常见的是O(n)   O(log以2为底n)(这个是最小的)  还有O(n^2)

    //二分查找的时间复杂度    假设有两个数据 找两次就行了    假设有四个数据 第一次先砍一半 然后再找两次
    //假设8个数据 先砍一般 再砍一半 然后再找两次 就是四次   n个数据的话 假设要找x次 就是2^(x-1)=n 所以log以2为底的n=x-1
    //所以x=log以2为底n+1  x=log以2为底n   所以时间复杂度就是log以2为底n
    int binarySearch(int[] array,int value){
        int begin = 0;
        int end = array.length - 1;
        while(begin <= end){
            int mid = begin + ((end-begin)-2);
            if(array[mid]<value){
                begin = mid +1;
            }
            else if(array[mid]>value){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
