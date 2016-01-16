package com.company.Task2;


import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        int i;
        String s;
        String str[];
        String sstr[];
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("vvedite n celyh chisel");
        s = sc.nextLine();
        System.out.println();
        str = s.split(" ");
        sstr = s.split(" ");
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
        System.out.print("pervoe chislo s naimenshim kolichestvom razlichnyh cifr: " + '\n');

        int min = imax;
        int minposition = 0;
        for (i = 0; i < str.length; i++) {
            int count = 0;
            for (int j = '0'; j <= '9'; j++) {

                if (str[i].indexOf(j) >= 0)
                    count++;
            }
            if (count < min) {
                min = count;
                minposition = i;
            }

        }
        System.out.println(str[minposition] + "  kolichestvo razlichnih cifr : " + min);
        System.out.println();

        int kount = 0;
        for (i = 0; i < str.length; i++) {
            int k = 0;
            for (int j = 0; j < str[i].length(); j++) {
                if (Character.getNumericValue(str[i].charAt(j)) % 2 == 0)
                    k++;
            }
            if (k == str[i].length())
                kount++;
        }

        System.out.println("kolichestvo chisel soderzhashih tolko chetnye cifry: " + kount);
        System.out.println();

        kount = 0;
        for (i = 0; i < str.length; i++) {
            int k = 0, l = 0;
            for (int j = 0; j < str[i].length(); j++) {
                if (Character.getNumericValue(str[i].charAt(j)) % 2 == 0)
                    k++;
                else if (Character.getNumericValue(str[i].charAt(j)) % 2 != 0)
                    l++;
            }
            if (k == l)
                kount++;
        }

        System.out.println("kolichestvo chisel soderzhashih ravnoe kolichestvo chetnyh i nechetnih cifr: " + kount);
        System.out.println();


        for (i = 0; i < sstr.length; i++) {
            int k = 0;
            if (sstr[i].length() > 1) {
                for (int j = 0; j < sstr[i].length() - 1; j++) {

                    if (Character.getNumericValue(sstr[i].charAt(j + 1)) > Character.getNumericValue(sstr[i].charAt(j)))
                        k++;
                }

                if (k == (sstr[i].length() - 1)) {
                    System.out.println("pervoe chislo soderzhashee cifry v strogom poryadke vozrastaniya: " + sstr[i]);
                    break;
                }
            }
        }
        System.out.println();
        for (i = 0; i < sstr.length; i++) {
            int l = 0;
            for (int j = 0; j < sstr[i].length() - 1; j++) {
                int p = 0;
                for (int k = j + 1; k < sstr[i].length(); k++) {
                    if (sstr[i].charAt(j) != sstr[i].charAt(k))
                        p++;
                }
                if (p == sstr[i].length() - (j + 1))
                    l++;
            }
            if (l == sstr[i].length() - 1) {
                System.out.println("pervoe chislo soderzhashee tolko razlichnye cifry: " + sstr[i]);
                System.out.println();
                break;
            }
        }

        
    }
}




