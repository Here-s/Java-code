
class Person{//人的类已经定义好了
    //一个类是由字段和方法组成的  field 成员属性    method 成员方法
    //字段->成员变量   定义在方法外边 类里面   成员变量 放在对象里面  实例成员对象在对象里面
    //实例成员没有初始化 默认值为对应的0值  引用类型默认为null  简单类型默认为0  char类型的默认值是\u0000   boolean对应的是false
    public String name;//什么也没加 是默认权限  是实例成员变量   实例对象成员也可以初始化
    public int age;//没加static静态符  就叫做实例成员变量   加了static就叫静态成员变量
    public static int size = 10;//这个size就不再对象里面  叫做静态成员变量  也可以不初始化 默认值为0
    //方法->行为
    public void eat(){//这里的public(公有的)叫做访问修饰限定符  还有private 私有的   protected 受保护的
        //什么都不写：默认权限->包访问权限
        int a = 10;//a在方法里面 是局部变量 局部变量使用的时候 一定要初始化
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep");
    }
}
public class ClassAndObject {
    public static void main(String[] args) {//要访问类中的静态成员的话 不需要去new对象 直接通过类名就能访问 就是类名.静态成员变量
        //如何访问静态成员变量(不属于对象，在方法区 属于Person 所以通过Person.size打印)  之前是先拿到一个对象 然后在加个点来访问
        Person per = new Person();
        System.out.println(per.size);//idea 中看到黄色底色  说明是警告
        System.out.println(Person.size);
    }

    public static void main3(String[] args) {
        //如何拿到age
        Person per = new Person();//new 了一个per 相当于实例化了一个对象
        //对于per来说 per放在栈上 也是一个引用 指向在堆的对象里面的name age
        //如何访问对象当中的实例成员变量  通过对象的引用来访问  就是：对象的引用.成员变量
        per.name = "offer";
        System.out.println(per.name);
        System.out.println(per.age);
    }

    public static void main2(String[] args) {
        //原则上来讲 一个Java文件只能只能写一个类
        //定义一个person类 要用到关键字class 后面加上类的名字 类名一定要大驼峰 就是首字母大写
        Person person = new Person();//Person是变量类型 person是变量名字 随便写  通过new来产生对象 这就是实例化一个对象
        Person person1 = new Person();//可以产生多个对象  如person1  person2  person3 引用的就是对象
        Person person2 = new Person();//这多个对象  就是通过类产生对象 又叫实例化对象 通过关键字new
        Person person3 = new Person();
    }

    public static void main1(String[] args) {
        //说一说    OOP语言的三大特性 OOP:面向对象的语言
        //类：自定义类型  想象成一个模板
        //对象：实体  通过类(模板)产生的实体  通过一个类可以产生多个对象
        //写面向对象代码的时候： 找对象 创对象 使用对象
        //面向对象是一个概念 就像把大象放在冰箱里面 冰箱就是一个对象
        //就像面向过程(重要的是过程)的时候 通过for循环打印数组   而面向对象(重要的是对象)是通过类Arrays来操作数组
    }
}
