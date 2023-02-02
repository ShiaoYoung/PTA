package PracticeL3;

import java.util.Scanner;

public class T1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String C = sc.next();

        for (int i = 0; i < N; i++) {
            System.out.print(C);
        }

        System.out.println();

        if (N % 2 == 0){
            for (int i = 0; i < N / 2 - 2; i++) {
                System.out.print(C);
                for (int j = 0; j < N - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print(C);
                System.out.println();
            }
        }else {
            for (int i = 0; i < (N + 1) / 2 - 2; i++) {
                System.out.print(C);
                for (int j = 0; j < N - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print(C);
                System.out.println();
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(C);
        }

    }
}
