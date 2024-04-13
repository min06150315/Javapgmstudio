// J029. 겹치지 않는 숫자 10개 입력 받기
package Practice.JavaLab3;
import java.util.Scanner;
public class Java029
{
    public static void main(String[] args)
    {
        Java029 pStudio = new Java029();
        pStudio.J029();
    }
    public void J029()
    {
        Scanner keyboard = new Scanner(System.in);
        int[] number = new int[10];     // 사용자가 입력한 숫자 10개
        int count = 0;      // 현재까지 입력된 숫자의 개수(0~10)

        while (true) {
            int result = 0;
            System.out.print("Enter #" + (count + 1) + " number > ");
            number[count] = keyboard.nextInt();
            
            for (int i = 0; i < count; i++) {   // 숫자가 기존 숫자들과 중복되는지 비교하기
                if (number[count] == number[i]) {
                    System.out.println("Duplicated! Retry.");
                    result = -1;
                }
            }
            if (result == 0)    // 중복이 없을 시 다음 입력 받을 준비 하기
                count++;

            if (count == 10) {      // 10개의 수를 모두 입력 하면 결과 출력
                System.out.print("Numbers -");
                for (int i = 0; i < 10; i++)
                    System.out.print(" " + number[i]);
                System.out.print("\n");
                break;
            }
        }
    }
}
