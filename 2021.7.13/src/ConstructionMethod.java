

class Person{
    private String name;
    private int age;
    //构造方法也可以发生重载  因为重载不对返回值有要求 规则和重载是一样的

    public Person(){//这样就是一个构造方法  如果自己不提供一个构造方法的话  编译器会自动提供一个不带参数的构造方法
        this("mysql",20);//this调用当前对象的构造方法(只能在构造方法里面使用)只能放在第一行  这里是调用有两个参数的构造方法
//        this("zhangfei");//只能调用一个当前对象的构造方法(因为只能写在第一行)  不然就会报错  一定要习惯使用this
        System.out.println("构造方法");
    }
    //编译器也能生成构造方法 通过alt+insert 选择Constructor(构造)   构造方法的名字和类名一样

//    public Person(String name, int age) {//这样就是通过编译器快捷生成的构造方法
//        this.name = name;
//        this.age = age;
//    }
    public Person(String name,int age){//这里是相当于构造的时候 就赋了值
        this.name = name;
        this.age = age;
        System.out.println("有参数的构造方法");
    }

    {
        this.name = "liu";
        System.out.println("实例代码块");//只有括号和括号里面的东西 可以对成员变量赋值 也可以对静态成员变量赋值
    }
    static{//静态的方法和静态的成员 是不依赖于对象的 可以通过类名来进行访问  静态代码块里面的东西都是静态的 就不能在里面访问非静态的数据成员
        //如果静态方法里面 访问了实例成员变量 那么 这个实例成员变量是依赖对象的 就会报错   静态的内容里面不能有非静态的内容
//        this.name = "ha";//静态方法里面不能访问实例成员 所以报错  因为静态的在加载的时候 实例成员还没被加载
        System.out.println("静态代码块");
    }

    public Person(String name){
        this.name = name;
        System.out.println("单个参数的构造函数");
    }
    public void eat(){
        System.out.println(this.age);//this访问属性
        System.out.println(this.getName());//this访问当前对象的方法
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override//这里是重写的toString方法
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ConstructionMethod {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.eat();
        //匿名对象
        new Person().eat();//匿名对象就是  直接new一个 然后区访问成员  匿名对象只能在创建对象的时候使用
        //但是这个new的匿名访问只能使用一次 如果再调用其它的方法 还得再new一个匿名对象  所以每次只能使用一次
    }

    public static void main3(String[] args) {
        //代码块：实例代码块/构造代码块  静态代码块  本地代码块(只做了解)   主要考先后顺序
        //实例代码块的特性是：
        Person per = new Person();//输出顺序是静态代码块  然后是实例代码块  然后是构造方法
        System.out.println("============");
        Person per1 = new Person();//静态的内容只初始化(执行)一次  且是最早被初始化(执行)的   如果都是静态的 那么和定义的前后顺序有关
        //实例代码块也是这样
        //在普通方法里面有个代码块 就叫本地代码块
    }

    public static void main2(String[] args) {//构造方法：他的方法名是和他的类名是相同的 且没有返回值
        Person per = new Person();//这叫做实例化一个对象  一个类可以产生多个对象  当实例化一个对象的时候 就会调用构造方法
        //一个对象的产生 分为几步 是如何产生的   1 为对象分配内存  2 调用合适的构造方法(构造方法不止一个)
        //实例化的时候 new的时候就已经调用了构造方法  构造方法的作用：用来构造对象
        Person per1 = new Person("bit",20);//这样就是调用的第二个有参数的构造方法  当自己提供了构造方法的时候
        //编译器就不再自动生成一个构造方法了  给了参数的时候 依然可以set 来修改值
        Person per2 = new Person("offer");
        //面试问题：this关键字代表对象，这句话对不对？  答案：不对 因为它代表的是为对象分配的内存的地址  产生对象是第二步结束才产生对象
        //而第二步产生对象的时候 就用到了this指针
        //this():调用自己的构造的方法   this.data:调用当前对象的属性   this.func():调用当前对象的方法
    }

    public static void main1(String[] args) {
        //类和对象
        //定义类：
        //成员变量:普通的成员方法(不加static修饰)通过对象的引用.变量访问  静态成员方法/类方法(不属于类 加static修饰) 通过类名.静态变量访问
        //成员方法：对象的引用.方法名   静态成员方法(类方法)
        //注意：1 静态的数据只有一份 且属于方法区   2 非静态的数据成员属于对象 在堆上
        //封装：把成员方法或者成员变量使用private进行修饰   好处：类的调用者在类外就不能访问了  需要提供get set方法来访问 让程序更好的维护
        //关键字：this. 以防万一写错 代表的是当前对象的一个引用
    }
}
