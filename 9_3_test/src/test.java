import java.util.*;



    class MyValue{

        public int val1;

        private int val;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }
    }
    class Calculator {
        private int num1;
        private int num2;

        public int getNum1() {
            return num1;
        }

        public void setNum1(int num1) {
            this.num1 = num1;
        }

        public int getNum2() {
            return num2;
        }

        public void setNum2(int num2) {
            this.num2 = num2;
        }

        public int add() {
            return this.num1 + this.num2;
        }
        public int sub() {
            return this.num1 - this.num2;
        }
        public int mul() {
            return this.num1 * this.num2;
        }
        public double dev() {
            return this.num1*1.0 / this.num2;
        }
    }
    public class test {
        public static void swap1(MyValue myValue, MyValue myValue1){//传的值的名字可以随便起
            //这里就是把 这两个值放在栈区 然后交换就好了 因为放过来的是地址
            int tmp = myValue.val1;
            myValue.val1 = myValue1.val1;
            myValue1.val1 = tmp;
        }
        public static void main(String[] args) {
            MyValue myValue = new MyValue();
            //把堆区的 myValue 的 val1 赋值为10
            myValue.val1 = 10;
            MyValue myValue1 = new MyValue();
            //把堆区的 myValue1 的 val1 赋值为10
            myValue1.val1 = 20;
            //开始交换 把值传过去
            swap1(myValue, myValue1);
            //也能成功交换
            System.out.println(myValue.val1);
            System.out.println(myValue1.val1);
        }

        public static void swap(MyValue myValue, MyValue myValue1){//传的是这两个对象的引用
            int tmp = myValue.getVal();
            myValue.setVal(myValue1.getVal());
            myValue1.setVal(tmp);
        }
        public static void main3(String[] args) {
            //实现交换两个变量的值  需要交换实参的值
            MyValue myValue = new MyValue();
            myValue.setVal(10);
            MyValue myValue1 = new MyValue();
            myValue1.setVal(20);
            System.out.println(myValue.getVal());
            System.out.println(myValue1.getVal());
            System.out.println("开始交换");
            swap(myValue, myValue1);
            System.out.println(myValue.getVal());
            System.out.println(myValue1.getVal());
        }

        public static void main2(String[] args) {
            //写一个类 有两个属性num1 num2 这两个数据的值 不能在定义的同时初始化 最后实现加减乘除运算
            Calculator calculator = new Calculator();
            calculator.setNum1(10);
            calculator.setNum2(20);
            System.out.println("加法");
            System.out.println(calculator.add());
            System.out.println("减法");
            System.out.println(calculator.sub());
        }

        public static void func(int[] arr, int[] arr1){
            for(int i = 0; i < arr.length; i++){
                int tmp = arr[i];
                arr[i] = arr1[i];
                arr1[i] = tmp;
            }
        }
        public static void main1(String[] args){
            //静态的方法不属于类
            //成员变量没有被初始化默认值是 false

            //给定两个整形数组 交换两个数组的内容
            int[] arr = new int[]{1,2,3,4,5};
            int[] arr1 = new int[]{6,7,8,9,0};
            func(arr, arr1);
            System.out.println(Arrays.toString(arr));
        }
    }

