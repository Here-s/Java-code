public class Array {
    public static void main(String[] args) {
        //求长度的话这样  用自己的length来求长度
        int[] arr = {1,2,3,4};
        int len = arr.length;
        System.out.println(len);
        for(int i = 0;i<arr.length;i++){//用for循环来打印的话 是通过索引来的 如果想吧下标为2的值扩大二倍就用for循环
            System.out.println(arr[i]);//利用for循环来输出数组
        }
        //还有另外一种打印方式 foreach  括号里面的后面部分是数组名字 前面是数据类型
        for (int val:arr) {//使用foreach的话 就不需要索引  如果只是想单纯的遍历数组 就用foreach 因为不需要下标
            System.out.println(val);
        }
    }

    public static void main1(String[] args) {
        //数组：定义100个整型 是相同数据类型 就可以用数组来定义   数组就是存放相同数据类型的集合 内存是连续的
        //定义一个数组 int[] arr = {1,2,3,4,5,6,7,8,9,10};  整体初始化 数组长度为10  并且是整型数组 没有new 也在堆上
        //Java的数组是引用类型 数据在堆上
        //还能这样写  int[] arr2 = new int[]{11,22,33,44}; Java定义数组的时候 无需指定数组的大小
        //还有一种定义方式 int[] arr3 = new int[4];数组里面放的是0 四个数都是0
        //new是实例化一个对象  这里的arr123是变量名 放在栈上
        int[] arr = {1,2,3,4,5,6,7,8,9,10};//用的最多
        int[] arr2 = new int[]{11,22,33,44};
        int[] arr3 = new int[4];//创建好大小不赋值
        System.out.println(arr);//栈上的地址是拿不到的 堆上的地址可以打印 但不是真实的 是被处理的 但是可以当作是真的 因为是唯一的
    }
}