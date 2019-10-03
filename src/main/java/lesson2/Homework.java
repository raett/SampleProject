package lesson2;

import java.util.Scanner;

public class Homework {
    public static int fontains(int[] mas, int k){
        boolean[] masBool = new boolean[mas.length];
        masBool[k] = true;
        for(int a=0;a < mas.length; a++){
            for (int i = 0 ; i < mas.length ;i++){
                if (masBool[i] == true){
                    for (int j = i-mas[i] ;j < mas[i]+i;j++)
                        masBool[j]=true;
                }
            }
        }
        int b=0;
        for (int i = 0 ; i <mas.length ;i++){
            if (masBool[i]==true){
                b+=1;
            }
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] mas = new int[n];
        for (int  i= 0;i < n ; i++){
            mas[i]= (int)((Math.random()*10)%3);

        }

        int num = sc.nextInt();
        fontains(mas,num);
    }
}
