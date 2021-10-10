public class RecursionHanoi {    //写递归的时候 一定不要想着展开

    public static void move(char pos1,char pos2){//表示是从pos1到pos2
        System.out.print(pos1+"->"+pos2+" ");
    }
    public static void hanoi(int n,char pos1,char pos2,char pos3){
        //n表示盘子的数量  pos1是起始位置 pos2是中途位置
        //pos3是目的地位置
        if(n==1){
            move(pos1,pos3);
        }
        else{
            hanoi(n-1,pos1,pos3,pos2);//就是把那n-1个盘子挪到中间的B上面
            move(pos1,pos3);
            //继续递归之后 A上的盘子就挪到了C上面 所以再把B的盘子通过A挪到Ｃ上面
            hanoi(n-1,pos2,pos1,pos3);
        }
    }
    public static void main(String[] args) {
        //方法：1 定义 public static 返回值 方法名（形参列表){方法体；}
        //2 意义：模块化的组织代码，
        //3 使用：调用 main或者其它方法里面
        //4 方法的传参：按值传递。 实参 形参  形参是实参的一份拷贝
        //方法的返回值。返回值类型。int void return   注意：return后面的语句是不会被执行的
        //方法的重载：重载（overload） 1 方法的名称相同  2 方法的参数列表不同（参数的个数，类型）  3 返回值不做要求。  前提：同一个类中
        //递归：递下去 归回来 函数只要调用 就会在栈上开辟内存  递归：调用自己本身 有一个趋近于终止的条件  核心：找出一个递归公式
        //遇到递归代码 不要尝试展开代码 要横向思考

        //用递归实现汉诺塔问题 有ABC三个柱子
        //假设只有一个盘子 那么只从A挪到C上面就行了   如果两个盘子 A->B  A->C  B->C  三步
        //假设三个盘子  A->C  A->B  C->B  A->C  B->A  B->C  A->C   七步   就相当于 2^n-1次
        //假设有n个盘子 移到C上 必有n-1个盘子放到B上 然后再把那一个放到C上 最后再把n-1个盘子放到C上 这就是主要的思路
        //打印出轨迹
        hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();
        hanoi(3,'A','B','C');
    }


}
