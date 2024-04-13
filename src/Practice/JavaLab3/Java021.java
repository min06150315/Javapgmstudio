// J021. 비만인 사람은 몇 명인가?
package Practice.JavaLab3;
import java.util.Scanner;
public class Java021
{
    public static void main(String[] args)
    {
        Java021 pStudio = new Java021();
        pStudio.J021();
    }
    public void J021()
    {
        int people = 0;
        Scanner keyboard = new Scanner(System.in);

        int count = keyboard.nextInt();
        int[] height = new int[count];
        int[] weight = new int[count];
        double[] bmi = new double[count];

        for (int i = 0; i < count; i++){
            height[i] = keyboard.nextInt();
            weight[i] = keyboard.nextInt();
            bmi[i] = weight[i] / Math.pow(height[i] * 0.01, 2);
            if (bmi[i] >= 25)
                people++;
        }
        System.out.println(people);
    }
}
