package week5;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main pStudio = new Main();
        pStudio.J001();
    }
    void J001()
    {
        int height, weight;
        double bmi;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the height and weight (cm, kg): ");
        height = keyboard.nextInt();
        weight = keyboard.nextInt();

        bmi = weight / ((height * 0.01) * (height * 0.01));

        System.out.print("bmi: " + bmi);
    }
}
