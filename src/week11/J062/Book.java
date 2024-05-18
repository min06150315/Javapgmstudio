package week11.J062;

public class Book {
    private String book_name;
    private String author;
    private String category;
    private int price;
    private int year;
    Book(String book_name) {
        this.book_name = book_name;
        this.author = "";
        this.category = "";
        this.price = 0;
        this.year = 0;
    }
    Book(String book_name, String author, String category, int price, int year) {
        this.book_name = book_name;
        this.author = author;
        this.category = category;
        this.price = price;
        this.year = year;
    }
    public String getBook_name() {
        return book_name;
    }
    public String getAuthor() {
        return author;
    }
    public String getCategory() {
        return category;
    }
    public int getPrice() {
        return price;
    }
    public int getYear() {
        return year;
    }
    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        return String.format("%s [%s] : %s (%d Won  %d year)", book_name, category, author, price, year);
    }

}
