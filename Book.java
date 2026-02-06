public class Book {
    
    public String bookName;
    public String authorName;

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }


    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }


}
