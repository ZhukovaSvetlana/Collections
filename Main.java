import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            showMenu();
            switch (in.nextInt()) {
                case 1:
                    new ListUiHandler().call();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;

                default:
                    return;
            }
            System.out.println();
        }

   }

    private static void showMenu() {
        System.out.println("Выберете тип коллекции:");
        System.out.println("1. List");
        System.out.println("2. Set");
        System.out.println("3. Deque");
        System.out.println("4. Map");
        System.out.print(">");
    }


}
