import java.util.Scanner;
public class loop {
        public static void main(String[] args) {
            //for循环  for(表达式1;表达式2;表达式3) 和C语言差不多
            int i=1;
            for(i=1;i<=10;i++){//第一个i=1 可以省略 如果外面定义了i的话 这里的i就可以省略  第三个i++也可以放到循环里面
                //但是中间的那个不能省略
                System.out.println(i);
            }
            for(byte j=1;j<=130;j++){
                System.out.println(j);//如果用byte的话 是死循环 因为还是那个圆圈模型 最大值到不了130 所以死循环
            }
        }

        public static void main1(String[] args) {
            //break 让循环提前结束 结束所有的循环  continue 条件满足之后 还会执行完此次代码 也就是结束本次循环 返回上一层
            //就是不执行下面的代码了 这里如果使用continue 就会死循环  break 和continue 用在循环当中 break不能用在if当中
            //Java循环有四个循环 for     while    do while    foreach
            Scanner scan = new Scanner(System.in);
            int num=scan.nextInt() ;// 找出第一个即能被3整除的数 又能被5整除的数
            while(num<=100){
                if(num%15==0) {
                    System.out.println(num);
                    break;//提前结束所有循环
                }
                num++;
            }
            System.out.println("进程已结束");
        }
    }

