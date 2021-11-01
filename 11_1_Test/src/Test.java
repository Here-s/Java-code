public class Test {

    public static void main(String[] args) {
        OrderTable orderTable = new OrderTable();
        orderTable.add(0,1);
        orderTable.add(1,2);
        orderTable.add(2,3);
        orderTable.display();
        System.out.println(orderTable.contains(3));
        System.out.println(orderTable.getPos(2));
        orderTable.setPos(0,99);
    }
}
