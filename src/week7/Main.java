package week7;
import java.util.Arrays;
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
    public void J033()
    {
        Scanner keyboard = new Scanner(System.in);
        int count;  // 학부 개수
        String longest = "", shortest = "";   // 가장 긴 학부명, 가장 짧은 학부명

        count = keyboard.nextInt();
        keyboard.nextLine();

        String[] name = new String[count];  // 입력받은 학부명
        int[] len = new int[count];

        for (int i = 0; i < count; i++) {
            name[i] = keyboard.nextLine();
            len[i] = name[i].length();
        }
        Arrays.sort(len);

        // 가장 긴 학부명 찾기
        for (int i = 0; i < count; i++) {
            if (name[i].length() == len[count - 1]) {
                longest = name[i];
                break;
            }
        }

        // 가장 짧은 학부명 찾기
        for (int i = 0; i < count; i++) {
            if (name[i].length() == len[0]) {
                shortest = name[i];
                break;
            }
        }

        // 결과 출력
        System.out.println("Longest: " + longest);
        System.out.println("Shortest: " + shortest);
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
