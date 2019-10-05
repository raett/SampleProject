package lesson4.containsExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("mac");
        list.add("mac");
        list.add("mac");
        list.add("mac");
        list.add("mac");
        list.add("win");
        list.add("mwi");
        list.add("mac");
        list.add("win");
        Map<String,Integer> map = new HashMap<String, Integer>();
        for (int i =0; i < list.size(); i++) {
            if (!map.containsKey(list.get(i))){
                int k=1;
                map.put(list.get(i),k);
            } else {
                map.put(list.get(i),map.get(list.get(i))+1);
            }
        }
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
