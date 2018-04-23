import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetUiHandler implements UiHandler {
    private final Scanner in = new Scanner(System.in);

    public void call() {
        Set set = new HashSet<>();
        while (true) {
            showMenu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println("Set.isEmpty() == " + set.isEmpty());
                    break;

                case 2: {
                    System.out.println("Введите элемент для поиска");
                    String item = in.next();
                    System.out.println(String.format("Set.contains(%s) == %b", item, set.contains(item)));
                }
                break;

                case 3:
                    System.out.print("Введите элемент: ");
                    set.add(in.next());
                    break;

                case 4:
                    System.out.print("Введите элемент: ");
                    set.remove(in.next());
                    break;

                case 5:
                    System.out.println(set);
                    break;

                default:
                    return;
            }
        }
    }

    private void showMenu() {
        System.out.println("\nВыберете действие над коллекцией:");
        System.out.println("1. isEmpty");
        System.out.println("2. contains");
        System.out.println("3. add");
        System.out.println("4. remove");
        System.out.println("5. showItems");
        System.out.println("6. goToMainMenu");
        System.out.print(">");
    }
}
