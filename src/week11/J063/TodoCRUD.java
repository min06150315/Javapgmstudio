package week11.J063;

import week11.J062.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoCRUD {
    ArrayList<Todo> list;
    public TodoCRUD() {
        list = new ArrayList<Todo>();
    }
    void addTodo() {
        String title, content, deadline, category;
        Scanner s = new Scanner(System.in);

        System.out.print("Title > ");
        title = s.next();
        System.out.print("Content > ");
        content = s.next();
        System.out.print("Deadline > ");
        deadline = s.next();
        System.out.print("Category > ");
        category = s.next();

        Todo new_todo = new Todo(title, content, deadline, category);
        list.add(new_todo);
    }
    void editTodo() {
        int num;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Number of Todo > ");
        num = s.nextInt() - 1;

        if (num >= 0 && num < list.size()) {
            System.out.print("New Title > ");
            String title = s.next();
            System.out.print("New Content > ");
            String content = s.next();
            System.out.print("New Deadline > ");
            String deadline = s.next();
            System.out.print("New Category > ");
            String category = s.next();

            Todo todo = list.get(num);
            todo.setTitle(title);
            todo.setContent(content);
            todo.setDeadline(deadline);
            todo.setCategory(category);
            System.out.println("Edit Complete.");
        } else {
            System.out.println("No Data!!");
        }
    }
    void listTodo() {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d - %s\n", i + 1, list.get(i).toString());
        }
    }
    void deleteTodo() {
        int num;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Number of Todo > ");
        num = s.nextInt() - 1;

        if (num >= 0 && num < list.size()) {
            list.remove(num);
            System.out.println("Delete Complete");
        } else {
            System.out.println("No Data!!");
        }
    }
}
