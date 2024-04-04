// J004. 좌표 2개를 입력받은 후 좌표간 거리 계산
package Practice.week5.JavaLab1;
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

        Scanner keyboard = new Scanner(System.in);
        
        // 유저에게 첫번째 좌표 입력 받기
        System.out.print("Enter the first coordinate (x1, y1): ");
        x1 = keyboard.nextDouble();
        y1 = keyboard.nextDouble();
        
        // 유저에게 두번째 좌표 입력 받기
        System.out.print("Enter the second coordinate (x2, y2): ");
        x2 = keyboard.nextDouble();
        y2 = keyboard.nextDouble();

        // 두 좌표의 거리 계산하기
        double result = sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));
        
        // 결과 출력
        System.out.println(result);
    }
}
