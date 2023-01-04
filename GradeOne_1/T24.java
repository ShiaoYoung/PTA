package GradeOne_1;

import java.util.Scanner;

public class T24 {
    public static void main(String[] args) {
        //输入有若干行，每行有2个数值，分别表示直角三角形的两个直角边长度，用空格分隔。
        Scanner sc = new Scanner(System.in);

        double[][] nums = new double[2][];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 2; j++) {
                nums[count][j] = sc.nextDouble();
            }
            count++;
        }
        int index1 = 0;
        while (true){
            double a = nums[index1][0];
            double b = nums[index1][1];

            double c = Math.sqrt(a*a + b*b);
            if (a == 0 || b == 0){
                break;
            }

            System.out.printf("%4.2f", c);
            System.out.println();
            index1++;
        }
    }
}
