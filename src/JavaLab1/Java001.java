// J001. 키와 몸무게로 비만도(BMI) 계산
package JavaLab1;
import java.util.Scanner;
public class Java001
{
    public static void main(String[] args)
    {
        Java001 pStudio = new Java001();
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

        bmi = weight / Math.pow(height * 0.01, 2);

        System.out.println(bmi);
    }
}
