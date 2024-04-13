// J022. 아파트 크기별 개수 세기
package Practice.JavaLab3;
import java.util.Scanner;
public class Java022
{
    public static void main(String[] args)
    {
        Java022 pStudio = new Java022();
        pStudio.J022();
    }
    public void J022()
    {
        Scanner keyboard = new Scanner(System.in);
        double[] m2_area = new double[10];
        double[] pyung_area = new double[10];
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        for (int i = 0; i < 10; i++) {
            m2_area[i] = keyboard.nextDouble();
        }
        for (int i = 0; i < 10; i++) {
            pyung_area[i] = m2_area[i] / 3.305;
            if (pyung_area[i] < 15) count1++;
            else if (pyung_area[i] < 30) count2++;
            else if (pyung_area[i] < 50) count3++;
            else count4++;
        }

        System.out.println("small - " + count1);
        System.out.println("normal - " + count2);
        System.out.println("large - " + count3);
        System.out.println("huge - " + count4);
    }
}
