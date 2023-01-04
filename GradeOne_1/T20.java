package GradeOne_1;

import java.util.Scanner;

public class T20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            sum = sum + num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
