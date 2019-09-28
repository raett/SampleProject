package lesson2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str = myMute(str);

        System.out.println(str);
    }

    public static String myMute(String str) {
        String[] badWords = {"love" , "drugs", "fuck"};
        for (int i=0;i<badWords.length;i++){
            while (str.contains(badWords[i])) {
                int index = str.indexOf(badWords[i]);
                str = str.substring(0, index) + "***" + str.substring(index + badWords[i].length());

            }
        }
        return str;
    }

}
