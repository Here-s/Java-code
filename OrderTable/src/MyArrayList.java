import java.util.Arrays;

public class MyArrayList {
    //多用 this

    //这里就是顺序表  底层是数组
    public int[] elem;
    public int usedSize;//表示当前有效的数据个数

    public MyArrayList(){
        this.elem = new int[10];//这里完成初始化
    }

    // 打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    // 获取顺序表长度 指有效数据长度
    public int size() {
        return this.usedSize;
    }

    // 在 pos 位置新增元素 pos 不能小于 0 而且最远只能放在 usedSize 下标位置
    //因为如果前面没有元素的话，就不能放元素(0下标位置除外) 如果 usedSize 满了也不能放 就扩容
    //移动的时候 从后往前移 然后把 pos 位置放上自己要放的元素
    public void add(int pos, int data) {
        if(pos < 0 || pos > usedSize){
            System.out.println("pos 位置不合法");
            return;
        }
        if(full(elem)){
            this.elem = Arrays.copyOf(elem,elem.length * 2);
        }
        for(int i = this.usedSize - 1; i >= pos; i--){
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    //判断满没满
    public boolean full(int[] elem) {
        return usedSize == this.elem.length;
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++){
            if(this.elem[i] == toFind){
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置  找不到就返回 -1
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++){
            if(this.elem[i] == toFind){
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(pos < 0 || pos >= usedSize){
            System.out.println("pos 位置不合法");
            return -1;//业务上的处理 这里不考虑是否存在这个元素 之后就可以抛出异常
        }
        if(isEmpty()){
            System.out.println("顺序表为空");
            return -1;
        }
        return this.elem[pos];
    }

    //判断空
    public boolean isEmpty(){
        return this.usedSize == 0;
    }

    // 给 pos 位置的元素设为 value 也就是更新的意思
    public void setPos(int pos, int value) {
        if(pos < 0 || pos >= usedSize){
            System.out.println("pos 位置不合法");
            return;
        }
        if(isEmpty()){
            System.out.println("顺序表为空");
            return;
        }
        this.elem[pos] = value;
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        if (isEmpty()){
            System.out.println("顺序表是空的");
            return;
        }
        int index = search(toRemove);
        if(index == -1){
            System.out.println("找不到该元素");
            return;
        }
        for(int i = index;i < this.usedSize - 1; i++){
            this.elem[i] = this.elem[i + 1];
        }
        this.usedSize--;
        //如果是引用类型的话 就把它置为 null this.elem[usedSize] = null;
        //因为如果不置为 null 的话，引用指向的对象依然占用内存
    }

    // 清空顺序表
    public void clear() {
        //如果数组里面放的是引用类型 那么就需要遍历 把每个引用都置为 null 然后再把 usedSize 置为 0
        this.usedSize = 0;
    }
}
