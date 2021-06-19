public class MethedTwo {

    // 这样调用会含麻烦 Java提供了一种方法 统一使用sum  下面这两个sum就是重载
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }

    public static int sumInt(int a,int b){
        return a+b;
    }
    public static double sumDouble(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        //方法的重载  面试题：重载和重写的区别
        //重载：1 方法名相同(也就是这里的sum)   2 返回值可以不同(不做要求)  3 参数列表不同(参数的个数 或者 类型不同) 4 再同一个类当中
        //返回值不影响重载
        int a=10;
        int b=20;
        System.out.println(sumInt(a,b));//调用打印a+b ab都是整型
        double d1 = 19.9;
        double d2 = 18.8;
        System.out.println(sumDouble(a,b));//调用打印d1+d2 d1 d2都是整型   如果没有这个方法 使用sumInt调用的时候就会报错
        //报错是因为这里是 double sumInt是int类型  上面全部使用sum之后 这里就不会报错了 但是方法不能完全重复 不然会报错
        //这样的sum就是重载
    }

}
