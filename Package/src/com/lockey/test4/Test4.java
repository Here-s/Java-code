package com.lockey.test4;

class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat(String food) {
        System.out.println(this.name + "正在吃" + food);
    }
}
class Cat extends Animal {
    public Cat(String name) {
        // 使用 super 调用父类的构造方法.
        super(name);
    }
}
class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }
    public void fly() {
        System.out.println(this.name + "正在飞 ︿(￣︶￣)︿");
    }
}
public class Test4 {
    public static void main(String[] args) {
        Cat cat = new Cat("小黑");
        cat.eat("猫粮");
        Bird bird = new Bird("圆圆");
        bird.fly();
    }
}
