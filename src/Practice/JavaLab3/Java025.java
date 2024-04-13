// J025. 배열을 이용해 연중 날짜 계산하기
package Practice.JavaLab3;
import java.util.Scanner;
public class Java025
{
    public static void main(String[] args)
    {
        Java025 pStudio = new Java025();
        pStudio.J025();
    }

    public void J025()
    {
        Scanner keyboard = new Scanner(System.in);
        int[] monthdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month, day;
        int day_count = 0;

        month = keyboard.nextInt();
        day = keyboard.nextInt();

        // 오류 판정
        int result = 0;
        if (month < 1 || month > 12) {
            System.out.println("Wrong date!");
            result = -1;
        }else if (month == 2 && day > 28){
            System.out.println("Wrong date!");
            result = -1;
        }else if (day > monthdays[month - 1]){
            System.out.println("Wrong date!");
            result = -1;
        }

        // 연중 날짜 계산하고 출력하기
        if (result == 0) {
            for (int i = 0; i < month - 1; i++)
                day_count += monthdays[i];
            day_count += day;
            System.out.println(day_count);
        }
    }
}
