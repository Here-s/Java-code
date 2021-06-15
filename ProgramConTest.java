import java.util.*;
//IDEA调试的时候 也是打断点 让代码走到这一步停下来

public class ProgramConTest {
    public static void main(String[] args) {
        //获取一个二进制序列中所以的偶数位和奇数位 分别输出二进制序列
        //0000 0110 这个数是6  要求是多少 那么肯定要按位与一个1 因为这样就知道是1 还是0 所以继续左移就好了 下标是0 最左边的下标是31
        //
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("奇数位");
        for(int i=31;i>=1;i-=2){//是从31开始 所以是奇数开始 每次-2 就还是奇数
            System.out.print(((n>>i)&1)+" ");
        }
        System.out.println();
        System.out.print("偶数位");
        for(int i=30;i>=0;i-=2){//i>=0 是因为下标为0
            System.out.print(+((n>>i)&1)+" ");
        }
        System.out.println();
    }

    public static void main4(String[] args) {
        //更优化的方法是这样写 比如7  00000111 让7按位与一个6 结果就是6 6按位与5 结果就是4 4按位与3 结果就是0
        //结果就会发现 每按位与一次 就会少一个一  也就是n&(n-1)  最后为0 那么就与完了
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        System.out.println(count);
    }

    public static void main3(String[] args) {
        //写一个函数返回参数二进制中1的个数 比如 15  00001111 返回4个1  就是判断每一个位
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //要判断有几个1 那就让它&一个1  因为和1按位与的结果是1的话那么说明这个数就是1 那么count++
        //然后这个数右移一位 右移一位 前面补的是0 当按位与的结果是0的时候 就不用count++ 二进制有32位 所以要左移31次
        //移完之后 count就是1的个数
        int count=0;
        for(int i=0;i<32;i++){
            if(((n>>i)&1)==1){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main2(String[] args) {
        //编写代码模拟三次输入密码的场景，最多能输入三次密码，密码正确，提示登陆成功 密码错误 可以重新输入，最多输入三次，三次均错
        //则提示退出程序
        int count = 3;
        Scanner scan = new Scanner(System.in);
        while(count != 0){
            System.out.println("请输入密码");
            String password = scan.nextLine();
            if(password.equals("123456")){//.equals是boolean类型
                System.out.println("密码正确，登陆成功");
                break;
            }
            else{
                count--;
                System.out.println("你还有"+count+"次机会，如果输入错误，就退出程序");
            }
        }
    }

    public static void main1(String[] args) {
        //找出0-999999的 独生数 三位自幂数（水仙花数） 四位 五位 六位自幂数
        //1 确定是几位数 2 求得每一位 然后进行运算 3 和原来数字比较 如果相同 那么就是一个要求的结果
        //求得一个数是几位数 用模
        for(int n=1;n<999999;n++){
            //求几位数 假如123 是n 除10模10就行了 123/10=12  12/10=1  1/10=0 n变成0了 除了三次 所以是三位数
            int count =0;
            int tmp=n;//用tmp去除 这样n的值就不变了
            while(tmp!=0){
                count++;
                tmp/=10;
            }
            //这样就通过count求到了位数
            //123%10=3  123/10=12  12%10=2  12/10=1  1%10=1
            //3^count+2^count+1^count==n  这个就是最后的判断
            tmp=n;//再把n的值赋给tmp
            int sum=0;
            while(tmp != 0){//这里完成第三步
                sum += Math.pow(tmp%10,count);//这是求平方的函数 逗号前面是值 逗号后面是几次方
                tmp/=10;
            }
            if(sum==n){
                System.out.println(sum);
            }
        }
    }
}
