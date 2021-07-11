
class Test{
    public int a;
    public static int count;
}
class Person{//属于类的放在方法区    //this super 是关键字 不能在静态中使用
    public String name = "offer";//字段   要注意null的length会报异常
    public int age = 10;
    public static int size = 10;//假设new产生了好多对象  但2一份是这里的sizezhiy
    public void eat(){
        int a = 10;//局部变量 放在栈区
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep");
        func1();//只要是静态的就能调用
        eat();//也可以调用类里面的函数
    }
    public static void func1(){
        System.out.println("static");
        size = 9999;//静态方法里面只能调用静态的
    }
    public void show(){
        System.out.println("名字 "+name+"  "+"年龄 "+age);
    }
}

public class ClassAndObjectTwo {

    public void func2(){

    }
    public static void main(String[] args) {
        //func2(); 不能直接访问 因为没加static
        ClassAndObjectTwo method = new ClassAndObjectTwo();
        method.func2();//通过这样来访问func2  因为没加static 所以只能这样来访问
    }

    public static void main2(String[] args) {
        //static关键字  静态成员变量可以直接使用
        Test t1 = new Test();
        t1.a++;
        Test.count++;
        System.out.println(t1.a);
        System.out.println(Test.count);
        System.out.println();
        Test t2 = new Test();
        t2.a++;
        Test.count++;
        System.out.println(t2.a);//这是新创建的对象 因为不是static修饰的 所以从头开始
        System.out.println(Test.count);
    }


    public static void main1(String[] args) {
        //实例成员方法的调用
        Person per = new Person();
        per.eat();//这样来访问成员方法 通过对象的引用 这里不能说是属于对象 对于方法来说 是不会放在对象里面的
        per.sleep();
        //静态方法的调用和静态成员调用方法一样
        Person.func1();
        per.show();
    }
}
