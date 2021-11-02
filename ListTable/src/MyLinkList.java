/**
 * ListNode 代表一个节点
 */
class ListNode{
    //单向 不带头 链表 （单链表）不带头的 头一直会变（相对难）
    public int val;//代表数字
    public ListNode next;//ListNode 是一个节点的地址 所以类型就是节点类型

    public ListNode(int val) {
        this.val = val;
    }
}
public class MyLinkList {
    public ListNode head;//表示链表的头引用  成员变量 属于对象

    //带头节点 有一个节点（相当于哨兵）永远是一个头 放着下一个节点的地址 这样的话 插入节点 头也不会变
    //带头的相对简单（傀儡节点：这个里面的数据是没用的）

    //循环链表：最后一个节点的 next 域指向第一个

    //双向链表：有两个域：next 和 pre 一个指向前面 一个指向后面

    //没一共节点都有两个域
    //此时 new 了一个节点
    //val 的值设置为 1 next没设置就是 null  有一个节点产生，就 new 一个 ListNode

    //单向就是只能朝一个方向走  head 是链表的头 就是链表的头引用

    public void CreateList() {
        ListNode listNode1 = new ListNode(12);
        ListNode listNode2 = new ListNode(23);
        ListNode listNode3 = new ListNode(34);
        ListNode listNode4 = new ListNode(45);
        ListNode listNode5 = new ListNode(56);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        this.head = listNode1;
    }
    //打印链表的时候 让 head = head.next 然后往后循环 head.next 就是下一个节点
    //然后一直往后循环就好  但是会导致 head 为null

    public void display() {
        //定义一个变量 cur 等于 head 不然最后头节点就丢了
        ListNode cur = this.head;
        while (cur != null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains (int key){
        ListNode cur = this.head;
        while(cur != null){
            if(cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //得到单链表的长度
    public int size(){
        int count = 0;
        ListNode cur = this.head;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    //头插法  链表在堆上 不用判断是否满了
    public void addFirst(int data){
        //插入的时候需要一个节点 就 new 一个
        //一定要记住：绑定位置的时候，先绑定后面的，这样就不会把数据弄丢了
        ListNode node = new ListNode(data);
        node.next = head;
        this.head = node;
    }

    //尾插法 在尾部插入一个元素
    public void addLast(int data){
        //寻找尾节点：cur.next = null 说明指向的就是尾节点
        //cur.next = node
        //如果 head 为 null 那么插入之后还是 null 就异常了 所以尾插的第一次一定要判断是否为 null

        ListNode node = new ListNode(data);
        if(this.head == null){
            this.head = node;
        } else {
            ListNode cur = this.head;
            while (cur.next != null){
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    /**
     * 找到 index - 1位置的节点的地址
     * @param index
     * @return
     */
    public ListNode findIndex(int index) {
        ListNode cur = this.head;
        while (index - 1 != 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index < 0 || index > size()){
            System.out.println("index 位置不合法");
            return;
        }
        if(index == 0){
            addFirst(data);
            return;
        }
        if(index == size()){
            addLast(data);
            return;
        }
        ListNode cur = findIndex(index);
        ListNode node = new ListNode(data);
        node.next = cur.next;
        cur.next = node;
    }

    //找到要删除的关键字的前驱
    public ListNode searchPerv(int key){
        ListNode cur = this.head;
        while (cur.next != null){
            if(cur.next.val == key){
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){
        //头节点要单独处理
        //尾巴也要处理
        //中间又是一种情况
        if(this.head == null){
            System.out.println("单链表为 null 不能删除");
            return;
        }
        if(this.head.val == key){
            this.head = this.head.next;
            return;
        }

        ListNode cur = searchPerv(key);
        if(cur == null){
            System.out.println("未找到此元素");
            return;
        }

        ListNode del = cur.next;
        cur.next = del.next;
    }

    //删除所有值为key的节点  遍历链表一遍，删除所有值为 key 的节点
    public void removeAllKey(int key){
        //定义一个 prev 作为第一个节点 cur 作为第二个节点
        //删的结束条件就是 cur != null
    }

    public void clear(){

    }
}
