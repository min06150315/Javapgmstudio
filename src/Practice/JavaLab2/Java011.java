// J011. 비만 판정하기
package Practice.JavaLab2;
import java.util.Scanner;
public class Java011
{
    public static void main(String[] args)
    {
        Java011 pStudio = new Java011();
        pStudio.J011();
    }
    void J011()
    {
        int height, weight;
        double bmi;

        Scanner keyboard = new Scanner(System.in);
        
        // 유저에게 키, 몸무게 입력 받기
        System.out.print("Enter the height and weight (cm, kg): ");
        height = keyboard.nextInt();
        weight = keyboard.nextInt();
        
        // BMI 계산하기
        bmi = weight / Math.pow(height * 0.01, 2);
        
        // 비만 판정하기
        if (bmi >= 25){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
