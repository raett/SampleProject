package lesson1;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numberB = sc.nextInt();
        float numberA = sc.nextInt();
        double numberC;
        numberC=Math.sqrt(numberA*numberA+numberB*numberB);
        System.out.println(numberC);

    }



}
