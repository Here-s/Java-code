import java.util.Arrays;

public class OrderTable {
    public int[] arr;
    public int usedSize;

    public OrderTable(){
        this.arr = new int[10];
    }

    // 打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    // 获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if(pos < 0 || pos > this.usedSize){
            System.out.println("pos 位置不合法");
            return;
        }
        if(isFull(arr)){
            this.arr = Arrays.copyOf(arr, arr.length*2);
        }
        for (int i = this.usedSize - 1; i >= pos; i--) {
            this.arr[i + 1] = this.arr[i];
        }
        this.arr[pos] = data;
        this.usedSize++;
    }

    //是否满了x
    public boolean isFull(int[] arr){
        return this.usedSize == this.arr.length;
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.arr[i] == toFind){
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.arr[i] == toFind){
                return i;
            }
        }
        return -1;
    }

    //判断是否为空
    public boolean isEmpty() {
        return this.usedSize == 0;
    }

    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(pos < 0 || pos >= this.usedSize){
            System.out.println("pos 位置不合法");
            return -1;
        }
        if(isEmpty()){
            System.out.println("顺序表为空");
            return -1;
        }
        return this.arr[pos];
    }

    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if(pos < 0 || pos >= this.usedSize){
            System.out.println("pos 位置不合法");
            return;
        }
        if(isEmpty()){
            System.out.println("顺序表为空");
            return;
        }
        this.arr[pos] = value;
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        if(isEmpty()){
            System.out.println("顺序表为空");
            return;
        }
        int pos = search(toRemove);
        if(pos == -1){
            System.out.println("找不到该元素");
            System.out.println();
        }
        for (int i = pos; i < this.usedSize - 1; i++){
            this.arr[i] = this.arr[i + 1];
        }
        this.usedSize--;
    }

    // 清空顺序表
    public void clear() {
        this.usedSize = 0;
    }
}
