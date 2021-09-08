import java.util.*;


class List{
    public int[] elem;//定义的数组   int 也可以改成 一个类的类型
    public int usedSize;//有效的数据个数
    public static int capacity = 10;//容量

    public List(){
        this.elem = new int[capacity];//一定要分配空间
        this.usedSize = 0;
    }
    private boolean isFull(){
        return this.usedSize == this.elem.length;
    }
    private boolean isEmpty(){
        return this.usedSize == 0;//用 usedSize 是因为刚开始就已经分配内存了 所有要看使用了多少
    }
    private void checkPos(int pos){
        if(pos < 0 || pos > this.usedSize){
            throw new RuntimeException("pos 位置不合法");
        }
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
        checkPos(pos);//只要pos 位置不合法 diamond就停在这个位置不走了

        if(isFull()){
            //扩容
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);//这样就拷贝完成了
        }
        //判断位置是否合法
        if(pos < 0 || pos >= this.usedSize){
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
    //判定是否包含某个元素
    public boolean contains(int toFind){
        for(int i = 0; i < this.usedSize; i++){
            if(this.elem[i] == toFind){
                return true;
            }
        }
        return false;
    }
    //查找某个元素对应的位置  返回的是下标
    public int search(int toFind) {
        for(int i = 0; i < this.usedSize; i++){
            if(this.elem[i] == toFind){
                return i;
            }
        }
        return -1;
    }
    //获得 pos 位置的元素
    public int getPos(int pos){
        //1 顺序表是否为null
        if(isEmpty()){//说明是空的
//            return -1;//返回-1 其实不好 因为数组当中可能真的存在 -1 那么就无法判断了
            throw new RuntimeException("顺序表为空");//手动抛出一个异常
        }
        //2 pos 的合法性
        if(pos < 0 || pos > this.usedSize){
            throw new RuntimeException("pos 位置不合法");
        }
        //3 合法的话 就 return pos位置的数据
        return this.elem[pos];
    }
    //获取顺序表的长度
    public int size(){
        return usedSize;
    }
    //删除第一次出现的关键字 key
    public void remove(int toRemove) {
        //1 先找 key 的位置 并知到它的下标
        //2 让后面的元素值覆盖掉前面的值  然后 usedSize 减1
        int i = search(toRemove);
        if(i == -1){
            System.out.println("没有要需要删除的数字");
            return ;
        }
        for(int j = i; j < this.usedSize - 1; j++){//防止空间的越界
            this.elem[j] = this.elem[j + 1];
        }
        this.usedSize--;
    }
    //清空顺序表
    public void clear(){
        this.usedSize = 0;
    }
    //将顺序表某个地方的值 设置为 另外一个值
    public void setPos(int pos, int value){
        if(pos < 0 || pos >= this.usedSize){
            return ;
        }
        this.elem[pos] = value;
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
        System.out.println("------------------------");
        System.out.println(list.search(5));
        System.out.println(list.contains(5));
        System.out.println(list.getPos(4));
        list.remove(0);
        list.display();
        list.remove(12);
        list.display();
        list.setPos(5,35);
        list.display();
    }
}
