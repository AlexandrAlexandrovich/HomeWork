package com.company.Task1;


import java.util.Scanner;


public class Task16 {
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

        System.out.print("chetnye chisla: ");
        for (i = 0; i < str.length; i++) {
            if (arr[i] % 2 == 0)
                System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.print("nechetnye chisla: ");
        for (i = 0; i < str.length; i++) {
            if (arr[i] % 2 != 0)
                System.out.print(arr[i] + ", ");
        }

        System.out.println();
        System.out.print("naibolshee i naimenshee chisla: ");
        int max = arr[0];
        int min = arr[0];
        for (i = 0; i < str.length; i++) {
            if (max < arr[i])
                max = arr[i];
            else if (min > arr[i])
                min = arr[i];
        }
        System.out.println(max + ", " + min);

        System.out.print("chisla kotorye delyatsya na 3 ili na 9:  ");
        for (i = 0; i < str.length; i++) {
            if (arr[i] % 3 == 0 || arr[i] % 9 == 0)
                System.out.print(arr[i] + ", ");
        }

        System.out.println();
        System.out.print("chisla kotorye delyatsya na 5 i na 7:  ");
        for (i = 0; i < str.length; i++) {
            if (arr[i] % 5 == 0 && arr[i] % 7 == 0)
                System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.print("trehznachnye chisla kotorye ne soderzhat odinakovyh cifr: ");
        for (i = 0; i < str.length; i++) {
            if (str[i].length() == 3)
                if (str[i].charAt(0) != str[i].charAt(1) && str[i].charAt(0) != str[i].charAt(2) && str[i].charAt(1) != str[i].charAt(2))
                    System.out.print(str[i]+", ");

        }

        System.out.println();
        System.out.print("schastlivye chisla: ");
        for (i = 0; i < str.length; i++) {
            if (str[i].length() % 2 == 0){
                int lsum = 0, rsum = 0;
                for (int k = 0;k < str[i].length()/2;k++){
                    lsum += Character.getNumericValue(str[i].charAt(k));
                    rsum += Character.getNumericValue(str[i].charAt(k+str[i].length()/2));
                }
                if (lsum==rsum)
                    System.out.print(str[i]+", ");

                }
            }
        System.out.println();
        System.out.print("elementy, kotorye ravny polusumme sosednih elementov: ");
        for (i = 1; i < str.length-1; i++){
            if (arr[i]==arr[i-1]+arr[i+1])
                System.out.print(arr[i]+", ");
        }


    }
}