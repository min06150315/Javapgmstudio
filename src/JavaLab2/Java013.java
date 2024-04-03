// J013. 국,영,수 과목 점수를 입력받아 총점과 평균을 계산하고, 등급 판정
package JavaLab2;
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

        System.out.print("Enter the Korean, English and Math score (kor, eng, math): ");
        kor = keyboard.nextInt();
        eng = keyboard.nextInt();
        math = keyboard.nextInt();

        total = kor + eng + math;
        average = (float)total / 3;

        System.out.println(total + " " + average);

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
