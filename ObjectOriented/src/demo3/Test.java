package demo3;

//三个常用接口：
// Comparable ：
// Comparator ：
// Cloneable  ：

//Shape 可以被抽象为一个接口
//接口
// 1 interface 就是接口
// 2 接口里面的普通方法不能有具体的实现  如果要实现的话 加一个 default 来修饰这个方法
// 3 接口当中可以有 static 方法
// 4 里面的方法默认是 public 的
// 5 抽象方法默认是 public abstract 的
// 6 接口是不可以通过关键字 new 来实例化的
// 7 接口和接口直接是通过 implements 来实现的
// 8 当一个类实现了一个接口 那么就必须要重写接口当中的抽象方法
// 9 接口当中的成员变量，默认是 public static final 修饰的
// 10 当一个类实现一个接口之后，重写这个方法的时候，前面必须加上 public
// 11 一个类可以通过 extends 继承一个抽象类或者普通类，但是只能继承一个类
//    同时，也可以通过 implements 实现多个接口，逗号之间使用逗号隔开
// 12 类和类直接 类和接口之间的关系，是 implements 操作的。那么接口和接口之间会存在什么样的关系呢
//    接口和接口之间可以使用 extends 来操作他们的关系，此时 这里面的意为：拓展
//    一个接口 B 通过 extends 来拓展另一个接口 C 的功能，此时当一个类 D 通过 implements 实现
//    接口 B 的时候，此时重写的方法不仅仅是 B 的抽象方法，还有他从 C 接口，拓展来的功能
// 13 接口是表示具有某种特性 有了接口之后，类的使用者就不必关注具体类型，只需关注某个类是否具有某种能力
interface IShape {
    public abstract void draw();//抽象方法
    default public void func() {
        System.out.println("Lockey");
    }
    public static void func2(){
        System.out.println("static");
    }
}
class Rect implements IShape{
    @Override
    public void draw() {
        System.out.println("♦");
    }

    @Override
    public void func() {
        System.out.println("重写接口当中的默认方法");
    }
}
class Flower implements IShape {
    @Override
    public void draw() {
        System.out.println("❀");
    }
}
class Triangle implements IShape {
    @Override
    public void draw() {
        System.out.println("🔺");
    }
}
class Cycle implements IShape {
    //alt + insert 快捷键输出方法
    @Override
    public void draw() {
        System.out.println("●");
    }
}
public class Test {

    //也可以发生多态
    public static void drawMap(IShape iShape){
        iShape.draw();
    }
    public static void main(String[] args) {
        Rect rect = new Rect();
        Flower flower = new Flower();
        drawMap(rect);
        drawMap(flower);
    }

    public static void main1(String[] args) {
        //通过接口的引用 可以引用一个具体的对象
        IShape iShape = new Rect();
        iShape.draw();
    }
}
