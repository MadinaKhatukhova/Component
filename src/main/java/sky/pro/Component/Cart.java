package sky.pro.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@RequestScope
public class Cart {

    private final List<Integer> items;

    public Cart() {this.items = new ArrayList<>(); }

    public List<Integer> addItems(List<Integer> idList) {
        items.addAll(idList);
        return idList;
    }

    public List<Integer> getItems() { return Collections.unmodifiableList(items); }
}
