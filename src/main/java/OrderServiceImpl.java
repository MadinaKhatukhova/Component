import org.springframework.stereotype.Service;
import sky.pro.Component.Cart;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    private final Cart cart;

    public OrderServiceImpl(Cart cart) { this.cart = cart; }

    @Override
    public List<Integer> addItems(List<Integer> idList) {
        return cart.addItems(idList);
    }

    @Override
    public List<Integer> getItems() {
        return cart.getItems();
    }
}
