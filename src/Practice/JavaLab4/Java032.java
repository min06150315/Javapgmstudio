// J032. 문자열 거꾸로 출력하기
package Practice.JavaLab4;
import java.util.Scanner;
public class Java032
{
    public static void main(String[] args)
    {
        Java032 pStudio = new Java032();
        pStudio.J032();
    }

    public void J032()
    {
        Scanner keyboard = new Scanner(System.in);
        String str;
        StringBuilder reverse = new StringBuilder();

        str = keyboard.nextLine();

        int len = str.length();
        for (int i = len - 1; i >= 0; i--)
            reverse.append(str.charAt(i));  // reverse += str.charAt(i);

        System.out.println(reverse);
    }
}


