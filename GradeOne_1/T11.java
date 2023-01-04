package GradeOne_1;

import java.util.Scanner;

public class T11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String strN = "";

        int len = str.length();

        for (int i = len - 1; i >= 0; i--) {
            strN += str.charAt(i);
        }

        int fin = Integer.parseInt(strN);

        System.out.print(fin);
    }
}
