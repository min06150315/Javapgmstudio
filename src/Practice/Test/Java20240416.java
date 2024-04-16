package Practice.Test;
import java.util.Scanner;

public class Java20240416
{
    public static void main(String[] args)
    {
        Java20240416 ps = new Java20240416();
        ps.clock();
    }
    void clock()
    {
        Scanner keyboard = new Scanner(System.in);
        // 00 : 00
        int hrs, min;
        int count = 0;
        hrs = keyboard.nextInt();
        min = keyboard.nextInt();

        for (int i = 0; i <= hrs; i++){
            int target = 59;
            if (hrs == i)
                target = min;
            for (int j = 0; j <= target; j++){
                if (i % 10 == 3 || i / 10 == 3 || j % 10 == 3 || j / 10 == 3)
                    count++;
                System.out.println(i + ":" + j);
            }
        }
        System.out.println(count);
    }
}
