// J026. 입력 받은 숫자들 중에서 가장 큰 수와 가장 작은 수 구하기
package Practice.JavaLab3;
import java.util.Arrays;
import java.util.Scanner;
public class Java026
{
    public static void main(String[] args)
    {
        Java026 pStudio = new Java026();
        pStudio.J026();
    }
    public void J026()
    {
        Scanner keyboard = new Scanner(System.in);
        int num;
        int max_num, min_num;

        num = keyboard.nextInt();
        int[] number = new int[num];

        for (int i = 0; i < num; i++)
            number[i] = keyboard.nextInt();

        Arrays.sort(number);
        max_num = number[num - 1];
        min_num = number[0];

        System.out.println("Biggest " + max_num);
        System.out.println("Smallest " + min_num);
    }
}
