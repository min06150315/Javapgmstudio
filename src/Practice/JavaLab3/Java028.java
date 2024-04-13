// J028. 5명의 점수 분석하기
package Practice.JavaLab3;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Java028
{
    public static void main(String[] args)
    {
        Java028 pStudio = new Java028();
        pStudio.J028();
    }
    public void J028()
    {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#");
        int[][] jumsu = new int[5][3];  // 5명의 3과목 점수를 저장하고 있는 2차원 배열
        int[] sum_student = new int[5]; // 학생별 총점
        double[] average_student = new double[5];   // 학생별 평균
        char[] grade = new char[5];     // 학생별 등급
        int[] sum_grade = new int[3];   // 과목별 총점
        double[] average_class = new double[3]; // 과목별 평균

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                jumsu[i][j] = keyboard.nextInt();   // 점수 입력 받기
                sum_student[i] += jumsu[i][j];      // 학생별 총합에 더하기
            }
            average_student[i] = (double) sum_student[i] / 3;   // 학생별 평균 구하기
            average_student[i] = Double.parseDouble(df.format(average_student[i])); // 소수점 1자리 까지 반올림
            if (average_student[i] >= 90) grade[i] = 'A';       // 학생별 평균 으로 학생별 등급 판정하기
            else if (average_student[i] >= 80) grade[i] = 'B';
            else if (average_student[i] >= 70) grade[i] = 'C';
            else if (average_student[i] >= 60) grade[i] = 'D';
            else grade[i] = 'F';
        }
        // 과목별 총점, 평균 구하기
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++)
                sum_grade[i] += jumsu[j][i];
            average_class[i] = (double) sum_grade[i] / 5;
            average_class[i] = Double.parseDouble(df.format(average_class[i]));
        }

        // 결과 출력
        System.out.println("Korean - Sum " + sum_grade[0] + ", Average " + average_class[0]);
        System.out.println("English - Sum " + sum_grade[1] + ", Average " + average_class[1]);
        System.out.println("Math - Sum " + sum_grade[2] + ", Average " + average_class[2]);

        for (int i = 0; i < 5; i++)
            System.out.println("#" + (i + 1) + " Student - Sum " + sum_student[i] + ", Average " + average_student[i] + ", Grade " + grade[i]);
    }
}
