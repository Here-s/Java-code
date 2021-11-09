public class TwoWayList {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(5);
        System.out.println(myLinkedList.size());
        myLinkedList.display();
        myLinkedList.addLast(6);
        myLinkedList.addLast(7);
        myLinkedList.addLast(8);
        myLinkedList.display();
        myLinkedList.remove(2);
        myLinkedList.display();
        myLinkedList.remove(5);
        myLinkedList.display();
        myLinkedList.remove(8);
        myLinkedList.display();
        myLinkedList.addIndex(0,99);
        myLinkedList.addIndex(6,999);
        myLinkedList.addIndex(3,999);
        myLinkedList.display();
    }
}
