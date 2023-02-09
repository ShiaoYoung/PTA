package PracticeL3;

import java.util.Scanner;

public class T1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count1 = sc.nextInt();

        int[] scores = new int[count1];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }

        for (int i = 0; i < scores.length; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[i] > scores[j]){
                    int temp = scores[i];
                    scores[i] = scores[j];
                    scores[i] = temp;
                }
            }
        }

        int count2 = sc.nextInt();

        for (int i = 0; i < count2; i++) {
            int count = 0;
            int num = sc.nextInt();
            for (int j = 0; j < scores.length; j++) {
                if (num == scores[j]){
                    count++;
                }
            }
            if (i == count2 - 1){
                System.out.print(count);
            }else {
                System.out.print(count + " ");
            }
        }
    }
}
