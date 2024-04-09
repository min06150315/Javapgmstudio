// J002. 섭씨 온도를 화씨 온도로 변환
package Practice.JavaLab1;
import java.util.Scanner;
public class Java002
{
    public static void main(String[] args)
    {
        Java002 pStudio = new Java002();
        pStudio.J002();
    }
    void J002()
    {
        double c_degree;
        double f_degree;

        Scanner keyboard = new Scanner(System.in);
        
        // 유저에게 입력 받기
        System.out.print("Enter the Degree (C): ");
        c_degree = keyboard.nextDouble();
        
        // 화씨 계산
        f_degree = c_degree * 1.8 + 32;
        
        // 결과 출력
        System.out.println(f_degree);
    }
}
