package demo3;

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

}
interface IFlying {
    void fly();
}
class Bird extends Animal implements IFlying{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name+"正在飞");
    }
}
public class Test4 {
}
