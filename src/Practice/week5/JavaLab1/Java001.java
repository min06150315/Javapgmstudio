// J001. 키와 몸무게로 비만도(BMI) 계산
package Practice.week5.JavaLab1;
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
        
        // 유저에게 입력 받기
        System.out.print("Enter the height and weight (cm, kg): ");
        height = keyboard.nextInt();
        weight = keyboard.nextInt();
        
        // BMI 계산
        bmi = weight / Math.pow(height * 0.01, 2);
        
        // 소수점 구현
        int all = (int)(bmi * 10);
        int front = all / 10;
        int end = all % 10;
        
        // 결과 출력
        System.out.println(front + "." + end);
    }
}
