package GradeOne_1;

import java.util.Scanner;

public class T26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] height = new int[5];
        double[] angle = new double[height.length];

        for (int i = 0; i < height.length; i++) {
            height[i] = sc.nextInt();
            angle[i] = sc.nextDouble();
        }

        for (int i = 0; i < height.length; i++) {
            double output = ((double) height[i]) / Math.tan(angle[i]);
            System.out.printf("%4.2f",output);
            if (i == height.length - 1){
                break;
            }
            System.out.println();
        }
    }
}
