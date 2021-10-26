public class Hannotta {

    //汉诺塔移动的时候
    //1：A->C      1
    //2：A->B  A->C  B->C     3
    //3：A->C  A->B  C->B  A->C  B->A  B->C  A->C    7
    //所以汉诺塔的移动规律就是 2^N -1

    public static void move(char pos1, char pos2){//打印出移动的过程
        System.out.print(pos1+"->"+pos2+" ");
    }

    /**
     *
     * @param n      代表盘子的个数
     * @param pos1   代表盘子所在的起始位置
     * @param pos2   代表盘子的中转位置
     * @param pos3   代表盘子的结束位置
     */
    public static void hanno(int n, char pos1, char pos2, char pos3){
        if(n == 1){//最下面一个 放到最右边
            move(pos1,pos3);
        } else {
            hanno(n - 1,pos1,pos3,pos2);//因为要把其它盘子放到中间
            move(pos1,pos3);//当其它都移走之后 就把 pos1 移到 pos3
            hanno(n - 1,pos2, pos1, pos3);
        }
    }
    public static void main(String[] args) {
        hanno(1,'A','B','C');
        System.out.println();
        hanno(2,'A','B','C');
        System.out.println();
        hanno(3,'A','B','C');
    }
}
