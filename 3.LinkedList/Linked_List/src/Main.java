import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList ssl = new SinglyLinkedList();

        ssl.createSinglyLinkedList(7);
        System.out.println(ssl.head.value);

    }
}