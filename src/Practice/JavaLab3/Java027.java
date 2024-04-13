// J027. 누가 비만인가?
package Practice.JavaLab3;
import java.util.Scanner;
public class Java027
{
    public static void main(String[] args)
    {
        Java027 pStudio = new Java027();
        pStudio.J027();
    }
    public void J027()
    {
        Scanner keyboard = new Scanner(System.in);
        int[] height = new int[10];
        int[] weight = new int[10];
        double[] bmi = new double[10];
        int count = 0;
        int i;

        int num_count = keyboard.nextInt();
        for (i = 0; i < num_count; i++) {
            height[i] = keyboard.nextInt();
            weight[i] = keyboard.nextInt();
            bmi[i] = weight[i] / Math.pow(height[i] * 0.01, 2);
        }

        System.out.print("Overweight person - ");
        for (i = 0; i < num_count; i++) {
            if (bmi[i] >= 25) {
                System.out.print((i + 1) + " ");
                count++;
            }
        }
        System.out.println("\nTotal - " + count);
    }
}
