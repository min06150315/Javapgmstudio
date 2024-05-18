package week11.J062;

import java.util.ArrayList;
import java.util.Scanner;

public class BookCRUD {
    ArrayList<Book> list;
    public BookCRUD() {
        list = new ArrayList<Book>();
    }
    void addBook() {    // 도서 추가
        String book_name, author, category;
        int price, publish_year;
        Scanner s = new Scanner(System.in);

        System.out.print("Book Name > ");
        book_name = s.next();
        System.out.print("Author > ");
        author = s.next();
        System.out.print("Category > ");
        category = s.next();
        System.out.print("Price > ");
        price = s.nextInt();
        System.out.print("Publish Year > ");
        publish_year = s.nextInt();

        Book new_book = new Book(book_name, author, category, price, publish_year);
        list.add(new_book);
    }
    void editBook() {   // 도서 정보 수정
        int num;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Number of Book > ");
        num = s.nextInt() - 1;

        if (num >= 0 && num < list.size()) {
            System.out.print("New Author > ");
            String author = s.next();
            System.out.print("New Category > ");
            String category = s.next();
            System.out.print("New Price > ");
            int price = s.nextInt();
            System.out.print("New Publish Year > ");
            int year = s.nextInt();

            Book book = list.get(num);
            book.setAuthor(author);
            book.setCategory(category);
            book.setPrice(price);
            book.setYear(year);
            System.out.println("Edit Complete.");
        } else {
            System.out.println("No Data!!");
        }
    }
    void listBook() {   // 도서 목록 출력
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d - %s\n", i + 1, list.get(i).toString());
        }
    }
    void deleteBook() { // 도서 삭제
        int num;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Number of Book > ");
        num = s.nextInt() - 1;

        if (num >= 0 && num < list.size()) {
            list.remove(num);
            System.out.println("Delete Complete");
        } else {
            System.out.println("No Data!!");
        }
    }
}
