package GradeOne_1;

import java.util.Scanner;

public class T21 {
    public static void main(String[] args) {
        //1.在一行中给出3个正整数，分别是m，s，d。m分钟s秒内跑了d公里
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();

        //2. 1英里等于1.6公里,显示以每小时多少英里为单位的平均速度值,保留小数点后2位。
        int timeSec = m * 60 + s;
        System.out.printf("%4.2f",(((double) d) / 1.6) / (((double) timeSec) / 3600));
        System.out.println();
    }
}
