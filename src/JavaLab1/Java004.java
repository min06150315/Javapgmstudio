// J004. 좌표 2개를 입력받은 후 좌표간 거리 계산
package JavaLab1;
import java.util.Scanner;

import static java.lang.Math.*;

public class Java004
{
    public static void main(String[] args)
    {
        Java004 pStudio = new Java004();
        pStudio.J004();
    }
    void J004()
    {
        double x1, y1;
        double x2, y2;

        double result;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the first coordinate (x1, y1): ");
        x1 = keyboard.nextDouble();
        y1 = keyboard.nextDouble();

        System.out.print("Enter the second coordinate (x2, y2): ");
        x2 = keyboard.nextDouble();
        y2 = keyboard.nextDouble();

        result = sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));

        System.out.println(result);
    }
}
