// J030. 5명의 점수 채점하고 등급매기기
package Practice.JavaLab3;
import java.util.Scanner;
public class Java030
{
    public static void main(String[] args)
    {
        Java030 pStudio = new Java030();
        pStudio.J030();
    }
    public void J030()
    {
        Scanner keyboard = new Scanner(System.in);
        String[] names = {"James", "David", "Simon", "Peter", "Jason"};
        int[][] sheet = new int[5][10];
        int[] answer = {1, 2, 3, 4, 1, 2, 3, 4, 3, 2};
        int[] grade = new int[5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                sheet[i][j] = keyboard.nextInt();
                if (sheet[i][j] == answer[j])
                    grade[i]++;
            }
        }

        int count1 = 0, count2 = 0, count3 = 0;
        System.out.print("1st : " );
        for (int i = 0; i < 5; i++){
            if (grade[i] >= 9){
                System.out.print(names[i] + " ");
                count1++;
            }
        }
        System.out.println("(" + count1 + ")");

        System.out.print("2nd : " );
        for (int i = 0; i < 5; i++){
            if (grade[i] == 7 || grade[i] == 8){
                System.out.print(names[i] + " ");
                count2++;
            }
        }
        System.out.println("(" + count2 + ")");

        System.out.print("Fail : " );
        for (int i = 0; i < 5; i++){
            if (grade[i] <= 6){
                System.out.print(names[i] + " ");
                count3++;
            }
        }
        System.out.println("(" + count3 + ")");
    }
}
