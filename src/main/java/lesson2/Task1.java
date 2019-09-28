package lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String chars = in.nextLine();
        if(str.contains(chars)) {
            System.out.println("содержит");
        } else {
            System.out.println("не содержит");
        }
    }

}
