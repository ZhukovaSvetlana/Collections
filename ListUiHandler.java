import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListUiHandler implements UiHandler {
    private final Scanner in = new Scanner(System.in);

    public void call() {
        List list = new ArrayList();
        while (true){
            showMenu();
            switch (in.nextInt()){
                case 1:
                    System.out.println("List.isEmpty() == " + list.isEmpty());
                    break;

                case 2: {
                    System.out.println("Введите элемент для поиска");
                    String item = in.next();
                    System.out.println(String.format("List.contains(%s) == %b", item, list.contains(item)));
                }
                break;

                case 3:
                    System.out.print("Введите элемент: ");
                    list.add(in.next());
                    break;
                case 4:
                    System.out.println("Введите индекс и элемент");
                    list.add(in.nextInt(), in.next());
                    break;
                case 5:
                    System.out.print("Введите элемент: ");
                    list.remove(in.next());
                    break;
                case 6:
                    System.out.println("Введите индекс удаляемого элемента");
                    list.remove(in.nextInt());
                    break;
                case 7:
                    System.out.println(list);
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
        System.out.println("3. add");
        System.out.println("4. addByIndex");
        System.out.println("5. remove");
        System.out.println("6. removeByIndex");
        System.out.println("7. showItems");
        System.out.println("8. goToMainMenu");
        System.out.print(">");
    }
}
