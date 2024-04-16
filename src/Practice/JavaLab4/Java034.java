// J034. 회원로그인 아이디/비번 검사하기
package Practice.JavaLab4;
import java.util.Scanner;
public class Java034
{
    public static void main(String[] args)
    {
        Java034 pStudio = new Java034();
        pStudio.J034();
    }
    public void J034()
    {
        Scanner keyboard = new Scanner(System.in);
        String[] usernames = {"kim", "lee", "park", "hong", "choi"};
        String[] passwords = {"1111", "1234", "3456", "3535", "7777"};

        String name;
        String PW;

        name = keyboard.next();
        PW = keyboard.next();

        boolean found = false;

        for (int i = 0; i < usernames.length; i++) {
            if (name.equals(usernames[i])) {
                found = true;
                if (PW.equals(passwords[i]))
                    System.out.println("Login OK!");
                else
                    System.out.println("Incorrect password!");
            }
        }
        if (!found)
            System.out.println("No user!");
    }
}
