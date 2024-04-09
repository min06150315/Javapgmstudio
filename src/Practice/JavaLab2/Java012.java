// J012. 아파트 평형 계산 및 종류 판정
package Practice.JavaLab2;
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
        
        // 유저에게 면적 입력 받기
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

        // 아파트 크기 판정하기
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
