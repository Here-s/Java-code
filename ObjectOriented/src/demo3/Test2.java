package demo3;

interface IA {
    int A = 10;//这里必须初始化 因为默认是 public static
    void funcA();//权限默认是 public abstract
}
interface IB {
    void funcB();
}

//一个类可以实现多个接口 也可以继承普通类（抽象类也可以 但是要重写抽象类里面的抽象方法）实现接口
abstract class BClass {

}

class AClass extends BClass implements IA,IB {
    //重写 A
    @Override
    public void funcA() {//public 是因为子类的权限必须要 大于等于
        System.out.println("A::funcA()");
        System.out.println(A);//输出接口里面的 A
    }

    @Override
    public void funcB() {

    }
}



public class Test2 {


    public static void main(String[] args) {
        final int a = 10;//常量必须初始化之后才能使用
        System.out.println(a);
    }
}
