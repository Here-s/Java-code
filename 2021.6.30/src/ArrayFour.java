import java.util.Arrays;

public class ArrayFour {
    public static void main(String[] args) {
        //第四种方法  克隆方法 就相当于产生了这个对象的副本  是一个Object的克隆方法 是所有类的父类 这个是浅拷贝
        //上面这四种方法都是浅拷贝  拷贝之后 生成了一个数组 通过array2修改array2自己的元素 且不会影响到array1 这种就是深拷贝
        //在这里的拷贝之后 把array2[0]的值改为999 那么array[0]的值是原来的值 因为这里的数组是简单类型
        //如果数组当中存放引用类型 也就是放的是地址 假设第一个元素放的是a=10 那么拷贝的array2的元素也包含地址 这种就是浅拷贝
        //因为拿到的地址也指向a=10 那么array2[0].a=888 就把array1[0].a=888 因为是通过地址来操作的
        //只要问到 就说这四种拷贝是浅拷贝
        //就像说明这个说的浅拷贝 拷贝的时候先把这几个对象的值重新拷贝一份 然后把新拷贝的放到array2里面 这样实现深拷贝的时候在接口那里讲
        int[] array = {1,2,3,4,5,6,7,8};
        int[] ret = array.clone();
        System.out.println(Arrays.toString(ret));
    }

    public static void main3(String[] args) {
        //第三种方式就是  System.arraycopy();  通过System这个类和Arrays这个类 来找到 有五个参数
        //第一个参数是原数组 第二个是原数组当中开始拷贝的位置 第三个是目的地数组 第四个是考到哪个位置 第五个是拷贝的长度
        //第三种最快 因为底层是C/C++写的 跑的很快
        int[] array = {1,2,3,4,5,6,7,8};
        int[] ret = new int[array.length];
        System.arraycopy(array,0,ret,0,array.length);
        System.out.println(Arrays.toString(ret));
    }

    public static void main2(String[] args) {
        //使用Java来实现数组拷贝
        //在Java当中数组的拷贝有四种方式  1 利用for循环来拷贝  2 使用Arrays的方法来操作就行了 Arrays.copyOf
        //第三种方式就是  System.arraycopy();  通过System这个类和Arrays这个类 来找到 有五个参数
        //第一个参数是原数组 第二个是原数组当中开始拷贝的位置 第三个是目的地数组 第四个是考到哪个位置 第五个是拷贝的长度
        int[] array = {1,2,3,4,5,6,7};
        //通过查看源码 可以发现有两个参数 一个是原始数组 一个是数组的长度    返回值也要相对应
        int[] ret = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(ret));
    }

    public static int[] copyArray(int[] array){
        int[] array2 = new int[array.length];
        for(int i = 0;i<array.length;i++){
            array2[i]=array[i];
        }
        return array2;
    }
    //这里是通过自己的方法来实现数组的拷贝  但是Java可以直接来实现
    public static void main1(String[] args) {
        //数组的定义有三种  最常用的是int[] array = {1,2,3,4,5}; 下标也是从0开始
        //数组的内容在堆上   array叫做数组的引用 里面存储的是数组首元素的地址   数组可以作为参数 也可以作为返回值
        //一定要画图   Arrays——操作数组的工具类 放在java.util.Arrays包下面  Arrays包下面的很多方法
        //Arrays.toString();//将数组当中的数据以字符串的形式进行输出

        //数组拷贝   一个数组 四个元素 int[] array1 = {12,23,34,45};  假设要拷贝到数组array2当中
        int[] array = {1,2,3,4,5,6,7};
        int[] array2 = copyArray(array);
        System.out.println(Arrays.toString(array2));
    }
}
