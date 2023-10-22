import java.util.Scanner;

public class HouseholdGoodsStore {
    private static HouseholdGoodsStore instance;
    private String[] products;
    private int count;


    private HouseholdGoodsStore() {
        // Приватный конструктор для инициализации массива товаров
        products = new String[10];
        count = 0; // Изначально нет товаров
    }

    public static HouseholdGoodsStore getInstance() {
        if (instance == null) {
            instance = new HouseholdGoodsStore();
        }
        return instance;
    }

    public void addProduct(String product) {
        if (count < products.length) {
            products[count] = product;
            count++;
        } else {
            System.out.println("Магазин переполнен, нельзя добавить больше товаров.");
        }
    }

    public void removeProduct(String product) {
        for (int i = 0; i < count; i++) {
            if (products[i].equals(product)) {
                // Если найден товар, удаляем его и сдвигаем остальные элементы
                for (int j = i; j < count - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[count - 1] = null; // Удаляем последний элемент
                count--;
                return;
            }
        }
        System.out.println("Такого товара нет в магазине.");
    }

    public void displayProducts() {
        System.out.println("Товары в магазине хозяйственных товаров:");
        for (int i = 0; i < count; i++) {
            System.out.println("- " + products[i]);
        }
    }
}
