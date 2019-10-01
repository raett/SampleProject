package lesson2;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        n=3;
//        int[] mas = new int[n];
        boolean[] masBool = new boolean[n];

        int[] mas= new int[]{0, 1, 0};
//        for (int  i= 0;i< n ; i++){
//            mas[i]= (int)((Math.random()*10)%3);
//
//        }
        int a = sc.nextInt();
        masBool[a]=true;
        for (int i = 0 ; i <n ;i++){
            if (masBool[i] == true){
                for (int j = i-mas[i] ;j < mas[i]+i;j++)
                    masBool[j]=true;


                }
        }
        int b=0;
        for (int i = 0 ; i <n ;i++){
            if (masBool[i]==true){
                b+=1;
            }
        }
        System.out.println(b);
    }
}
