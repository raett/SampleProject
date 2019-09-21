package lesson1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        System.out.println(isPowerOfTwo(number));

    }
    public static boolean isPowerOfTwo(int value) {
        while (value >= 1) {
            if(value == 1){
                return true;
            }
            if (value % 2 == 1){
               return false;
            }
            value /= 2;
        }
        return false;
    }
}
