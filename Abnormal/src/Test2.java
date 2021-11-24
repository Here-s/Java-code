//受查异常
class MyException extends Exception{
    //自带一个默认构造方法 所以要输出自定义异常的内容的话，就要实现一个构造方法

    public MyException(String message) {
        super(message);
    }
}
//非受查异常（运行时异常）
class MyException2 extends RuntimeException{
    public MyException2(String message) {
        super(message);
    }
}
public class Test2 {

    public static void func3(int x) throws MyException2{
        try {
            if (x == 0){
                throw new MyException2("lllllll");
            }
        } catch (MyException2 e) {
            e.printStackTrace();
        }
    }
    public static void func1(int x) {
        //扔出受查异常 使用 try catch
        try {
            if (x == 0) {
                throw new MyException("haha");
            }
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
    public static void func2(int x) throws MyException{
        if (x == 0){
            throw new MyException("hhhhhhh");
        }
    }
    public static void main(String[] args) {
        func3(0);
    }
}
