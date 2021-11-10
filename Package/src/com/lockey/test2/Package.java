package com.lockey.test2;

//发现狗和鸟 都有 name 和 age 而且都有 eat 方法 有共性
//所以就可以把这些共性写出来
//继承：就是对共性的抽取  可以对代码进行重用  Java 当中是单继承
//不能继承多个类 子类可以访问夫类当中的所有 public 方法
//父类的 private 方法不能在子类中访问
//在子类构造的同时 要帮助父类进行构造  所以如果父类有构造方法的话 子类继承就会报错
class Animal{
    public String name;
    public int age;
    protected int count;//proteced 保护权限

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void eat() {
        System.out.println(" eat");
    }
}
//继承关键字 extends
class Dog extends Animal{
    //这里继承之后就有了成员变量
    public Dog(String name, int age){
        super(name,age);//就是显示调用构造方法  就是父类带有两个参数的构造方法
        //因为父类有了带参数的构造方法 所以这里也必须得写出来构造方法
        //super 必须放在第一行
    }
}
class Bird extends Animal{
    public Bird(String name, int age, String wing){
        super(name, age);
        this.wing = wing;
    }
    public String wing;
    public String name;//当类里面有了 name 之后 调用构造方法的 name 就不会赋值了
    //也就是当子类和父类有同名的字段的时候，优先使用子类自己的字段 除非用 super 来指定
    public void fly() {
        System.out.println(super.name+" fly "+age);
    }
}

public class Package {

    public static void main(String[] args) {
        //Dog dog = new Dog("haha",10);
        //Animal animal = dog;//指向 dog 的引用 所以就可以把代码写成这样

        Animal animal = new Dog("haha",10);//父类引用 引用子类对象
    }

    //同一个包里面 不同的类 protected 也能访问到
    //不同的包里面 只有子类 才能访问到 protected 而且是通过 super 关键字
    //所以 protected 关键字就很方便

    int val = 10;

    public static void main2(String[] args) {
        Bird bird = new Bird("Lockey",10, "flying");
        System.out.println(bird.count);
    }

    public static void main1(String[] args) {
        Dog dog = new Dog("haha",10);
        System.out.println(dog.name);
        System.out.println(dog.age);
        dog.eat();

        Bird bird = new Bird("Lockey",10,"fly fly fly");
        System.out.println(bird.name);
        bird.eat();
        bird.fly();
    }
}
