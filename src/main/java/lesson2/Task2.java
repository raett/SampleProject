package lesson2;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(c < 0) return;
        while (c % a == 0 ){
            c /=a ;
        }
        while (c % b == 0 ){
            c /= b;
        }
        if (c == 1){
            System.out.println("можно");
        } else {
            System.out.println("не");
        }
    }
}
