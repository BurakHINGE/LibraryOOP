public class Book {
    
    public String bookName;
    public String authorName;
    public String[][] bookList;

    public Book(String bookName, String authorName, String[][] bookList) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookList = bookList;
    }

    




    public String getBookName(String bookName) {
        return bookName;
    }

    public String getAuthorName(String authorName) {
        return authorName;
    }

    public String[][] getAuthorName(String[][] bookList) {
        return bookList;
    }

    public void setBookName() {
        this.bookName = bookName;
    }

    public void setAuthorName() {
        this.authorName = authorName;
    }

    public void setBookList() {
        this.bookList = bookList;
    }

}
