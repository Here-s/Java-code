import java.util.Arrays;

public class TwoArrays {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        for (int[] tmp:array) {//因为数组里面的每个元素都是引用 是引用 所以拿数组来接受 所以前面写的就是int[]
            for (int x:tmp) {//因为tmp是个数组 所以不能直接打印 再用一个foreach来打印tmp数组里面的元素
                System.out.print(x+" ");
            }
        }
        System.out.println();
    }

    public static void main2(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};//这一堆依然是对象 和一维数组的存储方式一样   二维数组是特殊的一维数组
        //Java当中的二维数组 实际上是一个一维数组当中的每个元素 是一维数组 array是在栈上 指向两行 这两行都是由一个东西指向的
        //这个东西也在栈上
        for(int i=0;i<2;i++){//最外层控制的是行数
            for(int j=0;j<3;j++){//最内层控制的是列数
                System.out.print(array[i][j]+" ");
            }
        }
        System.out.println();
        //用for循环来打印的时候 i j
        for(int i=0;i<array.length;i++){//以为是行 所以就可以直接用这个
            for(int j=0;j<array[i].length;j++){//因为是两行三列 这里是小于这一行对应的列数
                System.out.print(array[i][j]+" ");
            }
        }
        System.out.println();
        //打印二维数组还能使用Arrays.deepToString的深度打印
        System.out.println(Arrays.deepToString(array));
    }

    public static void main1(String[] args) {
        //二维数组(用的不多)   引用 其实就是地址    二维数组又分为规则的二维数组和不规则的二维数组
        //二维数组定义方式
        //下面的这三种都是规则的二维数组
        int[][] array = {{1,2,3},{4,5,6}};//第一种写法  两行三列的二维数组 前面的方框里面不能出现具体的数字  一般用这个
        int[][] array2 = new int[][]{{1,2,3},{4,5,6}};//第二种写法
        int[][] array3 = new int[2][3];//两行三列
    }
}
