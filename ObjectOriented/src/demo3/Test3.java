package demo3;

interface IA1 {
    void funcA();
}

//接口和接口之间可以使用 extends 来操作他们的关系，此时 这里面的意为：拓展
//一个接口 通过 extends 来拓展其功能
interface IB1 extends IA1{
    void funcB();
}

//因为要拓展接口的功能 所以有 B 和 A 所以这俩的方法都有重写
class C implements IB1{
    @Override
    public void funcB() {

    }

    @Override
    public void funcA() {

    }
}
public class Test3 {
}
