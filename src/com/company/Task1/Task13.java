package com.company.Task1;


import java.util.Random;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("vvedite celoe chislo ot 1 do 100");
        n = sc.nextInt();
        if (n > 0 && n <= 100) {

            System.out.println("vyvod " + n +" sluchaynyh chisel s perehodom na novuyu stroku:");
            for (i = 1; i <= n; i++) {
                System.out.println(rand.nextInt() + ",");
            }
            System.out.println();
            System.out.println("vyvod " + n +" sluchaynyh chisel bez perehoda na novuyu stroku:");
            for (i = 1; i <= n; i++) {
                System.out.print(rand.nextInt() + ", ");
            }

        } else System.out.println("neverniy vvod");

    }
}
