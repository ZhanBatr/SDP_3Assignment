class ElectronicGoodsStore {
    private static ElectronicGoodsStore instance;
    private String[] electronicProducts;
    private int count;

    private ElectronicGoodsStore() {
        electronicProducts = new String[10];
        count = 0;
    }

    public static ElectronicGoodsStore getInstance() {
        if (instance == null) {
            instance = new ElectronicGoodsStore();
        }
        return instance;
    }

    public void addElectronicProduct(String product) {
        if (count < electronicProducts.length) {
            electronicProducts[count] = product;
            count++;
        } else {
            System.out.println("Магазин электроники переполнен, нельзя добавить больше товаров.");
        }
    }

    public void removeElectronicProduct(String product) {
        for (int i = 0; i < count; i++) {
            if (electronicProducts[i].equals(product)) {
                for (int j = i; j < count - 1; j++) {
                    electronicProducts[j] = electronicProducts[j + 1];
                }
                electronicProducts[count - 1] = null;
                count--;
                return;
            }
        }
        System.out.println("Такого товара нет в магазине электроники.");
    }

    public void displayElectronicProducts() {
        System.out.println("Товары в магазине электроники:");
        for (int i = 0; i < count; i++) {
            System.out.println("- " + electronicProducts[i]);
        }
    }
}
