import java.util.Arrays;

public class BubbleSort {
    //冒泡排序性能比较低 Java当中内置了更高效的排序 比如Arrays.sort
    public static void bubbleSort(int[] array){//还能优化 如果本来就是有序的 那么就浪费时间了 如果第一次走完就有序了 就直接返回
        //每一趟完成之后 都要判断是否有序了 如果某一趟已经有序了 就不用排序了 使用boolean类型

        for(int i=0;i< array.length-1;i++){//用i来控制趟数 有n个数据 要比较n-1趟
            boolean flg = false;//没有发生交换 每一趟开始都把flg变成false 因为这样的话 每一趟走完flg都是false 就不会有影响了
            for(int j= 0;j< array.length-1-i;j++){//有五个元素 第一次最多走到第四个元素 也就是下标是3 而且以后每次都比上一次少1
                //因为每一次比上一次都少1 但是i每一次都比上一次多1 所以再-i就好了
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if(flg == false){//每一趟走完都判断flg是否等于false 等于就说明这趟没有交换
                break;//跳出循环就好了
            }
        }

    }
    public static void main(String[] args) {
        //冒泡排序
        //比如说有一组数据 9 12 8 5 10 冒泡排序是排很多趟
        // 第一趟 用j=0的下标去遍历一个数组 比较9和12 9比12小 所以j++ 12和8比较 12比8大 那就让12和8做交换 然后是12和5
        //继续交换 直到12放到最后 就是把最大的放到最后一个 第二次的话 就不需要拿最后一个和倒数第二个比较了 因为最后的是排好的
        //有五个数据 比较了4t趟 每一趟的次数都比上一次少1
        int[] arr = {1,2,3,10,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
