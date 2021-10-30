import java.util.*;

//类的实现者
class Person{
    //类里面有字段 也就是属性 就是成员变量

    //字段是定义在类的内部 方法的外部  就是成员变量
    //成员变量：普通成员变量  静态成员变量
    //静态成员变量的访问：类名.静态的成员属性/方法    普通方法的内部不能定义静态的变量
    //静态方法的内部也不能定义静态的变量   普通方法内可以调用静态方法
    //静态方法不能调用普通方法 因为静态的方法不依赖于对象，普通方法依赖于对象

    //这里的 public 可以写成 private 就被封装起来了 就只能在当前类当中来使用
    //封装之后会更安全   用 private 来封装
    private String name;
    //public String name;//不建议在这里直接赋值
    public int age;


    //类加载的时候 就调用了代码块  先执行静态代码块 然后是实例代码块
    {
        //实例代码块  可以初始化类成员
        System.out.println("实例代码块");
    }

    static {
        //静态代码块  用来初始化静态成员
        //如果静态成员在下面 那么结果就是最下面的值 一个静态成员的值只与最后一次赋值有关
        count = 99;
        System.out.println("静态代码块");
    }

    //被 final 修饰 还在对象当中   被 static 修饰 放在方法区 不在类当中
    //静态的不依赖对象
    //所有文件只存储一份

    //这个代码可以跑 但是不知道怎么修改 也不敢动 就是祖传代码

    public static int count = 10;//静态成员变量
    public final int a = 10;//加 final 之后 就不可以修改值了

    public void setName(String myName) {
        name = myName;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age1) {
//        age = age1;//要注意到这里的 age 不能相同 否则这三个 age 相同，类外不能赋值
//        //出非加个 this 指针
//    }

    // this 代表当前对象的引用   要常用 this 指针
    public void setAge(int age) {
        this.age = age;
    }

    //方法 也就是行为  就是成员方法
    //成员方法：普通成员方法 静态成员方法
    public void eat(){
        System.out.println(name+" 正在吃饭");
    }
    public void sleep(){
        System.out.println(name+" 正在睡觉");
    }
    private void print(){//这个方法只能在这个类里面使用
        this.eat();
        System.out.println(name+" 正在吃饭 "+name+" 正在睡觉");
    }

    public static void staticFunc(){
        System.out.println("static::func()静态方法");
    }

    //这样就是动态绑定，就能贺当前类绑定在一块了
    //因为输出这个类名的时候 就直接返回了这里的 toString 方法
    //编译器 也可以生成 toString 方法
    @Override //打印属性  这样输出 Person 的引用的时候，就可以返回这里的字符串属性了
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //构造方法： 方法名和类目是相同的，且构造方法比较特殊，没有返回值
    //构造方法：一个对象的产生   1 为对象分配内存  2 调用合适的构造方法
    //我们没有写任何一个构造方法的话 编译器会自动生成一个没有参数的构造方法
    //构造方法之间可以构成重载

    //不带参数的构造方法  不能改成 private 但是类外是不能实例化对象的
    //下面这三个构造方法是重载
    public Person()  {
        this("Lockey");//进来之后 会调用有一个参数的构造方法
        System.out.println("Person() 不带参数的构造方法");
    }
    public Person(String name){
        this.name = name;
        System.out.println("Person() 带一个参数的构造方法");
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Person() 带两个参数的构造方法");
    }

    //静态方法里面不要用 this 能不用 static 就不用 static
    //this.data  调用当前对象的属性
    //this.func  调用函数的属性
    //this()     调用当前函数不带参数的构造方法  只能放在第一条语句
    //成员方法也不能调用构造方法
}
public class ClassesAndObjects {

    public static void main(String[] args) {
        //匿名对象 就是没有名字的对象
        new Person().eat();//这就是匿名对象 是一次性的
        Person person = new Person();
        person.eat();
        person.sleep();
        System.out.println(person);
    }

    public static void main8(String[] args) {
        //不实例化对象 也要执行静态代码块  也是执行一次 在类加载的时候 就执行了静态代码块
        System.out.println(Person.count);
    }

    public static void main7(String[] args) {
        {
            //这里就是本地代码块
        }
        //静态代码块只会被执行一次 与有多少对象无关
        Person person = new Person();
        Person person1 = new Person();

    }

    public static void main6(String[] args) {
        Person person = new Person();
        Person p1 = new Person("Lockey");
        Person p2 = new Person("Lockey", 18);
    }

    //对于类的调用者 只需要看类的调用接口就行了，不用管类内的区别和变化
    public static void main5(String[] args) {
        Person person = new Person();
        person.setName("Lockey");
        System.out.println(person.getName());
    }

    Person person = new Person();//在当前的类中 当 new 当前类的时候 就会产生这个 person

    public static void main4(String[] args) {
        //只要写了这一行代码，cla 在栈上 new 了一个对象 ClassesAndObjects 在堆上
        //有一个字段 person 在对象 ClassesAndObjects 上，所以就会占用一段堆的空间
        //所以引用不一定在栈上 也可能在堆上
        ClassesAndObjects cla = new ClassesAndObjects();

    }

//    public static void main3(String[] args) {
//        Person person = new Person();//打印的是处理过的地址
//        System.out.println(person);//但是这里拿到的并不是真正的地址 但他是唯一的
//        //所以也可以当作地址
//
//        person.print();
//    }
//
//    //JVM 加载的时候 要从静态的 main 函数进来  JVM 认为是从静态的 main 开始的
//    //因为如果方法不加 static 的话 就是普通的成员方法，就需要依赖对象
//    //所以要调用的话 就要 new 一个对象才能调用
//    //字节码文件 class 就放在方法区
//    public static void main2(String[] args) {
//        Person person = null;//这个引用不指向任何的对象
//        //p2 和 p1 指向同一个对象
//        Person p1 = new Person();
//        Person p2 = p1;//p2 这个引用指向 p1 这个引用所指向的对象
//
//        一个引用不能同时指向多个对象
//        Person p3 = new Person();
//        p3 = new Person();
//        p3 = new Person();//p3 不能指向多个对象  只看指向最后的那个对象
//    }
//
//    public static void main1(String[] args) {
//        //对象从类来  类就是类型通过关键字 class 定义类
//        //类 一定是大驼峰
//
//        //类产生对象 就是实例化 通过 new 关键字来实例化  可以实例化多个对象
//        Person p1 = null;//由类定义的变量 是引用变量 所以初值可以为 null
//        Person p2 = new Person();//这样就实例化了一个对象
//        //p2 引用了这个对象  这个对象里面就包括了 name 和 age
//        //普通成员变量的访问需要通过对象的引用来访问
//
//        p2.age = 18;//如果不初始化的话 输出就是默认值
//        //数值型的默认值是 0  字符型是：\u0000  布尔型：false  数组、类、接口：null
//        p2.name = "Lockey";
//        System.out.println(p2.name);
//        System.out.println(p2.age);
//        p2.eat();//通过对象来访问方法
//        p2.sleep();
//
//        //不同的对象之间是没有关系的  每个对象都有 name 和 age
//        Person p3 = new Person();
//        System.out.println(p3.age);
//        System.out.println(p3.name);
//
//        //因为是常量，所以每个对象调用的 count 是同一个 count 因为被 static 修饰了
//        p2.count++;
//        System.out.println(p2.count);
//        p3.count++;
//
//        //因为 count 不属于对象 所以可以直接用 类名.count
//        Person.count++;
//        System.out.println(p3.count);
//
//        Person.staticFunc();//可以通过类目直接访问静态方法
//    }
}
