package collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        // Các phần tử là duy nhất
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        // [1, 2, 3]
        System.out.println(set);
    }
}
