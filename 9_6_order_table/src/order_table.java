import java.util.*;

class List{
    public int[] elem;//定义的数组
    public int usedSize;//有效的数据个数
    public static int capacity = 10;//容量

    public List(){
        this.elem = new int[capacity];//一定要分配空间
        this.usedSize = 0;
    }
    private boolean isFull(){
        return this.usedSize == this.elem.length;
    }

    //打印顺序表  打印的是有效元素
    public void display(){
        for(int i = 0; i < this.usedSize; i++){
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    //在 pos 位置新增一个元素  插的时候把数据一个一个往后移 从最后面开始移动 然后再插入 然后 usedSize +1
    public void add(int pos, int data){// pos 位置是指定的 pos 位置要合法 要放在它前面的位置有元素
        //负数也不行

        //检测是否满了  如果是满的  就扩容二倍  把长度扩为二倍 然后把原来的元素拷贝进来
        if(isFull()){
            //扩容
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);//这样就拷贝完成了
        }
        //判断位置是否合法
        if(pos < 0 || pos > this.usedSize){
            return ;
        }
        //说明 pos 合法 开始挪数据
        for(int i = this.usedSize - 1; i >= pos; i--){
            this.elem[i + 1] = this.elem[i];
        }
        //说明可以往这个地方放数据了
        this.elem[pos] = data;
        this.usedSize++;
    }
}
public class order_table {


    public static void main(String[] args) {
        //学好数据结构 一定要写代码 画图理解

        //顺序表是用数组存储的内容 在数组上面完成增删查改
        //顺序表可分为
                //静态顺序表：使用定长数组存储
                //动态顺序表：使用动态开辟的数组存储

        //不同的是 每个数组还包括一个 usedSize 就是有效数据的个数 每放一个数据 usedSize 都加 1
        //因为是一个新的类型 所以要写一个类出来
        List list = new List();//就是一个顺序表
        for(int i = 0; i < 10; i++){
            list.add(i, i);
        }
        list.display();
        list.add(10, 12);
        list.display();
    }
}
