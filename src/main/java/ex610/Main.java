package ex610;

public class Main {
    public static void main(String[] args) {

        TodoList list = new TodoList();

        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");

        list.print();
        list.remove(2);

        System.out.println();
        list.print();
    }
}
