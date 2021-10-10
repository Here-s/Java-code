public class Recursion {

    public static int func2(int n){
        //1729  1729%10=9+func2(172)  就按照这样就行了 所以就是 n%10+func2(n/10);
        //终止条件是只有一位数的时候 就把这一位数加起来就行了
        if(n<10){
            return n;
        }
        return n%10+func2(n/10);
    }
    public static void main(String[] args) {
        //写一个递归方法 输入一个非负整数 发布会组成他的数字之和 例如 输入1729  则返回1+7+2+9 他的和是19
        int tmp = func2(1729);
        System.out.println(tmp);
    }

    public static int sum(int n){
        //n+sum(n-1) 就是结束条件
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main2(String[] args) {
        //求1加到10 用递归求
        int ret = sum(10);
        System.out.println(ret);
    }

    public static void func1(int n){
        //123 打印123的每一位 递归是递下去 归回来  n一定要大于9
        if(n>9){//终止条件是一位数 这样就完成了代码的递归
            func1(n/10);
        }
        System.out.println(n%10);
    }
    public static void main1(String[] args) {
        //思考递归的时候  横向思考 不要试图去走进递归的代码 不要想着去展开 代码执行纵向
        //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)  用递归可以顺序输出
        func1(123);
    }
}
