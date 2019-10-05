package lesson4.containsExample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrintConten {
    public static void main(String[] args) {
        List<Integer> con = new LinkedList<Integer>();
        long start = System.nanoTime();
        for(int i =0; i < 999999;i++) {
            con.add(i+1);
        }
        long finish = System.nanoTime();
        System.out.println("Linked " + (finish-start));
        List<Integer> con1 = new ArrayList<Integer>();
        start = System.nanoTime();
        for(int i =0; i < 999999;i++) {
            con.add(i+1);
        }
        finish = System.nanoTime();
        System.out.println("Array  " + (finish-start));
    }
    public static void printInvers(List<Integer> a) {
        ArrayList<Integer> b = new ArrayList<Integer>();
        for(int i = 0; i< a.size(); i++){
            if (i % 2 == 1){
                b.add(a.get(i)) ;
            }
        }
        for(int i = b.size()-1; i >= 0; i--) {
            System.out.println(b.get(i));
        }
    }
}
