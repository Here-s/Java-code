
class Student{
    public String name;
    private String name2;//当name被private修饰的时候  只能在类当中访问  在类外就访问不到了  封装的话 是为了防止调用者进行修改
    //封装之后 防止使用错误
    private int age;//在设计类的时候 如果无特殊要求 就最好都设计为private 体现封装  有些接口是要留出去的 就弄成公有的
    //提供一个公开的接口 来输出名字

    //编译器可以自己生成get和set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;//有this
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }//上面这些就是编译器生成的get 和set  是通过alt+insert 产生的

    public String getName2(){//一旦设置为public 就一般不会去修改了
        return this.name2;
    }
    //再给一个公共接口 就使得传进来的names变成了类里面的name2
    public void setName2(String name2){//局部变量不能和要赋的值一样  因为局部变量优先  如果一样的话 就是给参数赋值
        //如果名字一样的话 就要在前面加个this. 通过this指针来赋值
        this.name2 = name2;//这里的this 是关键字 是当传的参和要赋的值的参数一样时 用this来区分  this代表当前对象的引用
        //要习惯使用this   this写在那个类里面 就代表那个类的对象的引用
    }
    public void func(){
        System.out.println("func");
    }
    public void show(){
        System.out.println("我叫 "+this.name2+" 年龄 "+this.age);//多使用this
    }
    //show函数 如果字段多的话 还能用快捷键 alt+insert 选toString  然后把需要输出的的选上就行了
    @Override//这里相当于重新实现了一次Object类的 toString()方法  Object是所有类的父类  这个 @Override注解是表示这个方法是重新写的
    public String toString() {//输出的时候 直接sout 里面写上创建的变量就行了 这里的变量是stu 所以写上stu就好了
        return "Student{" +
                "name2='" + name2 + '\'' +
                ", age=" + age +
                '}';
    }
}
//以上是类的实现者写的代码
//以下是类的调用者
public class Encapsulation {
    public static void main(String[] args) {
        //封装  就是用private来修饰属性或者方法
        Student stu = new Student();
        stu.name = "offer";
        System.out.println(stu.name);
        stu.show();
        System.out.println(stu.getName2());
        stu.setName2("设置名字");
        System.out.println(stu.getName2());
        stu.show();
        System.out.println(stu);
    }
}
