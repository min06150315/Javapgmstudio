// J003. 아파트의 제곱미터 수치를 평형으로 바꾸기
package Practice.JavaLab1;
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

        // 유저에게 입력 받기
        System.out.print("Enter the area (m2): ");
        m2_area = keyboard.nextDouble();

        // 평수 계산
        pyung_area = m2_area / 3.305;

        // 소수점 구현
        int all = (int)(pyung_area * 10);
        int front = all / 10;
        int end = all % 10;

        // 결과 출력
        System.out.println(front + "." + end);
    }
}
