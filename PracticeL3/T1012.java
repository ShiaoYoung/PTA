package PracticeL3;

import java.util.ArrayList;
import java.util.Scanner;

public class T1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Scanner scanner = new Scanner(line);

        ArrayList<Integer> list = new ArrayList<>();

        while (scanner.hasNextInt()){
            list.add(scanner.nextInt());
        }


        int a1  = 0;
        int a2  = 0;
        int a3  = 0;
        double a4  = 0;
        int a5  = 0;
        boolean flagForA2 = true;
        int sumForA4 = 0;
        int countForA4 = 0;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            switch (num % 5){
                case 0 -> {
                    if (num % 2 == 0){
                        a1 += num;
                    }
                }
                case 1 -> {
                    if (flagForA2){
                        a2 += num;
                        flagForA2 = false;
                    }else {
                        a2 -= num;
                        flagForA2 = true;
                    }
                }
                case 2 -> a3++;
                case 3 -> {
                    sumForA4 += num;
                    countForA4++;
                }
                case 4 -> {
                    if (num > a5){
                        a5 = num;
                    }
                }
            }
        }
        a4 = ((double) sumForA4) / countForA4;

        if (a1 == 0){
            System.out.print("N" + " ");
        }else {
            System.out.print(a1 + " ");
        }

        if (a2 == 0){
            System.out.print("N" + " ");
        }else {
            System.out.print(a2 + " ");
        }

        if (a3 == 0){
            System.out.print("N" + " ");
        }else {
            System.out.print(a3 + " ");
        }

        if (a4 == 0){
            System.out.print("N" + " ");
        }else {
            System.out.printf("%10.1f",a4);
            System.out.print(" ");
        }

        if (a5 == 0){
            System.out.print("N" + " ");
        }else {
            System.out.print(a5);
        }
    }
}
