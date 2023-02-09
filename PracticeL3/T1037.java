package PracticeL3;

import java.util.Scanner;

public class T1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String need = sc.next();
        String have = sc.next();

        long left = toKnut(have) - toKnut(need);

        System.out.println(getCurrency(left));
    }

    public static long toKnut(String money){
        StringBuilder Galleon = new StringBuilder();
        int count = 0;
        while (money.charAt(count) != '.'){
            Galleon.append(money.charAt(count));
            count++;
        }

        count++;

        StringBuilder Sickle = new StringBuilder();
        while (money.charAt(count) != '.'){
            Sickle.append(money.charAt(count));
            count++;
        }

        count++;

        StringBuilder Knut = new StringBuilder();
        while (count != money.length()){
            Knut.append(money.charAt(count));
            count++;
        }

        int galleon = Integer.parseInt(Galleon.toString());
        int sickle = Integer.parseInt(Sickle.toString());
        int knut = Integer.parseInt(Knut.toString());

        return (long) galleon * 17 * 29 + sickle * 29L + knut;
    }

    public static String getCurrency(long money){
        int galleon = 0;
        int sickle = 0;
        int knut = 0;
        sickle += money / 29 % 17;
        galleon += money / 29 / 17;
        knut += money - (sickle * 29 + galleon * 17 * 29);


        return galleon + "." + Math.abs(sickle) + "." + Math.abs(knut);
    }
}