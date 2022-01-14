<<<<<<< HEAD
package demo5;


class Person implements Cloneable {
    public int age;
    public void eat() {
        System.out.println("吃！");
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Test5 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        person.age = 99;
        Person person1 = (Person)person.clone();
        System.out.println(person1);
        person1.age = 199;
        System.out.println(person);
        System.out.println(person1);
    }
}
=======
package demo5;


class Person implements Cloneable {
    public int age;
    public void eat() {
        System.out.println("吃！");
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Test5 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        person.age = 99;
        Person person1 = (Person)person.clone();
        System.out.println(person1);
        person1.age = 199;
        System.out.println(person);
        System.out.println(person1);
    }
}
>>>>>>> d0de945c0ce2418bb2df26e520dc3abf85c3b094
