// J012. 아파트 평형 계산 및 종류 판정
package JavaLab2;
import java.util.Scanner;
public class Java012
{
    public static void main(String[] args)
    {
        Java012 pStudio = new Java012();
        pStudio.J012();
    }
    void J012()
    {
        double m2_area;
        double pyung_area;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the area (m2): ");
        m2_area = keyboard.nextDouble();

        pyung_area = m2_area / 3.305;
        System.out.println(pyung_area);

        if (pyung_area < 15){
            System.out.println("small");
        }else if (pyung_area < 30){
            System.out.println("normal");
        }else if (pyung_area < 50){
            System.out.println("large");
        }else {
            System.out.println("huge");
        }
    }
}
