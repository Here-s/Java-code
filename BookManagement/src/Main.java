import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {

    public static User login() {
        System.out.println("请输入你的姓名");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入你的身份：1 管理员  0 普通用户");
        int choice = scanner.nextInt();
        if (choice == 1){
            return new AdminUser(name);
        } else {
            return new NormalUser(name);
        }
    }
    public static void main(String[] args) {
        BookList bookList = new BookList();
        //user 引用哪个对象 取决于返回哪个对象
        User user = login();

        while (true) {
            int choice = user.menu();

            //根据 choice 调用合适的操作。
            user.doWord(choice, bookList);
        }
    }
}
