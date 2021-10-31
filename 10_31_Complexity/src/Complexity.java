import java.util.*;
public class Complexity {

    //阶乘的空间复杂度
    //递归的空间复杂度有一个特点：每递归一次开辟一块内存 所有也是 O(n)

    //斐波那契数列的空间复杂度：O(n) 因为每一项都要存起来

    //冒泡排序的空间复杂度：O(1) 因为变量没有变化

    //对于斐波那契数列时间复杂度
    //可以分为两部分，一部分多 一部分少
    //每层有 2^n-1 个节点。 就是 2^0+2^1+2^2+2^3……2^(n-1)
    //求的结果就是：2^n+1 = 2^n

    // 计算阶乘递归Factorial的时间复杂度？
    //递归的时间复杂度 = 递归的次数*每次递归执行的次数
    //比如递归5次 每次循环n次 时间复杂度就是5n
    long factorial(int N) {
        return N < 2 ? N : factorial(N-1)*N;
    }

    // 计算binarySearch的时间复杂度？
    //时间复杂度是：log2n
    int binarySearch(int[] array, int value) {
        int begin = 0;
        int end = array.length - 1;
        while (begin <= end) {
            int mid = begin + ((end-begin) / 2);
            if (array[mid] < value)
                begin = mid + 1;
            else if (array[mid] > value)
                end = mid - 1;
            else
                return mid;
        }
        return -1;
    }


    //计算时间复杂度的时候，一定要结合思想，不能光看代码
    //n*(n-1) = n^2-n ---> n^2  冒泡排序最坏情况
    //冒泡排序：最好情况下，比较一次 O(n)

    // 计算func4的时间复杂度？
    //因为是常数 所以是 O(1)
    void func4(int N) {
        int count = 0;
        for (int k = 0; k < 100; k++) {
            count++;
        }
        System.out.println(count);
    }

    // 计算func3的时间复杂度？
    //是 O(M+N) 因为不知到 M N 是多少
    void func3(int N, int M) {
        int count = 0;
        for (int k = 0; k < M; k++) {
            count++;
        }
        for (int k = 0; k < N ; k++) {
            count++;
        }
        System.out.println(count);
    }


    //O(N)
    void func2(int N){
        int count = 0;
        for (int k = 0; k < 2 * N ; k++) {
            count++;
        }
        int M = 10;
        while ((M--) > 0) {
            count++;
        }
        System.out.println(count);
    }

    //算法的效率：时间效率：时间复杂度（衡量运算速度）  空间效率：空间复杂度（衡量占用空间）
    //怎么衡量一个算法的时间复杂度：一个算法花费的时间是与语句执行次数多少有关。所以就可以按照语句的执行次数来表示

    //这个算法的时间复杂度，N^2+2N+10 但是当 N 足够大的时候 2N和10 就可以忽略了
    //所以只需要有个大概的执行次数就行了：N^2
    //推导大O的计算方法：
    //1、用常数1取代运行时间中的所有加法常数。
    //2、在修改后的运行次数函数中，只保留最高阶项。
    //3、如果最高阶项存在且不是1，则去除与这个项目相乘的常数。得到的结果就是大O阶。

    //另外有些算法的时间复杂度存在最好、平均和最坏情况：
    //最坏情况：任意输入规模的最大运行次数(上界)
    //平均情况：任意输入规模的期望运行次数
    //最好情况：任意输入规模的最小运行次数(下界)
    //例如：在一个长度为N数组中搜索一个数据x 最好是 1 最差是 N 平均情况是：N/2

    //平时讨论的时间复杂度都是最坏情况下
    void func1(int N){//这个是 O(N^2)
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                count++;
            }
        }
        for (int k = 0; k < 2 * N; k++) {
            count++;
        }
        int M = 10;
        while ((M--) > 0) {
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {

    }
}
