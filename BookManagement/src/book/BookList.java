package book;

public class BookList {
    private Book[] books = new Book[10];
    private int usedSize;

    public BookList() {
        books[0] = new Book("三国演义","罗贯中",17,"小说");
        books[1] = new Book("红楼梦","曹雪芹",23,"小说");
        this.usedSize = 2;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
    public Book getPos(int pos) {
        return this.books[pos];
    }

    public void setBook(int pos, Book book) {
        this.books[pos] = book;
    }


}
