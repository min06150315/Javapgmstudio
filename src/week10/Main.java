package week10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Main pStudio = new Main();
        int menu;
        System.out.print("Enter the Problem Number: ");
        menu = keyboard.nextInt();
        if (menu == 51) pStudio.J051();
        else if (menu == 52) pStudio.J052();
        else if (menu == 53) pStudio.J053();
        else if (menu == 54) pStudio.J054();
        else if (menu == 55) pStudio.J055();
    }
    // J051. 여러 개의 암호 문자열 만들기
    void J051() {
        Scanner keyboard = new Scanner(System.in);
        MakePW makepw = new MakePW();
        int length, amount;
        System.out.print("Enter the Length and Amount of Password: ");
        length = keyboard.nextInt();
        amount = keyboard.nextInt();
        makepw.make(length, amount);
    }
    // J052. 국영수 점수 분석하기 - 1
    void J052() {
        Score score = new Score(5);
        score.getScore();
        score.printScore();
    }
    // J053. 국영수 점수 분석하기 - 2
    void J053() {
        Scanner keyboard = new Scanner(System.in);
        Score score = new Score(5);
        score.getScore();
        int num;
        System.out.print("점수, 총점, 평균을 알고 싶은 학생의 번로를 입력하세요 (1 ~ 5): ");
        num = keyboard.nextInt();
        score.printScore(num);
    }
    // J054. 국영수 점수 분석하기 - 3
    void J054() {
        Scanner keyboard = new Scanner(System.in);
        Score score = new Score(5);
        score.getScore();
        int num;
        String name;
        num = keyboard.nextInt();
        name = keyboard.next();
        score.printScore(num, name);
    }
    // J055. 비만도 계산기
    void J055() {
        BMICalculator bmi = new BMICalculator();
        bmi.getHW();
        bmi.printBMI();
    }
}
