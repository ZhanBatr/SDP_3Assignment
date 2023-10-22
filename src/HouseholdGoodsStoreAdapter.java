class HouseholdGoodsStoreAdapter implements HouseholdGoodsComponent {
    private HouseholdGoodsStore store;

    public HouseholdGoodsStoreAdapter(HouseholdGoodsStore store) {
        this.store = store;
    }

    @Override
    public void displayProducts() {
        store.displayProducts();
    }
}

class ElectronicGoodsStoreAdapter implements ElectronicGoodsComponent {
    private ElectronicGoodsStore store;

    public ElectronicGoodsStoreAdapter(ElectronicGoodsStore store) {
        this.store = store;
    }

    @Override
    public void displayElectronicProducts() {
        store.displayElectronicProducts();
    }
}