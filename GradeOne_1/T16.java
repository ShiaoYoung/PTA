package GradeOne_1;

import java.util.Scanner;

public class T16 {
    public static void main(String[] args) {
        //编写程序，读取用户输入的代表总金额的double值，打印表示该金额所需的最少纸币张数和硬币个数，打印从最大金额开始。纸币的种类有十元、五元、一元，硬币的种类有五角、一角、贰分、壹分。
         //1.输入的代表总金额的double值
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        int temp = (int) (X * 100);

        //2.纸币的种类有十元、五元、一元，硬币的种类有五角、一角、贰分、壹分。
        int shiy = 0;
        int wuy = 0;
        int yiy = 0;
        int wuj = 0;
        int yij = 0;
        int erf = 0;
        int yif = 0;

        if (X >= 10){
            shiy = (int) (X / 10);
        }

        if (X - 10 * shiy >= 5){
            wuy = 1;
        }

        if (X - 10 * shiy - 5 * wuy >= 1){
            yiy = (int) (X - 10 * shiy - 5 * wuy);
        }

        temp = temp - shiy * 1000 - (wuy * 5 + yiy) * 100;

        if (temp / 10 > 5){
            wuj = 1;
        }

        if (temp - wuj * 50 > 10){
            yij = (temp - wuj * 50) / 10;
        }

        if (temp - wuj * 50 - yij * 10 > 0){
            erf = (temp - wuj * 50 - yij * 10) / 2;
            if ((temp - wuj * 50 - yij * 10) % 2 == 1)
                yif = 1;
        }

        System.out.println(shiy + " 张十元");
        System.out.println(wuy + " 张五元");
        System.out.println(yiy + " 张一元");
        System.out.println(wuj + " 个五角");
        System.out.println(yij + " 个一角");
        System.out.println(erf + " 个贰分");
        System.out.print(yif + " 个壹分");

    }
}
