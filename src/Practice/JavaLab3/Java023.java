// J023. 입력 받은 숫자들의 총합계와 평균 값 구하기
package Practice.JavaLab3;
import java.util.Scanner;
public class Java023
{
    public static void main(String[] args)
    {
        Java023 pStudio = new Java023();
        pStudio.J023();
    }

    public void J023()
    {
        Scanner keyboard = new Scanner(System.in);
        int count;
        int totalsum = 0;
        double average;

        System.out.print("Enter the count of number: ");
        count = keyboard.nextInt();
        int[] number = new int[count];

        System.out.print("Enter the " + count + " numbers: ");
        for (int i = 0; i < count; i++){
            number[i] = keyboard.nextInt();
            totalsum += number[i];
        }

        average = (double) totalsum / count;
        System.out.print(totalsum + " " + average);
    }
}
