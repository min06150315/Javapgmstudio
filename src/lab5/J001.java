package lab5;

import java.util.Scanner;
public class J001 {
    public static void main(String[] args)
    {
        int height, weight;
        double bmi;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the height and weight (cm, kg): ");
        height = keyboard.nextInt();
        weight = keyboard.nextInt();

        bmi = weight / ((height * 0.01) * (height * 0.01));

        System.out.print(bmi);
    }
}
