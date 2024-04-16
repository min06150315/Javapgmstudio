package week7;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Main pStudio = new Main();
        Scanner keyboard = new Scanner(System.in);

        // 원하는 문제 번호 입력받아서 보여주기
        int num;
        while (true) {
            System.out.print("Enter the Problem Number: ");
            num = keyboard.nextInt();

            if (num == 31) pStudio.J031();
            else if (num == 32) pStudio.J032();
            else if (num == 33) pStudio.J033();
            else if (num == 34) pStudio.J034();
            else if (num == 35) pStudio.J035();
            else if (num == 36) pStudio.J036();
            else if (num == 37) pStudio.J037();
            else break;
        }
    }
    public void J031()
    {

    }
    public void J032()
    {

    }
    public void J033()
    {

    }
    public void J034()
    {

    }
    public void J035()
    {

    }
    public void J036()
    {

    }
    public void J037()
    {

    }

}
