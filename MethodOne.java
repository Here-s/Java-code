import java.util.*;
public class MethodOne {

    //每次写的时候 都写在方法里面 在main里面调用  因为功能会封装到类或者方法 不要写在main函数中 因为公司合并的时候会出错
    //Java当中定义方法的时候 写在main函数前面后面都可以

    public static void swap(int x,int y){//这里是交换形参值 不会对原来的实参有影响
        //形参只是实参的传递   用类和对象来实现 就能改变实参的值了  这是没有返回值的  想提前结束就return
        int tmp=x;
        x = y;
        y = tmp;
    }

    public static void main(String[] args) {
        //实参和形参的关系
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a+" "+b);//没被交换是因为这里是实参值
//        int tmp = a;
//        a = b;
//        b = tmp;
//        System.out.println(a+" "+b);
    }


    public static int sum(int a,int b){//这里是形参 就是值传递 没有地址传递 引用也是值传递
        return a+b;//return 代表函数的结束 return下面的代码都不会被执行
        //return是返回调用这个方法的地方
    }

    public static int factor(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            //每一个数字的阶乘  还能优化 因为是求每一个数的阶乘 所以可以再写一个方法
//            int ret =1;
//            for(int j=1;j<=i;j++){
//                ret*=j;
//            }
//           sum+=ret;//每次把阶乘的值赋给ret
            sum+=fac(i);//每次把fac的值加起来就好了
        }
        return sum;
    }
    public static int fac(int num){//这个方法是求某个数字的阶乘
        int ret =1;
        for(int j=1;j<=num;j++){
            ret*=j;
        }
        return ret;
    }

    public static void main2(String[] args) {
        System.out.println(factor(5));
    }

    public static void main1(String[] args) {
        //实现一个方法实现两个整数的相加
        //System.out.println(sum(10,20));//这样写更快
        int a=10;
        int b=20;
        int ret = sum(a,b);//这里是把值传过去
        System.out.println(ret);
        int ret2 = sum(20,80);
        System.out.println(ret2);
    }
}
