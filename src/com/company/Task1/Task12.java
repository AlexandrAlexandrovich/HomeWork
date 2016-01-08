package com.company.Task1;


public class Task12 {
    public static void main(String[] args) {

        int i, l = args.length-1;
        String ar1[] = new String[l+1];

        for (i = l; i >= 0; i--) {
            ar1[(l - i)] = args[i];
            System.out.print(ar1[l - i]+" ");}

    }
}

