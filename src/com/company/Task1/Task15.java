package com.company.Task1;


public class Task15 {
    public static void main(String[] args) {
        int i, s = 0, m = 1;
        System.out.print("argumenty komandnoy stroki: ");
        for (i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
            s += Integer.valueOf(args[i]);
            m *= Integer.valueOf(args[i]);
        }
        System.out.println();
        System.out.println("summa argumetov komandnoy stroki = " + s);
        System.out.println("proizvedenie argumetov komandnoy stroki = " + m);

    }

}

