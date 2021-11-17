

/**
 * Java 当中实例化一个对象 通过 new 关键字
 * 另外一种创建对象的方式
 */

class Money implements Cloneable{
    public double m = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
//面试问题：你知道 Cloneable 接口吗？ 为啥是个空接口--因为空接口又叫标志接口
class  Person implements Cloneable{
    public int age;
    public Money money = new Money();//

    public void eat() {
        System.out.println("吃！");
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    //这个克隆方法，会产生一个副本 和原来的地址不一样
    @Override  //这个并不能说明是 深拷贝或者浅拷贝 但是我们可以做成一个深拷贝
    protected Object clone() throws CloneNotSupportedException {
        Person tmp = (Person)super.clone();
        tmp.money = (Money) this.money.clone();
        return tmp;
        //这里就通过代码 将其写成了深拷贝
    }
}
public class CloneInterface {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        Person person2 = (Person) person1.clone();
        person2.money.m = 99.9;
        System.out.println(person1.money.m);
        System.out.println(person2.money.m);
        //打印的值一样，说明是浅拷贝  因为拷贝的内容不一样 所以不能果断的说是某种拷贝
    }

    public static void main1(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        person1.age = 99;
        Person person2 = (Person) person1.clone();//使用克隆接口的时候 要重写克隆方法
        //要实现克隆的接口 然后再抛出一个异常才可以正常使用

        System.out.println(person2);
        System.out.println("==========================");
        person2.age = 199;
        System.out.println(person2);
    }
}
