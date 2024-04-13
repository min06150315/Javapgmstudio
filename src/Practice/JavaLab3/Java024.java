// J024. 두번째로 큰 수의 순서 찾기
package Practice.JavaLab3;
import java.util.Arrays;
import java.util.Scanner;
public class Java024
{
    public static void main(String[] args)
    {
        Java024 pStudio = new Java024();
        pStudio.J024();
    }
    public void J024()
    {
        Scanner keyboard = new Scanner(System.in);
        int[] numbers = new int[10];
        int first;
        int second;
        int second_max_index = 0;

        // 10개의 숫자 입력받기
        for (int i = 0; i < 10; i++)
            numbers[i] = keyboard.nextInt();

        // 출력을 위한 배열 복사본 만들어 놓기
        int[] num_temp = numbers.clone();

        // 배열 정렬하기
        Arrays.sort(numbers);

        // 첫 번째, 두 번째로 큰 수 구하기
        first = numbers[9];
        second = numbers[8];

        // 두 번째로 큰 수의 인덱스 구하기
        for (int i = 0; i < 10; i++)
            if (num_temp[i] == second)
                second_max_index = i;

        // 결과 출력하기
        System.out.println("[" + (second_max_index) + "] " + second);
    }
}
