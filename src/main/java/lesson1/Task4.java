package lesson1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(afSumm(0,2,3));

    }
    public static int afSumm(int  numBegin, int step, int n) {
        int summ=0;
        for (int i = 0; i < n; i++) {
            summ+=numBegin;
            numBegin+=step;
        }
        return summ;
    }
}
