// J015. 3개의 수 중 최댓값과 최솟값 구하기
package Practice.JavaLab2;

import java.util.Scanner;

public class Java015
{
    public static void main(String[] args)
    {
        Java015 pStudio = new Java015();
        pStudio.J015();
    }
    void J015()
    {
        int num1, num2, num3;
        int max_num, min_num;

        Scanner keyboard = new Scanner(System.in);

        // 유저에게 3개의 수 입력받기
        System.out.print("Enter the 3 Numbers (num1, num2, num3): ");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        num3 = keyboard.nextInt();

        // 최댓값 판별하기
        max_num = num1;
        if (max_num <= num2) max_num = num2;
        if (max_num <= num3) max_num = num3;

        // 최솟값 판별하기
        min_num = num1;
        if (min_num >= num2) min_num = num2;
        if (min_num >= num3) min_num = num3;

        // 결과 출력
        System.out.println(max_num + " " + min_num);
    }
}
