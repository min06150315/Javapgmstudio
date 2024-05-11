package week10;
import java.util.Scanner;
public class Score {
    int count;
    int[][] jumsu;
    int[] sum_student;
    double[] average_student;
    int[] sum_class;
    double[] average_class;
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
                sum_student[i] += jumsu[i][j];
            }
            average_student[i] = sum_student[i] / 3.0;
        }
    }
    public void printScore() {  // 학생들의 점수 출력
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(jumsu[i][j] + " ");
            System.out.print("총점: " + sum_student[i] + "  평균: ");
            // 평균 소수점 1자리까지 출력하기
            int all = (int)(average_student[i] * 10);
            int front = all / 10;
            int end = all % 10;
            System.out.println(front + "." + end);
        }
    }
    public void printScore(int num) {   // num 학생의 점수, 총점, 평균 출력
        System.out.println(num + "번 학생의 국영수 점수: " + jumsu[num - 1][0] + " " + jumsu[num - 1][1] + " " + jumsu[num - 1][2]);
        System.out.println(num + "번 학생의 총점: " + sum_student[num - 1]);
        System.out.print(num + "번 학생의 평균: ");
        int all = (int)(average_student[num - 1] * 10);
        int front = all / 10;
        int end = all % 10;
        System.out.println(front + "." + end);
    }
    public void printScore(int num, String classname) { // num 과목의 총점, 평균 출력
        sum_class = new int[3];
        average_class = new double[3];
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 5; j++)
                sum_class[i] += jumsu[j][i];
            average_class[i] = sum_class[i] / 5.0;
        }
        if (num == 1) { // 1을 입력시 국어 점수를 출력
            System.out.println(classname + "과목의 총점: " + sum_class[0]);
            System.out.println(classname + "과목의 평균: " + average_class[0]);
        }else if (num == 2) {   // num에 2를 입력시 영어 점수를 출력
            System.out.println(classname + "과목의 총점: " + sum_class[1]);
            System.out.println(classname + "과목의 평균: " + average_class[1]);
        }else if (num == 3) {   // num에 3를 입력시 수학 점수를 출력
            System.out.println(classname + "과목의 총점: " + sum_class[2]);
            System.out.println(classname + "과목의 평균: " + average_class[2]);
        }
    }
}