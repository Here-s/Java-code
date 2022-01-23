import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

class Person implements Cloneable{
    public int id;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Abnormal {

    //使用 while 循环建立类似 ”恢复模型“ 的异常处理行为，它将不断重复，直到异常不再抛出
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            try {
                if (i < 10) {
                    throw new RuntimeException("x < 10");
                }
            } catch (RuntimeException e){
                e.printStackTrace();
                System.out.println("尝试处理异常");
                i++;
            }
        }
        System.out.println("异常处理结束了");
    }

    //用 throw 抛异常的时候 抛的是自定义的异常
    public static void func4(int x) throws RuntimeException {
        if(x == 10){
            System.out.println(10 / x);
            throw new RuntimeException("x == 10");
        }
    }
    public static void main12(String[] args) {
        try {
            func4(10);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static int func3() {
        int a = 10;
        //不论有没有异常 finally 都会执行 所以要尽量避免在 finally 里面写 return
        //这里 return a 之后 还会执行 finally 方法
        try {
            return a;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            return 20;
        }
    }
    public static void main11(String[] args) {
        int n = func3();
        System.out.println(n);
    }

    //通过方法来判断是不是除数异常
    public static void func2(int n) throws ArithmeticException {
        //加上 throws 双重保险
        try {
            System.out.println(10/n);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
    public static void main10(String[] args) {
        try {
            func2(0);
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

    public static void main9(String[] args) {
        //当异常交给 JVM 的时候 finally 还会执行

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        try {
            System.out.println(10 / n);
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("输入有误");
        } finally {
            scanner.close();
            System.out.println("finally 执行了");
        }
    }

    public static void main8(String[] args) {
        //当把对象放在 try 当中的时候 就不执行 finally 里面的 close 了
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            System.out.println(10 / n);
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("输入有误");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("算术异常，可能 0 做了除数");
        } finally {
            System.out.println("finally 执行了");
        }
    }

    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        try {
            System.out.println(10 / n);
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("输入有误");
//        } catch (ArithmeticException e){
//            e.printStackTrace();
//            System.out.println("算术异常，可能 0 做了除数");
        } finally {
            //finally 一般用于资源的关闭
            //不管是否发生异常 finally 都会执行
            scanner.close();
            System.out.println("finally 执行了");
        }
    }

    //catch 在捕获异常的时候 最好是从子类到父类捕获
    //catch 最好是捕获某个异常
    public static void main6(String[] args) {
        int[] arr = new int[]{1,2,3};
        try {
            arr = null;
            System.out.println(arr[2]);
            System.out.println("哈哈");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("发生异常了");
        }
    }

    //异常的体系结构  所有的异常 都来自 Throwable
    //有编译时异常（受查异常）  运行时异常（非受查异常）
    public static void func() {
        //栈溢出错误    还会有堆溢出错误（很少见 因为堆区很大）
        func();
    }
    public static void main5(String[] args) {
        int[] arr = new int[]{1,2,3};
        try {
            arr = null;
            System.out.println(arr[2]);
            System.out.println("哈哈");
        } catch (Exception e) {
            //因为所有的异常都是 Exception 子类 所以也可以直接写这个 单身范围太大了 不知道具体是什么异常
            e.printStackTrace();
            System.out.println("发生异常了");
        }
        System.out.println("哈喽！！！");
    }

    public static void main4(String[] args) {
        int[] arr = new int[]{1,2,3};
        try {
            arr = null;
            System.out.println(arr[2]);
            System.out.println("哈哈");
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            //catch 一次捕捉多种情况异常  如果没有捕捉异常 就交给 JVM 处理了
            //JVM 一处理的话 就直接终止代码了
            //结束的 code 码是 0 的话 就是程序正常结束 否则就是程序异常结束
            e.printStackTrace();
            System.out.println("捕捉到了数组越界 或者 空指针异常");
        }
    }

    //报异常之后，先确定是什么异常

    //捕捉异常 通过 try catch finally
    public static void main3(String[] args) {
        int[] arr = new int[]{1,2,3};
        try {//里面放可能出现异常的代码
            arr = null;//这种情况就是 空指针异常
            System.out.println(arr[2]);//这里抛出异常 代码就在这里终止了，就不会继续往下执行了
            System.out.println("哈哈");//这个不能被打印 因为上面一行被捕捉到了异常
            //所以 try 里面的= 异常后面的代码就不执行了
        } catch (ArrayIndexOutOfBoundsException e){//异常的处理 必须要加 catch
            e.printStackTrace();//打印栈上的异常 就是出现的异常情况  （异常信息栈）
            System.out.println("捕捉到了数组越界异常");
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("捕捉到了空指针异常");
        }
        System.out.println("哈喽！！！");
    }

    public static void main2(String[] args) {
        Person person = new Person();
        try {
            Person person1 = (Person) person.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public static void main1(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(arr[9]);//这样就会报异常 运行时就报异常
    }

    public static void main0(String[] args) {
        System.out.println(10/0);
    }
}
