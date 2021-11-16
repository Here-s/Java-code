package operation;

import book.Book;
import book.BookList;

public class BorrowOperation implements IOperation{

    public void work(BookList bookList) {
        System.out.println("借阅图书");
        System.out.println("请输入借阅的图书的名字");
        String name = scanner.nextLine();
        int size = bookList.getUsedSize();
        for (int i = 0; i < size; i++){
            Book book = bookList.getPos(i);
            if(name.equals(book.getName())){
                book.setBorrowed(true);
                System.out.println("借阅成功");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有这本书，无法借阅");
    }

}
