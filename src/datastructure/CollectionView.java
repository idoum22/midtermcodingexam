package datastructure;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import java.util.HashMap;
class CollectionView {
        public static void main(String[] args) {
                HashMap<Integer, String> map = new HashMap<>();
                map.put(1, "NYC");
                map.put(2, "LA");
                map.put(3, "Denver");
                map.put(4, "Boston");
                map.put(5, "San Jose");
                map.put(6, "Seattle");
                System.out.println("Collection view is: "+ map.values());
        }
}

