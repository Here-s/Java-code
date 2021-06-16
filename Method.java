import java.util.*;
public class Method {
    public static int maxNum(int num1,int num2){
        return num1>num2?num1:num2;
    }

    public static int threemaxNum(int num1,int num2,int num3){
        return maxNum(maxNum(num1,num2),num3);//对比较函数的重复调用
    }

    public static void main(String[] args) {
        //求三个数的最大值  使用if判断
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int ret = threemaxNum(n1,n2,n3);
        System.out.println(ret);
    }

    public static void main1(String[] args) {
        //Java当中的方法  就是C语言中的函数  可以把方法就看做是一个功能  main函数就是一个方法
        //在定义一个方法的时候 public static (这两个必须写) void(返回值) func(方法的名称) 接下来的小括号里面是写的形参列表
        //方法名要使用小驼峰的形式（第二个单词大写） 因为main是static 所以方法也全是static  这样才能被main调用
        //返回值看需求 如果有返回值 那么返回值的类型需要和方法的返回值类型匹配

        //形式参数列表（形参） 实参的一份值拷贝  也应该拿类型相同的来实现
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int ret = maxNum(n1,n2);//使用方法的话 一定要用一个返回值来接受
        System.out.println(ret);
    }
}
