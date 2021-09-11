import java.util.*;

class Table{
    public int useSize;
    public final int val = 10;
    public int[] list;
    //顺序表初始化
    public Table(){
        this.list = new int[val];
        this.useSize = 0;
    }
    //打印顺序表
    public void display(){
        for(int i = 0; i < useSize; i++){
            System.out.print(list[i]+" ");
        }
        System.out.println();
    }
    //判断顺序表是否已经满了
    private boolean isFull(){
        return this.useSize == this.list.length;
    }
    //判断顺序表是否为空
    private boolean isEmpty(){
        return this.useSize == 0;
    }
    //判断位置是否合法
    private void checkPos(int pos){
        if(pos < 0 || pos > this.useSize){
            throw new RuntimeException("pos位置不合法");
        }
    }
    //顺序表增加元素
    public void add(int pos, int data){
        //判断位置是否合法
        checkPos(pos);
        //判断是否需要扩容
        if(isFull()){
            this.list = Arrays.copyOf(this.list, 2*this.list.length);
        }
        //扩容
        for(int i = this.useSize - 1; i >= pos; i--){
            this.list[i + 1] = this.list[i];
        }
        this.list[pos] = data;
        this.useSize++;
    }
    //判定是否包含某个元素
    public boolean contains(int toFind){
        for(int i = 0; i < this.useSize; i++){
            if(this.list[i] == toFind){
                return true;
            }
        }
        return false;
    }
    //找到某个元素的下标
    private int search(int data){
        for(int i = 0; i < this.useSize; i++){
            if(this.list[i] == data){
                return i;
            }
        }
        return -1;
    }
    //删除某个元素
    public void delete(int data){
        //判断顺序表是否为空
        if(isEmpty()){
            throw new RuntimeException("顺序表为空");
        }
        //找到下标

        //删掉
        int pos = search(data);
        for(int i = pos; i < this.useSize - 1; i++){
            this.list[i] = this.list[i + 1];
        }
        this.useSize--;
    }
}
public class MyOrderTable {
    public static void main(String[] args){
        Table table = new Table();
        for(int i = 0; i < table.list.length; i++){
            table.add(i, i+1);
        }
        table.display();
        table.add(10, 21);
        table.display();
//        System.out.println(table.contains(6));
        //删除某个元素
        table.delete(5);
        table.display();
    }
}
