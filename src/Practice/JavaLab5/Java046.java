// J046. 문자열을 다루는 유틸리티 클래스 제작하기 - 1
package Practice.JavaLab5;
import java.util.Scanner;

public class Java046 {
    String str1, str2;
    public static int whichFirst(String str1, String str2) {
        int num = 0;
        if (str1.compareTo(str2) > 0) {
            num = 2;
        }else if (str1.compareTo(str2) < 0) {
            num = 1;
        }
        return num;
    }
    public void print01() {
        int num;
        num = whichFirst(str1.toLowerCase(), str2.toLowerCase());
        System.out.print(num);
        if (num == 1)
            System.out.println(" " + str1);
        else if (num == 2)
            System.out.println(" " + str2);
    }

    public static void main(String[] args) {
        Java046 PS = new Java046();
        Scanner keyboard = new Scanner(System.in);
        PS.str1 = keyboard.next();
        PS.str2 = keyboard.next();
        PS.print01();
    }
}
