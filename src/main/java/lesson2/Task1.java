package lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String chars = in.nextLine();
        while (str.contains(chars)) {
            int index = str.indexOf(chars);
            str = str.substring(0, index) + "***" + str.substring(index + chars.length());

        }

        System.out.println(str);
    }

}
