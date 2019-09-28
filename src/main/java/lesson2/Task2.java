package lesson2;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        pr(a,b,c);
    }
    public static boolean pr(int a, int b, int c){


        if (c == 0){
            if (a == 0 || b == 0){
                return true;
            }else {
                return false;
            }
        } else {
            if (a != 0) {
                while (c % a == 0) {

                    c /= a;
                }
            }
            if(b != 0) {
                while (c % b == 0) {
                    c /= b;
                }
            }
            if (c == 1){
                return true;
            } else {
                return false;
            }

        }

    }
}
