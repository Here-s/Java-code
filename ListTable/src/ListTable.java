public class ListTable {

    //因为顺序表的扩容之后，空间浪费率很高，所以就出现了链表
    //链表：单向、双向   带头、不带头  循环、非循环
    //学习：单向、不带头、非循环   双向、不带头、非循环

    //链表：由一个个叫做 节点 的东西组成。
    //val 代表数据域   next 代表下一个节点的地址
    //每个节点都有一个地址，由前一个节点指向当前位置，就是上一个节点的 next 域指向下一个节点
    //最后一个节点用 null 表示
    //知到了一个节点的地址，就用 head 来引用当前地址  head.next 存储的就是下一个节点的地址。
    //head 引用的是当前对象的地址

    //第一个节点叫做头节点 最后一个叫做尾节点  如果一个节点的 next 域是 null 那么就是尾节点

    public static void main(String[] args) {
        MyLinkList myLinkList = new MyLinkList();
        //myLinkList.CreateList();
        myLinkList.addLast(12);
        myLinkList.addLast(23);
        myLinkList.addLast(34);
        myLinkList.addFirst(45);
        myLinkList.addFirst(56);

        myLinkList.addIndex(0,99);
        myLinkList.addIndex(6,999);
        myLinkList.addIndex(3,99);

        myLinkList.display();

        myLinkList.remove(999);

        myLinkList.display();
        boolean flg = myLinkList.contains(34);
        System.out.println(flg);

    }

    public static void main1(String[] args) {
        ListNode listNode = new ListNode(1);//此时 new 了一个节点
        //val 的值设置为 1 next没设置就是 null  有一个节点产生，就 new 一个 ListNode
    }
}
