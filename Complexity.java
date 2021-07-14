public class Complexity {

    //冒泡排序的时间复杂度  最好情况是：N次(因为嵌套里面的for循环要走一次)   最坏情况是：N^2(两套循环都要走 常数不算 所以是N^2)
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
    void func4(int N){//时间复杂度是 O1 因为是100 所以是常数 是大O1      N是问题的规模
        int count = 0;
        for(int k = 0;k<100;k++){
            count++;
        }
    }
    void func3(int N,int M){//时间复杂度 M+N 因为M  N不知道
        int count = 0;
        for(int k = 0;k<M;k++){//执行M次
            count++;
        }
        for(int k = 0;k<N;k++){//执行N次
            count++;
        }
    }
    void func2(int N) {//时间复杂度是ON 因为第一个循环是2*N 第二个是10  把所有系数都省略 就是ON(大O N)
        int count = 0;
        for (int k = 0; k < 2*N; k++){
            count++;
        }
        int M = 10;
        while((M--)>0){
            count++;
        }
    }
    void func1(int N){//此算法中的时间复杂度  先找执行次数最多的那条语句  所以时间复杂度就是N^2+2N+10  使用大O计算之后就是：N^2
        int count = 0;
        for(int i = 0;i<N;i++){//这里执行的是N*N
            for(int j = 0;j<N;j++){
                count++;
            }
        }
        for(int k = 0;k<2*N;k++){//这里执行的是2*N次
            count++;
        }
        int m=10;
        while((m--)>0){//这里是执行10次
            count++;
        }
    }

    public static void main(String[] args) {
        //时间复杂度 空间复杂度    如何求复杂度
        //复杂度：从两方面衡量一个算法的效率
       //时间复杂度：衡量有个算法的运行速度     空间复杂度：衡量一个算法执行过程中需要的额外空间
        //时间就复杂的：使用大O的渐近法来表示(N表示问题的规模)    先去找当前算法当中执行次数最多的那套语句  用1取代加法常数 只保留最高阶项
        //去除最高阶项的系数
        //例如在一个长度为N的数组里面找一个数据  最好情况：1次找到  最坏情况：N次找到   平均情况：N/2找到
        //平时说的时间复杂度都是最坏情况下的
    }
}
