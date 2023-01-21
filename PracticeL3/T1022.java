package PracticeL3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T1022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        int D = sc.nextInt();
        System.out.println(Long.toString((A + B), D));
    }
}
