// J005. 날짜(월, 일)를 입력받아 1년 중 몇번째 날인지 계산
package Practice.JavaLab1;
import java.util.Scanner;

public class Java005
{
    public static void main(String[] args)
    {
        Java005 pStudio = new Java005();
        pStudio.J005();
    }
    void J005()
    {
        int month, day;
        int day_count = 0;

        Scanner keyboard = new Scanner(System.in);
        
        // 유저에게 날짜 입력 받기
        System.out.print("Enter the date (month, day): ");
        month = keyboard.nextInt();
        day = keyboard.nextInt();
    
        // 날짜 세기
        if (month == 1){
            day_count = day;
        }else {
            for (int i = 1; i < month; i++){
                if (i == 2){
                    day_count += 28;
                }else if (i == 4 || i == 6 || i == 9 || i == 11){
                    day_count += 30;
                }else {
                    day_count += 31;
                }
            }
            day_count += day;
        }
        // 결과 출력
        System.out.println(day_count);
    }
}
