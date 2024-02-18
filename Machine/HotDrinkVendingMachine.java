package Machine;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{
    List<Product> productList = new ArrayList<>();

    public void addHotDrink(HotDrink hotDrink) {
        productList.add(hotDrink);
    }

    @Override
    public void intProduct(List<Product> list) {
        productList = list;
    }

    @Override
    public Product getProduct(String name) {
        for (Product i : productList) {
            if(i.getName().equals(name))
                return i;
        }
        return null;
    }

    public Product getProductVolume(String name, double volume, int temperature) {
        for (Product i : productList) {
            if(i.getName().equals(name))
                return i;
        }
        return null;
    }
}
