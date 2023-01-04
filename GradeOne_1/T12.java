package GradeOne_1;

import java.util.Scanner;

public class T12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] timeBox = new int[4];

        for (int i = 0; i < timeBox.length; i++) {
            timeBox[i] = sc.nextInt();
        }

        int hourDif;
        int secondDif;
        
        if ((timeBox[0] >= timeBox[2] && timeBox[1] >= timeBox[3])
                || (timeBox[0] <= timeBox[2] && timeBox[1] <= timeBox[3])){
            hourDif = Math.abs((timeBox[0] - timeBox[2]));
            secondDif = Math.abs((timeBox[1] - timeBox[3]));
        } else{
            int hourDifL = Math.abs((timeBox[0] - timeBox[2]));
            int secondDifL = Math.abs((timeBox[1] - timeBox[3]));
            hourDif = hourDifL - 1;
            secondDif = 60 - secondDifL;
        }

        System.out.println(hourDif + " " + secondDif);
    }
}
