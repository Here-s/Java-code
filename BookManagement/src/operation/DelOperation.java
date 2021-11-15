package operation;

import book.Book;
import book.BookList;

public class DelOperation implements IOperation{

    public void work (BookList bookList) {
        System.out.println("删除图书");
        System.out.println("请输入要删除的书的名字");
        String name = scanner.nextLine();
        int size = bookList.getUsedSize();
        int pos = 0;
        for (pos = 0; pos < size; pos++){
            Book book = bookList.getPos(pos);
            if(name.equals(book.getName())){
                break;
            }
        }
        if(pos == size){
            System.out.println("没有找到这本书，无法删除");
        } else {
            for (int i = pos; i < size - 1; i++){
                Book book = bookList.getPos(i + 1);
                bookList.setBook(i,book);
            }
            bookList.setBook(size,null);
            bookList.setUsedSize(size - 1);
            System.out.println("删除成功");
        }
    }
}
