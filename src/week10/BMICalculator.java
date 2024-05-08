package week10;
import java.util.Scanner;
public class BMICalculator {
    int height, weight; // 신장(cm), 체중(kg)
    double bmi; // 비만도
    int level;  // 비만도 등급 (1~4)
    String name;    // 이름
    public BMICalculator() {    // 생성자
        height = 0;
        weight = 0;
        bmi = 0;
        level = 1;
        name = "";
    }
    public void getHW() {   // 이름, 신장, 체중을 입력받아 비만도와 비만등급을 계산한다.
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        name = keyboard.nextLine();
        System.out.print("Enter the height and weight (cm, kg): ");
        height = keyboard.nextInt();
        weight = keyboard.nextInt();

        bmi = weight / Math.pow(height * 0.01, 2);

        if (bmi < 18.5) level = 1;
        else if (bmi < 25) level = 2;
        else if (bmi < 30) level = 3;
        else level = 4;
    }
    public void printBMI() {    // 이 사람의 이름, 신장, 체중, 비만도, 비만등급을 출력한다.
        System.out.println("Name: " + name);
        System.out.println(height + "cm " + weight + "kg");
        System.out.println("BMI: " + bmi);
        System.out.print("Bmi Level: ");

        if (level == 1)
            System.out.println("Underweight");
        else if (level == 2)
            System.out.println("Healthy Weight");
        else if (level == 3)
            System.out.println("OverWeight");
        else if (level == 4)
            System.out.println("Obesity");
    }
}
