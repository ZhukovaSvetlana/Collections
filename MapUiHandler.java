import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapUiHandler implements UiHandler {
    private final Scanner in = new Scanner(System.in);

    public void call() {

        Map map = new HashMap();
        while (true) {
            showMenu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println("Map.isEmpty() == " + map.isEmpty());
                    break;

                case 2: {
                    System.out.print("Введите ключ: ");
                    Object key = in.next();
                    System.out.println(String.format("Map.get(%s) == %s", key, map.get(key)));
                }
                break;

                case 3: {
                    System.out.print("Введите элемент: ");
                    String key = in.next();
                    String item = in.next();
                    map.put(key, item);
                }
                break;

                case 4: {
                    System.out.print("Введите элемент: ");
                    String key = in.next();
                    System.out.println(String.format("Map.remove(%s) == %s", key, map.remove(key)));
                }
                break;

                case 5:
                    System.out.println(map);
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
        System.out.println("2. get");
        System.out.println("3. put");
        System.out.println("4. remove");
        System.out.println("5. showItems");
        System.out.println("6. goToMainMenu");
        System.out.print(">");
    }
}
