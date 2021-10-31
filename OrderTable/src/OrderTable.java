public class OrderTable {

    //顺序表是用数组存储，在数组上面完成增删查改 顺序表的底层就是数组
    //要弄成一个类 用一个元素 有效数据就++ 这样就可以解决 0 也是数据的时候，数组就完成不了

    //顺序表插入和删除(不考虑查找的过程)，必须移动元素 O(N)

    //能不能时间复杂度做到 O(1)
    //能不能随用随取  所以就有了链表：物理上不一定连续，但逻辑上是连续的

    //扩容也是问题 二倍扩容 会浪费空间
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        //引用 myArrayList 指向对象
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.display();
        System.out.println(myArrayList.contains(3));
        System.out.println(myArrayList.getPos(2));
        myArrayList.setPos(0,99);
        myArrayList.display();
        myArrayList.setPos(2,15);
        myArrayList.display();
        myArrayList.remove(99);
        myArrayList.display();
    }
}