package PracticeL3;

import java.util.Scanner;

public class T1031 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for (int i = 0; i < num; i++) {
            String id = sc.next();
            if (checkID(id)){
                count++;
            }else {
                System.out.println(id);
            }
        }

        if (count == num){
            System.out.println("All passed");
        }
    }

    public static boolean checkID(String ID){
        //检查前17位是否为数字
        for (int i = 0; i < 17; i++) {
            if (ID.charAt(i) > '9' || ID.charAt(i) < '0'){
                return false;
            }
        }
        //计算最后一位
        int[] quan = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        int sum = 0;
        for (int i = 0; i < 17; i++) {
            sum += (ID.charAt(i) - 48) * quan[i];
        }

        char M = 'a';
        switch (sum % 11){
            case 0 -> M = '1';
            case 1 -> M = '0';
            case 2 -> M = 'X';
            case 3 -> M = '9';
            case 4 -> M = '8';
            case 5 -> M = '7';
            case 6 -> M = '6';
            case 7 -> M = '5';
            case 8 -> M = '4';
            case 9 -> M = '3';
            case 10 -> M = '2';
        }

        if (M == ID.charAt(17)){
            return true;
        }

        return false;


    }
}
