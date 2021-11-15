package operation;

import book.BookList;

public class ReturnOperation implements IOperation{

    public void work(BookList bookList) {
        System.out.println("归还图书");
        System.out.println("请输入归还书的名字");
    }
}
