package week12.J071;

import java.util.*;

public class TodoCRUD implements iCRUD {
    private ArrayList<TodoItem> list;
    public TodoCRUD() {
        this.list = new ArrayList<TodoItem>();
    }

    @Override
    public Object createItem() {
        return null;
    }

    @Override
    public int addItem() {
        String title, desc;
        Scanner sc = new Scanner(System.in);

        System.out.print("Add a Todo item\n" + "Enter the title: ");

        title = sc.nextLine().trim();
        if (isDuplicated(title)) {
            System.out.println("Title can't be duplicated.");
            return 1;
        }

        System.out.print("Enter the detail: ");
        desc = sc.nextLine().trim();

        TodoItem t = new TodoItem(title, desc);
        this.list.add(t);
        System.out.println("item added");
        return 0;
    }
    @Override
    public int updateItem() {
        String title, detail;
        Scanner sc = new Scanner(System.in);

        System.out.print("Edit a Todo item\n" + "Enter the title of the item to edit: ");
        title = sc.nextLine().trim();

        TodoItem search = null;
        for (TodoItem item : list) {
            if (item.getTitle().equals(title)) {
                search = item;
                break;
            }
        }
        if (search == null) {
            System.out.println("Not found.");
            return 0;
        }
        System.out.print("Enter the new detail: ");
        detail = sc.nextLine().trim();
        search.setDetail(detail);

        System.out.println("item updated.");
        return 0;
    }
    @Override
    public int deleteItem() {
        String title;
        Scanner sc = new Scanner(System.in);

        System.out.print("Delete a Todo item\n" + "Enter the title of the item to remove: ");
        title = sc.nextLine().trim();

        TodoItem search = null;
        for (TodoItem item : list) {
            if (item.getTitle().equals(title)) {
                search = item;
                break;
            }
        }
        if (search == null) {
            System.out.println("Not found.");
            return 0;
        }
        list.remove(search);
        System.out.println("item deleted.");
        return 0;
    }

    @Override
    public int printItem() {
        return 0;
    }

    boolean isDuplicated(String title) {
        for (TodoItem item : this.list) {
            if (title.equals(item.getTitle())) {
                return true;
            }
        }
        return false;
    }
    public int printAll() {
        System.out.println("Total " + this.list.size() + " items");
        for (TodoItem item : this.list) {
            System.out.println(item.toString());
        }
        return 0;
    }
    public void sortByName() {
        Collections.sort(this.list, new TodoitemNameComparator());
    }
    public void sortByDate() {
        Collections.sort(this.list, new TodoitemDateComparator());
    }
    public void reverseList() {
        Collections.reverse(this.list);
    }
    class TodoitemNameComparator implements Comparator<TodoItem> {
        @Override
        public int compare(TodoItem o1, TodoItem o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }
    class TodoitemDateComparator implements Comparator<TodoItem> {
        @Override
        public int compare(TodoItem o1, TodoItem o2) {
            return o1.getReg_date().compareTo(o2.getReg_date());
        }
    }
}
