import java.util.*;

class Stu{
    public int age;
    public String name;
    public static int size = 10;//不初始化默认是0
    public void eat(){
        int a = 10;//局部变量 放在战区
        System.out.println("吃东西");
    }
    public void sleep(){
        System.out.println("睡觉");
        func1();//只要是静态的就能调用
        eat();//也可以调用类里面的函数
    }
    public static void func1() {
        System.out.println("static");
        size = 9999;//静态方法里面只能调用静态的
    }
    public void show(){
        System.out.println("名字 "+name+"  "+"年龄 "+age);
    }
}

public class test {

    public static void main(String[] args) {
        //访问静态变量  因为静态变量不属于类 在方法区 所以通过Stu（类名）输出
        Stu s = new Stu();
        s.name = "张三";
        s.age = 10;
        System.out.println(Stu.size);
        Stu.func1();
        s.show();
        System.out.println(s);
    }

    public static void main6(String[] args) {
        //对类的内容赋值
        Stu s = new Stu();
        s.age = 20;
        System.out.println(s.age);
        System.out.println(s.name);//输出 null 因为没有对名字初始化
    }

    public static void main5(String[] args) {
        //完成一个对象的实例化
        Stu student1 = new Stu();
        //新创建的对象 类里面的局部变量的值重新计算
        Stu student2 = new Stu();
        Stu student3 = new Stu();
        Stu student4 = new Stu();
    }

    public static void main4(String[] args) {
        //一个数组 [1,4,3,1,2,3,4] 找出这个数组当中只出现一次的数字
        //可以用位操作符
        int[] arr = new int[]{1,2,3,4,5,1,2,4,5};
        int tmp = 0;
        for(int i = 0; i < arr.length; i++){
            tmp ^= arr[i];//因为0和任何数异或都是任何数 两个相同的数异或是0
        }
        System.out.println(tmp);
    }

    public static void main3(String[] args) {
        //自己写一个不规则二维数组
        int[][] arr = new int[2][];//Java的不规则二维数组必须指定行 列可以不指定
        arr[0] = new int[]{1,2,3,4,5};
        arr[1] = new int[]{1,2,3,4,5,6,7,8,9};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

    public static void main2(String[] args) {
        //打印二维数组还能使用Arrays.deepToString的深度打印
        int[][] arr = {{1,2,3},{4,5,6,7,8}};
        System.out.println(Arrays.deepToString(arr));//通过深度打印来输出二维数组
    }

    public static void main1(String[] args) {
        //二维数组的创建
        int[][] arr = {{1,2,3},{4,5,6,7,8}};//二维数组的 [] 内不能写数字 这是第一种写法 常用
        int[][] arr2 = new int[][]{{1,2,3},{4,5,6}};
        int[][] arr3 = new int[2][3];//2行3列的二维数组
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 0; i < arr3.length; i++){
            for(int j = 0; j < arr3[i].length; j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
