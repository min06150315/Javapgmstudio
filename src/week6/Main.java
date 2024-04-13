package week6;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Main pStudio = new Main();
        Scanner keyboard = new Scanner(System.in);

        // 원하는 문제 번호 입력받아서 보여주기
        int num;
        while (true) {
            System.out.print("Enter the Problem Number: ");
            num = keyboard.nextInt();

            if (num == 21) pStudio.J021();
            else if (num == 22) pStudio.J022();
            else if (num == 23) pStudio.J023();
            else if (num == 24) pStudio.J024();
            else if (num == 25) pStudio.J025();
            else if (num == 26) pStudio.J026();
            else if (num == 27) pStudio.J027();
            else if (num == 28) pStudio.J028();
            else if (num == 29) pStudio.J029();
            else if (num == 30) pStudio.J030();
            else break;
        }
    }
    public void J021()
    {
        System.out.println("J021. 비만인 사람은 몇 명인가?");
        int people = 0;
        Scanner keyboard = new Scanner(System.in);

        int count = keyboard.nextInt();
        int[] height = new int[count];
        int[] weight = new int[count];
        double[] bmi = new double[count];

        for (int i = 0; i < count; i++){
            height[i] = keyboard.nextInt();
            weight[i] = keyboard.nextInt();
            bmi[i] = weight[i] / Math.pow(height[i] * 0.01, 2);
            if (bmi[i] >= 25)
                people++;
        }
        System.out.println(people);
    }
    public void J022()
    {
        System.out.println("J022. 아파트 크기별 개수 세기?");
        Scanner keyboard = new Scanner(System.in);
        double[] m2_area = new double[10];
        double[] pyung_area = new double[10];
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        for (int i = 0; i < 10; i++) {
            m2_area[i] = keyboard.nextDouble();
        }
        for (int i = 0; i < 10; i++) {
            pyung_area[i] = m2_area[i] / 3.305;
            if (pyung_area[i] < 15) count1++;
            else if (pyung_area[i] < 30) count2++;
            else if (pyung_area[i] < 50) count3++;
            else count4++;
        }

        System.out.println("small - " + count1);
        System.out.println("normal - " + count2);
        System.out.println("large - " + count3);
        System.out.println("huge - " + count4);
    }
    public void J023()
    {
        System.out.println("J023. 입력 받은 숫자들의 총합계와 평균 값 구하기");
        Scanner keyboard = new Scanner(System.in);
        int count;
        int totalSum = 0;
        double average;

        count = keyboard.nextInt();
        int[] number = new int[count];

        for (int i = 0; i < count; i++){
            number[i] = keyboard.nextInt();
            totalSum += number[i];
        }

        average = (double) totalSum / count;
        System.out.println(totalSum + " " + average);
    }
    public void J024()
    {
        System.out.println("J024. 두번째로 큰 수의 순서 찾기");
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
        System.out.println("[" + (second_max_index + 1) + "] " + second);
    }
    public void J025()
    {
        System.out.println("J025. 배열을 이용해 연중 날짜 계산하기");
        Scanner keyboard = new Scanner(System.in);
        int[] monthdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month, day;
        int day_count = 0;

        month = keyboard.nextInt();
        day = keyboard.nextInt();

        // 오류 판정
        int result = 0;
        if (month < 1 || month > 12) {
            System.out.println("Wrong date!");
            result = -1;
        }else if (month == 2 && day > 28){
            System.out.println("Wrong date!");
            result = -1;
        }else if (day > monthdays[month - 1]){
            System.out.println("Wrong date!");
            result = -1;
        }

        // 연중 날짜 계산하고 출력하기
        if (result == 0) {
            for (int i = 0; i < month - 1; i++)
                day_count += monthdays[i];
            day_count += day;
            System.out.println(day_count);
        }
    }
    public void J026()
    {
        System.out.println("// J026. 입력 받은 숫자들 중에서 가장 큰 수와 가장 작은 수 구하기");
        Scanner keyboard = new Scanner(System.in);
        int num;
        int max_num, min_num;

        num = keyboard.nextInt();
        int[] number = new int[num];

        for (int i = 0; i < num; i++)
            number[i] = keyboard.nextInt();

        Arrays.sort(number);
        max_num = number[num - 1];
        min_num = number[0];

        System.out.println("가장 큰 수 " + max_num);
        System.out.println("가장 작은 수 " + min_num);
    }
    public void J027()
    {
        System.out.println("J027. 누가 비만인가?");
        Scanner keyboard = new Scanner(System.in);
        int[] height = new int[10];
        int[] weight = new int[10];
        double[] bmi = new double[10];
        int count = 0;
        int i;

        int num_count = keyboard.nextInt();
        for (i = 0; i < num_count; i++) {
            height[i] = keyboard.nextInt();
            weight[i] = keyboard.nextInt();
            bmi[i] = weight[i] / Math.pow(height[i] * 0.01, 2);
        }

        System.out.print("Overweight person - ");
        for (i = 0; i < num_count; i++) {
            if (bmi[i] >= 25) {
                System.out.print((i + 1) + " ");
                count++;
            }
        }
        System.out.println("\nTotal - " + count);
    }
    public void J028()
    {
        System.out.println("J028. 5명의 점수 분석하기");
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
    public void J029()
    {
        System.out.println("J029. 겹치지 않는 숫자 10개 입력 받기");
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
    public void J030()
    {
        System.out.println("J030. 5명의 점수 채점하고 등급매기기");
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
