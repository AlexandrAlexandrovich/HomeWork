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
        }
    }

