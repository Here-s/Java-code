public class RecursionTwo {

    public static int fabonaci2(int n){
        int f1=1;
        int f2=1;
        //注意： 如果n是1或者0的时候 那么 这里就有问题
        int f3=0;
        for(int i=3; i<=n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }
    public static int fabonaci(int n)
    {
        if(n==1||n==2){
            return 1;
        }
        return fabonaci(n-1)+fabonaci(n-2);
    }
    public static void main(String[] args) {
        //用递归计算斐波那契数列   这些都是单路递归 单独的递下去 再归回来就好了  这次的是双路递归 因为有了if判断 这就像一个二叉树
        //递归的话 会有很多重复计算
        //二叉树的很多题都是用递归算的
        System.out.println(fabonaci(4));
        System.out.println(fabonaci2(50));//超过了int的取值范围 所以是负数
    }
}
