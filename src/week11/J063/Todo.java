package week11.J063;

public class Todo {
    private String title;
    private String content;
    private String deadline;
    private String category;
    Todo(String title, String content, String deadline, String category) {
        this.title = title;
        this.content = content;
        this.deadline = deadline;
        this.category = category;
    }
    Todo(String title) {
        this.title = title;
        this.content = "";
        this.category = "";
        this.deadline = "";
    }
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
    public String getDeadline() {
        return deadline;
    }
    public String getCategory() {
        return category;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String toString() {
        return String.format("%s : %s [%s] (~%s)", title, content, category, deadline);
    }
}
