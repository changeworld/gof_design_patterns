import java.util.ArrayList;

public class BookShelf implements Aggregate {
    public ArrayList books;

    public BookShelf(int initialCapacity) {
        this.books = new ArrayList(initialCapacity);
    }

    public Book getBookAt(int index) {
        return (Book) books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
