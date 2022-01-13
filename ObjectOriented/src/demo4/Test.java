package demo4;
import java.util.Arrays;
import java.util.Comparator;


//如果比较自定义的数据类型，一定要实现可以比较的接口

//Comparable<Student> 代表现在要比较学生了
//  这个接口有一个很大的缺点，对类的侵入性非常强，不敢轻易改动 所以就有了另外一个
//  所以就有了 Comparator 对类的侵入性非常弱
//用哪个接口 取决于你的业务 一般推荐比较器 Comparator


//class Student implements Comparable<Student> {
//    public int age;
//    public String name;
//    public double score;
//
//    public Student(int age, String name, double score) {
//        this.age = age;
//        this.name = name;
//        this.score = score;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                ", score=" + score +
//                '}';
//    }
//
//    //谁调用这个方法，谁就是 this
//    //但是这里也只能比较年龄 不能按照成绩来比较 因为成绩是 double
//    //当成绩强制转换的时候，就会导致逻辑全部出错
//    //所有引用类型的比较 一定要借助他可以比较的方法
//    //  比较 String 的时候 就使用 this.name.compareTo(o.name)
//    @Override
//    public int compareTo(Student o) {
////        if(this.age > o.age) {
////            return 1;
////        } else if (this.age == o.age) {
////            return 0;
////        } else {
////            return -1;
////        }
//        //比较也可以这样写  从大到小排序就是 o.age - this.age
//        return this.age - o.age;
//    }
//}

class Student {
    public int age;
    public String name;
    public double score;

    public Student(int age, String name, double score) {
        this.age = age;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }
}

class ScoreComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (int)(o1.score - o2.score);
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class Test {

    public static void main3(String[] args) {
        Student student = new Student(12,"qwer",89.9);
        Student student1 = new Student(18,"abcd",99.9);

        //用 Comparable 来比较
        //System.out.println(student.compareTo(student1));

        AgeComparator ageComparator = new AgeComparator();
        System.out.println(ageComparator.compare(student,student1));
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(18,"Lockey",99.9);
        students[1] = new Student(38,"qwer",89.9);
        students[2] = new Student(28,"abcd",79.9);

        AgeComparator ageComparator = new AgeComparator();
        ScoreComparator scoreComparator = new ScoreComparator();
        NameComparator nameComparator = new NameComparator();

        System.out.println(Arrays.toString(students));
        Arrays.sort(students,nameComparator);
        System.out.println(Arrays.toString(students));
    }

    public static void main1(String[] args) {
        int[] array = new int[]{1,21,3,6,4,9};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
