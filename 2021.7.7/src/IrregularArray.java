public class IrregularArray {
    public static void main(String[] args) {
        //1 引用    2 Arrays 在java.util.Arrays   3 用一维数组 来处理代码问题    4 了解二维数组的内存结构

        //不规则二维数组  只指定行 没指定列  指定行数列数 就不能初始化  想初始化 就不能指定行数列数
        int[][] array = new int[2][];//C语言是可以指定列 行可以自动推导  Java必须指定行 列不可以自动推导
        //所以打印的时候 不知道有几列 依然输出不了 因为是null 就是空指针异常
        array[0] = new int[]{1,2,3};//这个二维数组的0号下标指向长度为3的一维数组  这里的值都是0 因为这里是把它定义了
        //把括号里面的3删了 在后面加上元素 就对这个数组赋值了 下面这个也同理
        array[1] = new int[]{4,5};//这个二维数组的1号下标指向长度为2的一维数组
        for(int i = 0;i< array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
