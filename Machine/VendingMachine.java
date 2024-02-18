package Machine;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {

    void intProduct(List<Product> list);

    Product getProduct (String name);

}
