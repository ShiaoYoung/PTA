package GradeOne_1;

import java.util.Scanner;

public class T13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cm = sc.nextInt();

        double m = (double) cm / 100;
        double temp = m / 0.3048;

        int count = 0;
        while (temp >= 1){
            temp = temp - 1;
            count++;
        }
        int inch = (int) (temp * 12);

        System.out.println(count + " " + inch);
    }
}
