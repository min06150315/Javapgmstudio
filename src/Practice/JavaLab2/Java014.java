// J014. 연봉을 입력받아 소득세 계산
package Practice.JavaLab2;

import java.util.Scanner;

public class Java014
{
    public static void main(String[] args)
    {
        Java014 pStudio = new Java014();
        pStudio.J014();
    }
    void J014()
    {
        int income;
        double tax;

        Scanner keyboard = new Scanner(System.in);

        // 유저에게 연봉 입력 받기
        System.out.print("Enter the Annual Income (Won): ");
        income = keyboard.nextInt();

        // 소득세 계산
        if (income < 10000000) tax = (int)(income * 0.095);
        else if (income < 40000000) tax = (int)(income * 0.19);
        else if (income < 80000000) tax = (int)(income * 0.28);
        else tax = (int)(income * 0.37);

        // 결과 출력
        System.out.println((int)tax);
    }
}
