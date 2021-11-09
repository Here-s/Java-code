class ListNode{
    public int val;
    public ListNode prev;
    public ListNode next;
    public ListNode(int val){
        this.val = val;
    }
}
public class MyLinkedList {
    public ListNode head;//指向双向链表的头节点
    public ListNode last;//指向双向链表的尾巴节点


    public void display(){
        ListNode cur = this.head;
        while (cur != null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    //得到单链表的长度
    public int size(){
        ListNode cur = this.head;
        int count = 0;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur = this.head;
        while (cur != null){
            if(cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        //判断是不是第一次
        if(this.head == null || this.last == null){
            this.head = node;
            this.last = node;
            return;
        } else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }
    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        if (this.head == null){
            this.head = node;
            this.last = node;
        } else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }

    //删除第一次出现关键字为key的节点  删除的时候 找到值的节点
    //将节点的上一个的 next 指向当前节点的 next 下一个节点的 prev 指向上一个
    public void remove(int key){
        ListNode cur = this.head;
        while (cur != null){
            if(cur.val == key){
                if(cur == head){
                    head = head.next;
                    if(head != null) {//这样就不怕只有一个节点了  如果只有一个节点的话 就会空指针异常
                        head.prev = null;
                    } else {
                        last = null;//只有一个节点 所以 last 也置为 null
                    }
                } else {
                    if(cur == last){
                        cur.prev.next = cur.next;
                        last = last.prev;
                    } else {
                        cur.prev.next = cur.next;
                        cur.next.prev = cur.prev;
                    }
                }
                return;
            } else {
                cur = cur.next;
            }
        }
    }

    public ListNode searchNode(int index){
        ListNode cur = this.head;
        while (index != 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        ListNode node = new ListNode(data);
        if(index < 0|| index > size()){
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
        ListNode cur = searchNode(index);
        node.next = cur.prev.next;
        cur.prev.next = node;
        node.prev = cur.prev;
        cur.prev = node;
    }


    //删除所有值为key的节点
    public void removeAllKey(int key){
        ListNode cur = this.head;
        while (cur != null){
            if(cur.val == key){
                if(cur == head){
                    head = head.next;
                    if(head != null) {//这样就不怕只有一个节点了  如果只有一个节点的话 就会空指针异常
                        head.prev = null;
                    } else {
                        last = null;//只有一个节点 所以 last 也置为 null
                    }
                } else {
                    if(cur == last){
                        cur.prev.next = cur.next;
                        last = last.prev;
                    } else {
                        cur.prev.next = cur.next;
                        cur.next.prev = cur.prev;
                    }
                }
            } else {
                cur = cur.next;
            }
        }
    }

    //清空链表   非暴力
    public void clear(){
        while (head != null){
            ListNode curNext = head.next;
            head.next = null;
            head.prev = null;
            head = curNext;
        }
        last = null;
    }
}
