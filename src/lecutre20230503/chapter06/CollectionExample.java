package lecutre20230503.chapter06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list = new LinkedList<>();
        list.add(Integer.valueOf(42));
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(21));
        
        list.remove(Integer.valueOf(21));
        
        boolean contains = list.contains(Integer.valueOf(42));
        if(contains) {
            System.out.println("Ist enthalten!");
        }
        
        for(Integer x : list) {
            System.out.println(x);
        }
        
        
        // key = value
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(42, "Test");
        hashMap.containsKey(42);
        String value = hashMap.get(42);
        
        Set<Integer> keySet = hashMap.keySet();
        for(Integer x : keySet) {
            
        }
        Collection<String> values = hashMap.values();
        for(String v : values) {
            
        }
        
        for(Entry<Integer, String> entry : hashMap.entrySet()) {
            Integer key = entry.getKey();
            String value2 = entry.getValue();
        }
    }
}
