// J003. 아파트의 제곱미터 수치를 평형으로 바꾸기
package JavaLab1;
import java.util.Scanner;
public class Java003
{
    public static void main(String[] args)
    {
        Java003 pStudio = new Java003();
        pStudio.J003();
    }
    void J003()
    {
        double m2_area;
        double pyung_area;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the area (m2): ");
        m2_area = keyboard.nextDouble();

        pyung_area = m2_area / 3.305;
        System.out.println(pyung_area);
    }
}
