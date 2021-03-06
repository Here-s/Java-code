package com.lockey.test3;

class Animal{
    public String name;
    public int age;
    protected int count;//proteced 保护权限

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void eat() {
        System.out.println(name+" eat");
    }
}
class Dog extends Animal {
    public Dog(String name, int age){
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println(name+"狼吞虎咽");
    }

    public void func(int a) {
        System.out.println("int");
    }
    public void func(int a, int b) {
        System.out.println("int int");
    }
}
class Bird extends Animal {
    public String wing;
    public String name = "qwe";

    public Bird(String name, int age, String wing){
        super(name, age);
        this.wing = wing;
    }

    public void fly() {
        System.out.println(super.name+" fly "+age);
    }
}
public class test3 {

    //运行时多态   编译时多态
    public static void main(String[] args) {
        Dog animal2 = new Dog("heihei",10);
        //在构造方法中调用重写的方法（一个坑）  也会调用子类的方法 这里发生了动态绑定
    }

    public static void main4(String[] args) {
        Animal animal2 = new Bird("Lock",10,"flyyyyy");
        if(animal2 instanceof Bird){//通过 instanceof 方法来完成转换  把 animal 转化为 bird
            Bird bird = (Bird) animal2;//这里是向下转型 但是不安全 因为可能在运行时异常
            bird.fly();
        }
        //Bird bird = animal2;//报错是因为不是所有动物都是鸟，所以报错了
        //b.fly();

        //向上转型的话 对象应该是 new 的对象类型 对象要匹配
    }

    public static void main3(String[] args) {
        Dog dog = new Dog("haha", 10);
        dog.func(10);//调用一个参数的构造方法
        //静态绑定：编译的时候就知道调用的是哪个方法 就是静态绑定
    }

    public static void main2(String[] args) {
        Animal animal = new Dog("haha",10);
        animal.eat();//因为是调用 Animal 类型 所以是调用的是 Animal 的
        //但是如果 Dog 的写了内容之后，就调用 Dog 的 eat 就发生了动态绑定
        //动态绑定：也是多态的基础   也就是运行时绑定 运行的时候才知道调用了哪个方法
        // 1 父类引用 引用子类的对象
        // 2 通过这个父类引用 调用父类 和 子类 同名的覆盖方法

        //同名的覆盖（重写）：
        // 1 方法名相同       不能是 static 修饰  静态的方法不能修饰
        //   子类的访问修饰限定符一定要大于等于父类的访问修饰限定符
        //   被 final 修饰的方法不能重写
        // 2 参数列表相同
        // 3 返回值相同  （类型可以不相同 就是都返回 null
        // 4 父子类的情况下
        //  协变类型 如果返回值发生了协变类型 就发生了重写

        Animal animal1 = new Bird("Lock",10,"flyyyyy");
        animal1.eat();//因为没有重写 所以调用的还是 Animal 的 eat
        System.out.println(animal1.name);//访问了父类的 name
        //System.out.println(animal1.wine);//报错是因为通过父类引用只能访问父类自己的成员
    }

    public static void func(Animal ani) {
        //这里也是向上转型
    }
    public static Animal func2() {
        Dog dog = new Dog("haha",10);
        return dog;
    }

    public static void main1(String[] args) {
        //Dog dog = new Dog("haha",10);
        //Animal animal = dog;//指向 dog 的引用 所以就可以把代码写成这样

        //什么情况下会发生向上转型（鸟 就是动物）：子类对象赋值给父类对象
        //1 直接赋值
        //2 作为函数的参数
        //3 做完函数的返回值
        Animal animal = new Dog("haha",10);
        Dog dog =  new Dog("haha",10);
        func(dog);
    }
}
