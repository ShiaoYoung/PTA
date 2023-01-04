package GradeOne_1;

import java.util.Scanner;

public class T23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int male = sc.nextInt();
        int female = sc.nextInt();
        int sum = male + female;

        double mPercent = ((double) male / (double) sum) * 100;
        double fPercent = ((double) female / (double) sum) * 100;

        System.out.printf("%2.2f", mPercent);
        System.out.print("% ");
        System.out.printf("%2.2f", fPercent);
        System.out.print("%");

    }
}
