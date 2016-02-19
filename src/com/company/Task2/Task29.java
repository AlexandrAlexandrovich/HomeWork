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
        int[][] ar = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                arr[i][j] = (int) ((Math.random() * 2 * n) - n);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = arr[i][j];

            }
        }

        System.out.println("заполняем случайными числами: ");
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
        int[][] arr1 = new int[n][n];
        System.out.println("циклический сдвиг вправо: ");
        int k;
        do {
            System.out.println("введите количество позиций для сдвига от 1 до " + n);
            k = sc.nextInt();
            if (k > n)
                System.out.println("неверный ввод, повторите");
        }
        while (k > n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j + k) > (n - 1)) {
                    arr1[i][(j + k) - n] = arr[i][j];
                } else
                    arr1[i][j + k] = arr[i][j];
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[i][j] >= 0)
                    System.out.print("[ " + arr1[i][j] + "] ");
                else
                    System.out.print("[" + arr1[i][j] + "] ");
            }
            System.out.println();
        }
        System.out.println("циклический сдвиг влево: ");
        do {
            System.out.println("введите количество позиций для сдвига от 1 до " + n);
            k = sc.nextInt();
            if (k >= n)
                System.out.println("неверный ввод, повторите");
        }
        while (k >= n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j - k) < 0) {
                    arr1[i][(j - k) + n] = arr[i][j];
                } else
                    arr1[i][j - k] = arr[i][j];
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[i][j] >= 0)
                    System.out.print("[ " + arr1[i][j] + "] ");
                else
                    System.out.print("[" + arr1[i][j] + "] ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(" 9.3  Найти наибольшее число возрастающих элементов идущих подряд в матрице: ");
        {
            int f = 0;
            int c = 0;
            int starti = 0;
            int startj = 0;
            int estarti = 0;
            int estartj = 0;
            int gc = 0;


            System.out.println();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (ar[i][j] >= 0)
                        System.out.print("[ " + ar[i][j] + "] ");
                    else
                        System.out.print("[" + ar[i][j] + "] ");
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n - 1; j++) {

                    if (j == 0 && i != 0) {
                        if ((ar[i - 1][n - 1] < ar[i][j]) && f == 1) {
                            c++;
                            f = 1;
                        }
                        if (ar[i - 1][n - 1] < ar[i][j] && f == 0) {
                            c++;
                            f = 1;
                            starti = i;
                            startj = j;
                        }
                        if (ar[i - 1][n - 1] >= ar[i][j] && f == 1) {
                            if (c > gc) {
                                gc = c;
                                estarti = starti;
                                estartj = startj;
                            }
                            f = 0;
                            c = 0;

                        }
                    }
                    if (ar[i][j + 1] > ar[i][j] && f == 0) {
                        c++;
                        f = 1;
                        starti = i;
                        startj = j;
                    }
                    if (ar[i][j + 1] > ar[i][j] && f == 1) {
                        c++;
                        f = 1;
                    }
                    if (ar[i][j + 1] <= ar[i][j] && f == 1) {
                        if (c > gc) {
                            gc = c;
                            estarti = starti;
                            estartj = startj;
                        }
                        f = 0;
                        c = 0;
                    }
                }
            if (gc == 0)
                System.out.println("в матрице нет идущих подряд возрастающих элементов");
            else if (gc != 0) {
                System.out.println("Наибольшее число возрастающих элементов матрицы идущих подряд: " + gc + estarti + estartj);


                int l = 0;
                for (int i = estarti; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (l < gc && i == estarti && j >= estartj) {
                            if (ar[i][j] >= 0)
                                System.out.print("[ " + ar[i][j] + "] ");
                            else
                                System.out.print("[" + ar[i][j] + "] ");
                            l++;
                        }
                        if (l < gc && i != estarti) {
                            if (ar[i][j] >= 0)
                                System.out.print("[ " + ar[i][j] + "] ");
                            else
                                System.out.print("[" + ar[i][j] + "] ");
                            l++;
                        }
                    }
                }
            }
        }


        System.out.println();
        System.out.println();
        System.out.println("9.4. Найти сумму элементов расположенных между первым и вторым положительными элементами каждой строки в матрице:\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (ar[i][j] >= 0)
                    System.out.print("[ " + ar[i][j] + "] ");
                else
                    System.out.print("[" + ar[i][j] + "] ");
            }
            System.out.println();
        }
        System.out.println();
        int startj;
        int endj;
        int f;
        int sum;

        for (int i = 0; i < n; i++) {

            startj = -1;
            endj = 0;
            f = 0;
            sum = 0;


            metka:

            for (int j = 0; j < n; j++) {


                if ((ar[i][j] > 0) & (f == 0) & startj == -1) {

                    f = 1;
                    startj = j;

                    if (j == (n - 1))
                        System.out.println("в " + (i + 1) + "-й строке нет двух положительных элементов либо они идут подряд");
                    continue metka;
                }


                if ((ar[i][j] > 0) & (f == 1)) {

                    f = 0;
                    endj = j;
                    if ((j - startj) == 1) {
                        endj = 0;
                    }
                }

                if (f == 1) {

                    sum += ar[i][j];
                }

                if ((j == (n - 1)) & (endj != 0)) {
                    System.out.println("сумма элементов между первым и вторым положительными элементами " + (i + 1) + "-й строки: " + sum);
                }
                if ((j == (n - 1)) & (endj == 0)) {
                    System.out.println("в " + (i + 1) + "-й строке нет двух положительных элементов либо они идут подряд");
                }
            }
        }
    }
}