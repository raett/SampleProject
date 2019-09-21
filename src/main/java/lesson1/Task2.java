package lesson1;

import java.util.Scanner;



public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1=sc.nextFloat();
        float n2=sc.nextFloat();
        float n3=sc.nextFloat();
        System.out.println(minFromThree(n1, n2, n3));

    }
    public static float minFromThree(float n1, float n2, float n3){
     float min;
        if (n1 < n2 && n1 < n3){
          min=n1;
        } else {
            if(n2 < n3){
                min = n2;
            } else {
                min = n3;
            }

        }
        return min;
    }

}
