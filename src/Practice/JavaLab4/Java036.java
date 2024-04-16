// J036. 희문검사하기
package Practice.JavaLab4;
import java.util.Locale;
import java.util.Scanner;
public class Java036
{
    public static void main(String[] args)
    {
        Java036 pStudio = new Java036();
        pStudio.J036();
    }
    public void J036()
    {
        Scanner keyboard = new Scanner(System.in);
        String str;
        StringBuilder reverse = new StringBuilder();

        str = keyboard.nextLine();
        str = str.toLowerCase();

        // 문자 이외의 공백과 기호 없애기
        str = str.replaceAll("[^a-z0-9 ]", "");
        str = str.replaceAll("\\s+", "");

        int len = str.length();

        for (int i = len - 1; i >= 0; i--)
            reverse.append(str.charAt(i));

        if (str.equalsIgnoreCase(reverse.toString()))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
