import java.util.*;//这样是表示 导入java.util目录下的所有包
public class GuessNumber {
    public static void main(String[] args) {
        //猜数字游戏  系统生成一个随机整数(1-100) 然后由用户输入一个猜测的数字 如果用户输入的数字比这个数字小 就提示 猜小了
        //反之 就提示猜大了 如果输入的数和随机数相等 就显示猜对了
        Scanner scan=new Scanner(System.in);
        Random random=new Random();//不需要用时间戳去生成一个随机数
        int randNum=random.nextInt(100);//Java当中生成随机数 要有两步 一是使用random这个类 用来生成Java当中的随机数
        //后面的100是表示生成的随机数是0-100 不包含100 包含0  但是要引用java.util.Random;这个包 在后面加一个100 随机数范围就是100-200
        //System.out.println(randNum);//每次生成的随机数的不一样的
        while(true){//因为要一直猜 所以写一个死循环 只有猜对的时候 才跳出循环
            System.out.println("请输入你要猜的数字：");
            int num=scan.nextInt();
            if(num<randNum){
                System.out.println("猜小了");
            }
            else if(num==randNum){
                System.out.println("猜对了");
                break;
            }
            else{
                System.out.println("猜大了");
            }
        }

    }
}
