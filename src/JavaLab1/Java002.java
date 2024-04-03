// J002. 섭씨 온도를 화씨 온도로 변환
package JavaLab1;
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

        System.out.print("Enter the Degree (C): ");
        c_degree = keyboard.nextDouble();

        f_degree = c_degree * 1.8 + 32;
        System.out.println(f_degree);
    }
}
