package lesson4.containsExample;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        List<String> setEx = new ArrayList<String>();
        setEx.add("mac");
        setEx.add("mac");
        setEx.add("mac");
        setEx.add("mac");
        setEx.add("mac");
        setEx.add("win");
        setEx.add("mwi");
        setEx.add("mac");
        setEx.add("win");
        Set<String> set = new HashSet<String>(setEx);
        for (String x:set) {
            System.out.println(x);
        }
    }
}
