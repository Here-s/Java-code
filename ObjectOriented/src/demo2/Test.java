package demo2;


abstract class Shape{
    public int a;
    public void func() {
        System.out.println("测试普通方法");
    }
    public abstract void draw();//加分号就是不实现这个类 加一个
    //加一个 abstract 关键字来修饰 就是抽象方法 类再加一个 abstract 就是抽象类
}

//一个类被实现为抽象类的时候 继承就不报错了
abstract class A extends Shape{
    public abstract void funcA();
}

//B 继承之后也会报错 如果重写了 A 的func 方法  还需要重写 Shape 的draw 方法
//因为 A 是继承的 Shape 所以也要重写 Shape 的方法
class B extends A {
    @Override
    public void funcA() {

    }

    @Override
    public void draw() {

    }
}

//一个普通类 继承抽象类 那么必须重写抽象类当中的所有抽象方法
class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("♦"+a);
        super.func();
    }
}
class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("❀");
    }
}
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("🔺");
    }
}
class Cycle extends Shape {
    //alt + insert 快捷键输出方法
    @Override
    public void draw() {
        System.out.println("●");
    }
}

public class Test {

    //可以发生向上转型 那么就也可以动态绑定
    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        //不能被实例化 但是可以发生向上转型
        Shape shape = new Rect();
        drawMap(shape);
        Cycle cycle = new Cycle();
        drawMap(cycle);
    }

    //抽象类：
    // 1 包含抽象方法的类，叫做抽象类
    // 2 什么是抽象方法，一个没有具体实现的方法，被 abstract 修饰
    // 3 抽象类是不可以被实例化的
    // 4 因为不能被实例化 所以只能被继承
    // 5 抽象类当中 也可以包含和普通类一样的成员和方法
    // 6 一个普通类 继承抽象类 那么必须重写抽象类当中的所有抽象方法 不然就会报错
    // 7 抽象类最大的作用就是被继承
    // 8 一个抽象类 如果继承了一个抽象类 B 那么这个抽象类 A 可以不实现抽象父类 B 的抽象方法
    // 9 结合第 8 点 当 A 类再被一个普通类继承后，那么 A 和 B 这两个抽象类当中的抽象方法，必须重写
    // 10 final 不能修饰抽象类   final 也不能修饰抽象方法
    public static void main1(String[] args) {
        //Shape shape = new Shape();//抽象类是不可以被实例化的
    }
}
