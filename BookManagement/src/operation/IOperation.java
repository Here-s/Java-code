package operation;

import book.BookList;

import java.util.Scanner;

public interface IOperation {
    void work(BookList bookList);
    Scanner scanner = new Scanner(System.in);
}
