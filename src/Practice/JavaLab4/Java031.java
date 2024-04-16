// J031. 회원가입 아이디/비번 입력받기
package Practice.JavaLab4;
import java.util.Scanner;
public class Java031
{
    public static void main(String[] args)
    {
        Java031 pStudio = new Java031();
        pStudio.J031();
    }
    public void J031()
    {
        Scanner keyboard = new Scanner(System.in);
        String userid;
        String password;
        String name;

        userid = keyboard.next();
        password = keyboard.next();
        keyboard.nextLine();
        name = keyboard.nextLine();

        int len = password.length();

        StringBuilder newPW = new StringBuilder(password.substring(0, 2));

        for (int i = 2; i < len; i++)
            newPW.append("*");

        if (len < 3) {
            System.out.println("Error! password is too short.");
        } else {
            System.out.println("User id: " + userid);
            System.out.println("Password: " + newPW);
            System.out.println("User Name: " + name);
        }
    }
}
