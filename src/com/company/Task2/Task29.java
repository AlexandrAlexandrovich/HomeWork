package com.company.Task2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Task29 {
    public static void main(String[] args) {
        System.out.println("введите размерность матрицы: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                arr[i][j] = (int) ((Math.random() * 2 * n) - n);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] >= 0)
                    System.out.print("[ " + arr[i][j] + "] ");
                else
                    System.out.print("[" + arr[i][j] + "] ");
            }
            System.out.println();
        }

        System.out.println("сортировка строк: ");
        for (int k = 0; k < n; k++) {
            for (int i = n - 1; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (arr[k][j] > arr[k][j + 1]) {
                        int tmp = arr[k][j];
                        arr[k][j] = arr[k][j + 1];
                        arr[k][j + 1] = tmp;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] >= 0)
                    System.out.print("[ " + arr[i][j] + "] ");
                else
                    System.out.print("[" + arr[i][j] + "] ");
            }
            System.out.println();
        }

        System.out.println("сортировка столбцов: ");
        for (int k = 0; k < n; k++) {
            for (int i = n - 1; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (arr[j][k] > arr[j + 1][k]) {
                        int tmp = arr[j][k];
                        arr[j][k] = arr[j + 1][k];
                        arr[j + 1][k] = tmp;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] >= 0)
                    System.out.print("[ " + arr[i][j] + "] ");
                else
                    System.out.print("[" + arr[i][j] + "] ");
            }
            System.out.println();
        }
    }
}