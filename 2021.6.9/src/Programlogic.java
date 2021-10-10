public class Programlogic {
    public static void main(String[] args) {
        //计算5的阶乘 就是5*4*3*2*1
        int num=5;
        int i=1;
        int ret=1;
        int add=0;
        while(i<=num){
            ret*=i;
            i++;
            add+=ret;
            System.out.println(ret);
        }
        System.out.println(add);
    }

    public static void main2(String[] args) {
        //循环结构  Java的循环和C语言的循环一样 就是在 while循环里面只能写boolean表达式
        int a=1;
        while(a<=10){//打印1-10的数
            System.out.println(a);
            a++;
        }//这样写 因为这样就有了boolean表达式
    }

    public static void main1(String[] args) {
        //if里面写东西 不能按数学那样写 例如 a=10  if(5<=a<=20) 不能这样写 应该这样写 if(5<=a && a<=20)

        //switch 语句 也是分支结构   和C语言有些不一样
        int a=1;
        switch(a){//switch的参数是一个整型  这里的参数是分支的case 假如a不是1 2 那么就输出default 如果不加break的话 还是会往下执行
            //面试问题 不能做switch参数的类型有哪些  float double Long就不行  因为发生了转型提升
            //boolean也不能 因为boolean不能转化为整型 所以也不行
            //枚举也可以作为switch的参数  switch不能表达复杂的条件
            case 1:
                System.out.println("aaa");
                break;//break一定要有
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("请输入正确的数字");
                break;
        }
    }
}
