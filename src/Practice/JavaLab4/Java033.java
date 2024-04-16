// J033. 학부 영문 이름 중 가장 긴 것과 가장 짧은 것을 찾아라
package Practice.JavaLab4;
import java.util.Arrays;
import java.util.Scanner;
public class Java033
{
    public static void main(String[] args)
    {
        Java033 pStudio = new Java033();
        pStudio.J033();
    }
    public void J033()
    {
        Scanner keyboard = new Scanner(System.in);
        int count;
        String longest, shortest;

        count = keyboard.nextInt();
        keyboard.nextLine();

        String[] name = new String[count];
        int[] len = new int[count];

        for (int i = 0; i < count; i++) {
            name[i] = keyboard.nextLine();
            len[i] = name[i].length();
        }
        Arrays.sort(len);

        longest = name[len[count - 1] - 1];
        shortest = name[len[0] - 1];

        System.out.println("Longest: " + longest);
        System.out.println("Shortest: " + shortest);
    }
}
// Input
/*
13
Global Leadership School
International Studies, Languages and Literature
Management and Economics
Law
Counseling Psychology and Social Welfare
Communication Arts
Spatial Environment System Engineering
Mechanical and Control Engineering
Contents Convergence Design
Life Science
Computer Science and Electrical Engineering
Global Entrepreneurship and ICT
Creative Convergence Education
**/