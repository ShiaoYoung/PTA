package PracticeL3;

import java.util.Scanner;

public class T1004 {
    public static void main(String[] args) {
        //1. 学生个数
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] stus = new Student[n];

        //2. 录入学生信息
        for (int i = 0; i < stus.length; i++) {
            String name = sc.next();
            String id = sc.next();
            int score = sc.nextInt();
            stus[i] = new Student(name,id,score);
        }

        //3. 比较成绩
        Student Higher = stus[0];
        Student Lower = stus[0];
        for (int i = 1; i < stus.length; i++) {
            if (Higher.getScore() < stus[i].getScore()){
                Higher = stus[i];
            }
        }
        for (int i = 1; i < stus.length; i++) {
            if (Lower.getScore() > stus[i].getScore()){
                Lower = stus[i];
            }
        }

        //4. 输出信息
        System.out.println(Higher);
        System.out.println(Lower);

    }
}

class Student{
    private String name;
    private String id;
    private int score;

    public Student(String name, String id, int score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getScore() {
        return score;
    }


    public String toString(){
        return name + " " + id;
    }
}
