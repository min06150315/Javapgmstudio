// J035. 생년월일을 분해해 숫자 만들기
package Practice.JavaLab4;
import java.util.Scanner;
public class Java035
{
    public static void main(String[] args)
    {
        Java035 pStudio = new Java035();
        pStudio.J035();
    }
    public void J035()
    {
        Scanner keyboard = new Scanner(System.in);
        String birthday;
        String year, month, day;
        int sum = 0;

        birthday = keyboard.next();
        year = birthday.substring(0, 4);
        month = birthday.substring(4, 6);
        day = birthday.substring(6, 8);

        for (int i = 0; i < 4; i++)
            sum += Integer.parseInt(year.substring(i, i + 1));

        sum += Integer.parseInt(month) + Integer.parseInt(day);

        System.out.println(sum);
    }
}
