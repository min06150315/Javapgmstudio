// J013. 국,영,수 과목 점수를 입력받아 총점과 평균을 계산하고, 등급 판정
package Practice.week5.JavaLab2;
import java.util.Scanner;
public class Java013
{
    public static void main(String[] args)
    {
        Java013 pStudio = new Java013();
        pStudio.J013();
    }
    void J013()
    {
        int kor, eng, math;
        int total;
        double average;

        Scanner keyboard = new Scanner(System.in);
        
        // 유저에게 국어, 영어, 수학 점수 입력 받기
        System.out.print("Enter the Korean, English and Math score (kor, eng, math): ");
        kor = keyboard.nextInt();
        eng = keyboard.nextInt();
        math = keyboard.nextInt();

        // 점수 총합, 평균 계산하기
        total = kor + eng + math;
        average = (double) total / 3;
        
        // 소수점 1자리 까지 구현
        int all = (int)(average * 10);
        int front = all / 10;
        int end = all % 10;

        // 성적 총합, 평균 출력
        System.out.println(total + " " + front + "." + end);

        // 과목별 Pass or Fail 판정하고 출력하기
        System.out.print("Korean - ");
        if (kor >= 70){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }

        System.out.print("English - ");
        if (kor >= 70){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }

        System.out.print("Math - ");
        if (kor >= 70){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }
}
