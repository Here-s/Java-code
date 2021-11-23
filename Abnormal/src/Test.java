
class NameException extends Exception{

}

public class Test {
    private static String name = "Lockey";
    private static String password = "123";

    public static void login(String name,String password) {
        if(!Test.name.equals(name)) {
            System.out.println("用户名错误");
            throw new NameException();
        }
        if(!Test.password.equals(password)){
            System.out.println("password错误");
        }
    }

    public static void main(String[] args) {
        login("Lockey","123");
    }
}
