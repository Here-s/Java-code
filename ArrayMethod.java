import java.util.Arrays;

public class ArrayMethod {
    //以后的字符串拼接方法主要是用 StringBuffer  和StringBuilder(一般用这个来拼)

    public static String myToString(int[] arr){
        //要养成分析的好习惯  在打印之前先打印一个[ 然后就是遍历数组加打印逗号 遍历结束之后再来个] 就行了
        String ret = "[";//String字符串 用来拼接 这就是这道题的主要方法
        for(int i=0;i<arr.length;i++){
            ret += arr[i];
            if(i!=arr.length-1)
            ret += ",";
        }
        ret+="]";
        return ret;
    }
    public static void main(String[] args) {
        //数组转字符串  就是通过自己的方法来实现toString
        int[] array = {12,24,1,6,2,9,21};
        System.out.println(myToString(array));
    }

    public static void main2(String[] args) {
        //Arrays操作数组
        int[] array = {12,24,1,6,2,9,21};//对数组进行从大到小排序
        Arrays.sort(array);//这样就直接排序好了
        System.out.println(Arrays.toString(array));
    }

    public static int[] func(int[] array){//这里是重新申请了一块内存 然后修改的数组的值
        int[] tmp = new int[array.length];
        for(int i=0;i< array.length;i++){
            tmp[i] = array[i]*2;
        }//这下就把数组弄到tmp里面了 并且完成了翻倍
        return tmp;//直接把tmp数组返回就好了 所以方法的类型就写成int[] 因为tmp就是int[] 所以方法就写成这样
    }
    public static void main1(String[] args) {
        //数组作为方法的返回值
        //使用一个方法把数组的值扩大二倍  并且不能在原来的数组上面修改  所以就一个重新申请一块内存来修改
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = func(array);
        System.out.println(Arrays.toString(ret));//返回的数组并没有修改原来的数组大小
        //Arrays 把它叫做操作数组的工具类  功能非常强大 要操作数组的时候 就调用Arrays
    }
}
