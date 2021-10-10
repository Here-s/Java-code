public class FrogJumpedTheSteps {

    public static int JumpFloor(int target){
        if(target==1){
            return 1;
        }
        else if(target==2){
            return 2;
        }
        else{
           return JumpFloor(target-1)+JumpFloor(target -2);
        }
    }
    public static void main(String[] args) {
        //考得比较多  一个青蛙一次可以跳上1级台阶，也可以跳上2级，求该青蛙跳上一个n级台阶总共有多少种跳法（先后次序不同不算不同的结果）
        //有一个台阶 只有一种跳法    有两个台阶 就有两种跳法   有三个台阶 就是一个台阶的跳法加上两个台阶的跳法 三种跳法
        //如果有四个台阶 就是一个台阶的跳法加上另外三个台阶的跳法
        //当n>2时 就有两种选择 第一种是跳一个台阶 剩下的跳法是n-1个台阶的跳法
        //第二种是跳2个台阶 剩下的跳法是n-2个台阶的跳法
        //所以n个台阶的总的跳法就是 n-1的跳法加上n-2的跳法  所以四个台阶就是两个台阶的跳法加上3个台阶的跳法 就是五种方法
        //就是刚开始跳一个台阶还是跳两个台阶 问题就是在这里发生变化 所以剩下的n-1 n-2个台阶 就有是这种情况 所以就可以直接调用
        //所以用递归来写就很好写
        System.out.println(JumpFloor(4));
    }
}
