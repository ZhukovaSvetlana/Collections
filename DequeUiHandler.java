import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DequeUiHandler implements UiHandler {
    private final Scanner in = new Scanner(System.in);

    public void call() {
        Deque deque = new LinkedList();
        while (true) {
            showMenu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println("Deque.isEmpty() == " + deque.isEmpty());
                    break;

                case 2: {
                    System.out.println("Введите элемент для поиска");
                    String item = in.next();
                    System.out.println(String.format("Deque.contains(%s) == %b", item, deque.contains(item)));
                }
                break;

                case 3:
                    System.out.print("Введите элемент: ");
                    deque.addFirst(in.next());
                    break;

                case 4:
                    System.out.print("Введите элемент: ");
                    deque.addLast(in.next());
                    break;

                case 5:
                    System.out.println(deque);
                    break;

                case 6:
                    System.out.println(String.format("Deque.getFirst() == %s", deque.getFirst()));
                    break;

                case 7:
                    System.out.println(String.format("Deque.getLast() == %s", deque.getLast()));
                    break;

                case 8:
                    System.out.println(String.format("Deque.pollFirst() == %s", deque.pollFirst()));
                    break;

                case 9:
                    System.out.println(String.format("Deque.pollLast() == %s", deque.pollLast()));
                    break;

                case 10:
                    try {
                        System.out.println(String.format("Deque.removeFirst() == %s", deque.removeFirst()));
                    } catch (NoSuchElementException e) {
                        System.out.println(String.format("Deque.removeFirst() == %s", e));
                    }
                    break;

                case 11:
                    try {
                        System.out.println(String.format("Deque.removeLast() == %s", deque.removeLast()));
                    } catch (NoSuchElementException e) {
                        System.out.println(String.format("Deque.removeLast() == %s", e));
                    }
                    break;

                default:
                    return;

            }
            System.out.println();
        }
    }

    private void showMenu() {
        System.out.println("Выберете действие над коллекцией:");
        System.out.println("1. isEmpty");
        System.out.println("2. contains");
        System.out.println("3. addFirst");
        System.out.println("4. addLast");
        System.out.println("5. showItems");
        System.out.println("6. getFirst");
        System.out.println("7. getLast");
        System.out.println("8. pollFirst");
        System.out.println("9. pollLast");
        System.out.println("10. removeFirst");
        System.out.println("11. removeLast");
        System.out.println("12. goToMainMenu");
        System.out.print(">");
    }
}
