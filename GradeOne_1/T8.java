package GradeOne_1;

import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {

        //1. 输入在一行中给出2个绝对值不超过1000的整数A和B。
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        //2. 对每一组输入，在一行中输出最大值。
        if (A > B){
            System.out.print(A);
        }else
            System.out.print(B);
    }
}
