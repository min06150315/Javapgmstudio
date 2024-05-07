package week10;
import java.util.Scanner;
public class Score {
    int count;
    int[][] jumsu;
    int[] sum_student;
    double[] average_student;
    public Score(int count) {   // 생성자 (파라미터로 학생 인원수 지정, 초기화 진행)
        this.count = count;
        jumsu = new int[count][3];
    }
    public void getScore() {    // 점수 입력 및 총점과 평균 계산
        Scanner keyboard = new Scanner(System.in);
        sum_student = new int[count];
        average_student = new double[count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 3; j++) {
                jumsu[i][j] = keyboard.nextInt();
                sum_student[i] +=  jumsu[i][j];
            }
            average_student[i] = sum_student[i] / 3.0;
        }
    }
    public void printScore() {  // 학생들의 점수 출력
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(jumsu[i][j] + " ");
            }
            System.out.println("총점: " + sum_student[i] + "  평균: " + average_student[i]);
        }
    }
    public void printScore(int num) {   // num 학생의 점수, 총점, 평균 출력
        System.out.println(num + "번 학생의 국영수 점수: " + jumsu[num - 1][0] + " " + jumsu[num - 1][1] + " " + jumsu[num - 1][2]);
        System.out.println(num + "번 학생의 총점: " + sum_student[num - 1]);
        System.out.println(num + "번 학생의 총점: " + average_student[num - 1]);
    }
}
