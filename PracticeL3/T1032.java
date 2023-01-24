package PracticeL3;

import java.util.Scanner;

public class T1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[][] nums = new int[num][2];
        int max = 1;

        for (int i = 0; i < nums.length; i++) {
            nums[i][0] = sc.nextInt();
            nums[i][1] = sc.nextInt();
            if (max < nums[i][0]){
                max = nums[i][0];
            }
        }

        int[] re = new int[max];
        for (int i = 0; i < nums.length; i++) {
            re[nums[i][0] - 1] += nums[i][1];
        }

        int[] remax = new int[2];
        for (int i = 0; i < max; i++) {
            if (remax[1] < re[i]){
                remax[0] = i + 1;
                remax[1] = re[i];
            }
        }

        System.out.print(remax[0] + " " + remax[1]);
    }
}
