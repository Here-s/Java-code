package demo3;

//通过接口就不用关心引用是谁了
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

}

//不是所有的动物都会飞，所哟不能写到 Animal 当中，如果写到另一个类当中，也不行
//因为一个类不能继承多个类 所以就要用到了接口

//fly 的接口
interface IFlying {
    void fly();
}
//run 的接口
interface IRunning{
    void run();
}
//游泳的接口
interface ISwimming{
    void swimming();
}
//通过接口就弥补了 Java 当中不能继承多个类的缺陷
class Bird extends Animal implements IFlying{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name+"正在飞");
    }
}

class Frog extends Animal implements IRunning,ISwimming{
    public Frog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在跑");
    }

    @Override
    public void swimming() {
        System.out.println(this.name+"在游泳");
    }
}

class Duck extends Animal implements IRunning,ISwimming,IFlying{
    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name+"正在飞");
    }

    @Override
    public void run() {
        System.out.println((this.name+"正在跑"));
    }

    @Override
    public void swimming() {
        System.out.println(this.name+"在游泳");
    }
}

//发现机器人也能实现接口，说明接口的扩展能力非常强  接口是表示具有 XX 特性
class Roobot implements IRunning{
    @Override
    public void run() {
        System.out.println("机器人在跑");
    }
}

public class Test4 {

    public static void runFunc(IRunning iRunning){
        iRunning.run();
    }
    public static void swimmingFunc(ISwimming iSwimming){
        iSwimming.swimming();
    }
    public static void flyingFunc(IFlying iFlying){
        iFlying.fly();
    }

    public static void main(String[] args) {
        runFunc(new Duck("鸭子"));
        runFunc(new Frog("青蛙"));
        runFunc(new Roobot());
    }
    public static void main3(String[] args) {
        flyingFunc(new Duck("鸭子"));
    }
    public static void main2(String[] args) {
        swimmingFunc(new Duck("鸭子"));
        swimmingFunc(new Frog("青蛙"));
    }
    public static void main1(String[] args) {
        runFunc(new Duck("鸭子"));
        runFunc(new Frog("青蛙"));
    }
}
