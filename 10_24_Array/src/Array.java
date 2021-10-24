import java.util.*;
public class Array {



    //数组传参：数组作为方法的参数
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};//new 是将数组开辟到堆区
        print(arr);
        //JVM分为  JVM 实际上是由 C/C++ 写的
        //Java虚拟机栈 本地方法栈 堆区 方法区 程序计数器
        //Java虚拟机栈：就是栈区
        //本地方法区：因为有一些方法是 C/C++ 写的 所以就在本地方法区运行
        //堆：放对象的地方
        //方法区：静态的变量
        //程序计数器：告诉你下一条指令是什么

        //这里的 arr 是一个变量 放的是{1,2,3,4,5} 的地址，就是一个引用
    }

    //引用也可以是 NULL 就是空引用
    public static void main5(String[] args) {
        int[] arr = null;//这里就是空引用
        //空引用是不能求长度的
        //如果报了空指针异常 就要去找 看看哪个引用可能是空的
    }

    //toString 方法  把数组转换为 字符串形式
    public static void main4(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        String ret = Arrays.toString(arr);
        System.out.println(ret);
    }

    //for 循环和 foreach 循环的区别是 for循环可以拿到下标，foreach 拿不到下标
    //foreach 常用在集合当中

    //遍历数组
    public static void main3(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //foreach 也能遍历数组  冒号后面跟数组名字 冒号左边写数组类型 和一个变量
        //输出的时候 也是那个变量
        for (int x: arr) {
            System.out.print(x+" ");
        }
    }

    public static void main2(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(arr.length);//通过数组名.length 就能知道数组有多长
        System.out.println(arr[3]);//第三个下标的元素 4
    }

    //new 是实例化一个对象  意味着Java 当中的数组 也是一个对象
    //new 开辟的数据在堆区
    //数组：存储一组相同数据类型的数据的集合
    public static void main1(String[] args) {
        //数组的创建
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[5];
        //最常用的方式：int[] arr = new int[]{1,2,3,4,5};
        int[] arr = new int[]{1,2,3,4,5};
    }
}
