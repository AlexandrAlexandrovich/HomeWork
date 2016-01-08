package com.company.Task2;


import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        int i;
        String s;
        String str[];
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("vvedite n celyh chisel");
        s = sc.nextLine();
        System.out.println();
        str = s.split(" ");
        arr = new int[str.length + 1];
        for (i = 0; i < str.length; i++)
            arr[i] = Integer.valueOf(str[i]);

        String smax = str[0];
        String smin = str[0];
        int imax = str[0].length();
        int imin = str[0].length();
        for (i = 0; i < str.length; i++) {
            if (imax < str[i].length()) {
                smax = str[i];
                imax = str[i].length();
            } else if (imin > str[i].length()) {
                smin = str[i];
                imin = str[i].length();
            }
        }
        System.out.println("samoe korotkoe chislo: " + smin + ", dlina: " + imin);
        System.out.println("samoe dlinnoe chislo: " + smax + ", dlina: " + imax);
        System.out.println();

        System.out.println("vivod v poryadke vozrastaniya dliny: ");
        for (i = str.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (str[j].length() > str[j + 1].length()) {
                    String tmp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = tmp;
                }
            }
        }
        for (i = 0; i < str.length; i++) {
            System.out.println(str[i] + "  dlina: " + str[i].length());
        }
        System.out.println();
        int sum = 0;
        Float avg;
        for (i = 0; i < str.length; i++) {
            sum += str[i].length();
        }
        avg = (float) sum / str.length;
        System.out.println("srednyaya dlina vvedennyh chisel: " + avg + '\n');
        System.out.println("chisla, dlina kotoryh menshe sredney: ");
        for (i = 0; i < str.length; i++) {
            if (str[i].length() < avg)
                System.out.println(str[i] + "  dlina: " + str[i].length());
        }
        System.out.println();
        System.out.println("chisla, dlina kotoryh bolshe sredney: ");
        for (i = 0; i < str.length; i++) {
            if (str[i].length() > avg)
                System.out.println(str[i] + "  dlina: " + str[i].length());
        }
        System.out.println();
        System.out.println("");


    }
}

