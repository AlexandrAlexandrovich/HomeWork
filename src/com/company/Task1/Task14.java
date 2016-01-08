package com.company.Task1;


import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        String s = new String("Parol");
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite parol");
        if (sc.nextLine().equals(s))
            System.out.println("parol prinyat");
        else
            System.out.println("parol ne verniy");


    }
}