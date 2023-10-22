import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HouseholdGoodsStore householdGoodsStore = HouseholdGoodsStore.getInstance();
        ElectronicGoodsStore electronicGoodsStore = ElectronicGoodsStore.getInstance();

        HouseholdGoodsComponent householdGoodsAdapter = new HouseholdGoodsStoreAdapter(householdGoodsStore);
        ElectronicGoodsComponent electronicGoodsAdapter = new ElectronicGoodsStoreAdapter(electronicGoodsStore);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Добавить товар в хозяйственных товарах");
            System.out.println("2. Удалить товар из хозяйственных товаров");
            System.out.println("3. Вывести список товаров хозяйственных товаров");
            System.out.println("4. Добавить товар в электронике");
            System.out.println("5. Удалить товар из электроники");
            System.out.println("6. Вывести список товаров электроники");
            System.out.println("7. Выход");
            System.out.print("Выберите действие: ");
            int n = scanner.nextInt();
            scanner.nextLine();

            switch (n) {
                case 1:
                    System.out.print("Введите название товара для хозяйственных товаров: ");
                    String productToAdd = scanner.nextLine();
                    householdGoodsStore.addProduct(productToAdd);
                    break;
                case 2:
                    System.out.print("Введите название товара для удаления из хозяйственных товаров: ");
                    String productToRemove = scanner.nextLine();
                    householdGoodsStore.removeProduct(productToRemove);
                    break;
                case 3:
                    householdGoodsAdapter.displayProducts(); // Использование адаптера для вывода товаров
                    break;
                case 4:
                    System.out.print("Введите название товара для электроники: ");
                    String electronicProductToAdd = scanner.nextLine();
                    electronicGoodsStore.addElectronicProduct(electronicProductToAdd);
                    break;
                case 5:
                    System.out.print("Введите название товара для удаления из электроники: ");
                    String electronicProductToRemove = scanner.nextLine();
                    electronicGoodsStore.removeElectronicProduct(electronicProductToRemove);
                    break;
                case 6:
                    electronicGoodsAdapter.displayElectronicProducts(); // Использование адаптера для вывода товаров в электронике
                    break;
                case 7:
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}
//адаптер паттерн позволяет работать с разными классами
// имеющими несовместимые интерфейсы в единой системе.