//自定义异常 必须继承一个异常
class NameException extends RuntimeException{
    public NameException(String message) {
        super(message);
    }
}
class PasswordException extends RuntimeException{
    public PasswordException(String message) {
        super(message);
    }
}
//自定义异常
public class Test {
    private static final String name = "Lockey";
    private static final String password = "123";

    public static void login(String name,String password) throws NameException,PasswordException {
        if(!Test.name.equals(name)) {
            throw new NameException("用户名错误");
        }
        if(!Test.password.equals(password)){
            throw new PasswordException("密码错误");
        }
    }

    public static void main(String[] args) {
        try {
            login("Lockey","1234");
        } catch (NameException e){
            System.out.println("用户名错误");
        } catch (PasswordException e) {
            e.printStackTrace();
            System.out.println("密码错误");
        } finally {
            System.out.println("finally执行了");
        }
    }
}
