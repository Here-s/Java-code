public class ArrayThree {

    public static void main(String[] args) {
        //null 空引用
        //int a;  a没有初始化就打印a的话 就会报错  数组也一样 不初始化的话 也会报错
        //Java数组的初始化为0 应该这样初始化
        int[] arr = null;//初值赋为null就好了
        System.out.println(arr);//这里的arr是引用空对象  因为是空对象 所以也不能访问arr[0] 不然就会报错 报错空指针
        //jdk1.7开始 运行时常量就被放到虚拟机了   每个线程都会有自己的程序计数器 Java虚拟机栈 本地方法栈
        //堆和方法区是所有线程共享的  所有程序都会在Java虚拟机里面跑  虚拟机栈里面放的是局部变量
        //本地方法栈里面保存的是native方法栈  Java的有些源码是C和C++写的  所以底层实现是C和C++的 所以运行很快
        //C和C++是偏向硬件的 所以在底层运行很快  而Java是应用型语言
        //程序计数器里面放的是下一条执行的指令的地址 空间非常小
        //方法区存的是类的信息 常量 静态变量
        //运行时常量值 一般放的是字符串常量与符号引用
        //操作系统是程序员的内功
    }

    public static void func(int[] array){
        array[0]=10;
    }
    public static void main1(String[] args) {
        //理解引用类型 重点难点
        int[] arr = {1,2,3};//这样就是引用 两个引用指向同一块内存  引用就相当于保存的地址
        func(arr);
        System.out.println(arr[0]);
    }
}
