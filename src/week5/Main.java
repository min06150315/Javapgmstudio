package week5;

import java.util.Scanner;

import static java.lang.Math.*;
;

public class Main {
    public static void main(String[] args){
        Main pStudio = new Main();
        Scanner keyboard = new Scanner(System.in);
        int num;

        // User Input
        while (true) {
            System.out.print("Enter the Problem Number: ");
            num = keyboard.nextInt();

            if (num == 1) pStudio.J001();
            else if (num == 2) pStudio.J002();
            else if (num == 3) pStudio.J003();
            else if (num == 4) pStudio.J004();
            else if (num == 5) pStudio.J005();
            else if (num == 11) pStudio.J011();
            else if (num == 12) pStudio.J012();
            else if (num == 13) pStudio.J013();
            else if (num == 14) pStudio.J014();
            else if (num == 15) pStudio.J015();
            else break;
        }
    }
    void J001()
    {
        System.out.println("J001. 키와 몸무게로 비만도(BMI) 계산");
        int height, weight;
        double bmi;

        Scanner keyboard = new Scanner(System.in);

        // 유저에게 입력 받기
        System.out.print("Enter the height and weight (cm, kg): ");
        height = keyboard.nextInt();
        weight = keyboard.nextInt();

        // BMI 계산
        bmi = weight / Math.pow(height * 0.01, 2);

        // 소수점 구현
        int all = (int)(bmi * 10);
        int front = all / 10;
        int end = all % 10;

        // 결과 출력
        System.out.println(front + "." + end);
    }

    void J002()
    {
        System.out.println("J002. 섭씨 온도를 화씨 온도로 변환");
        double c_degree;
        double f_degree;

        Scanner keyboard = new Scanner(System.in);

        // 유저에게 입력 받기
        System.out.print("Enter the Degree (C): ");
        c_degree = keyboard.nextDouble();

        // 화씨 계산
        f_degree = c_degree * 1.8 + 32;

        // 결과 출력
        System.out.println(f_degree);
    }

    void J003()
    {
        System.out.println("J003. 아파트의 제곱미터 수치를 평형으로 바꾸기");
        double m2_area;
        double pyung_area;

        Scanner keyboard = new Scanner(System.in);

        // 유저에게 입력 받기
        System.out.print("Enter the area (m2): ");
        m2_area = keyboard.nextDouble();

        // 평수 계산
        pyung_area = m2_area / 3.305;

        // 소수점 구현
        int all = (int)(pyung_area * 10);
        int front = all / 10;
        int end = all % 10;

        // 결과 출력
        System.out.println(front + "." + end);
    }

    void J004()
    {
        System.out.println("J004. 좌표 2개를 입력받은 후 좌표간 거리 계산");
        double x1, y1;
        double x2, y2;

        Scanner keyboard = new Scanner(System.in);

        // 유저에게 첫번째 좌표 입력 받기
        System.out.print("Enter the first coordinate (x1, y1): ");
        x1 = keyboard.nextDouble();
        y1 = keyboard.nextDouble();

        // 유저에게 두번째 좌표 입력 받기
        System.out.print("Enter the second coordinate (x2, y2): ");
        x2 = keyboard.nextDouble();
        y2 = keyboard.nextDouble();

        // 두 좌표의 거리 계산하기
        double result = sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));

        // 결과 출력
        System.out.println(result);
    }

    void J005()
    {
        System.out.println("J005. 날짜(월, 일)를 입력받아 1년 중 몇번째 날인지 계산");
        int month, day;
        int day_count = 0;

        Scanner keyboard = new Scanner(System.in);

        // 유저에게 날짜 입력 받기
        System.out.print("Enter the date (month, day): ");
        month = keyboard.nextInt();
        day = keyboard.nextInt();

        // 날짜 세기
        if (month == 1){
            day_count = day;
        }else {
            for (int i = 1; i < month; i++){
                if (i == 2){
                    day_count += 28;
                }else if (i == 4 || i == 6 || i == 9 || i == 11){
                    day_count += 30;
                }else {
                    day_count += 31;
                }
            }
            day_count += day;
        }
        // 결과 출력
        System.out.println(day_count);
    }

    void J011()
    {
        System.out.println("J011. 비만 판정하기");
        int height, weight;
        double bmi;

        Scanner keyboard = new Scanner(System.in);

        // 유저에게 키, 몸무게 입력 받기
        System.out.print("Enter the height and weight (cm, kg): ");
        height = keyboard.nextInt();
        weight = keyboard.nextInt();

        // BMI 계산하기
        bmi = weight / Math.pow(height * 0.01, 2);

        // 비만 판정하기
        if (bmi >= 25){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    void J012()
    {
        System.out.println("J012. 아파트 평형 계산 및 종류 판정");
        double m2_area;
        double pyung_area;

        Scanner keyboard = new Scanner(System.in);

        // 유저에게 면적 입력 받기
        System.out.print("Enter the area (m2): ");
        m2_area = keyboard.nextDouble();

        // 평수 계산
        pyung_area = m2_area / 3.305;

        // 소수점 구현
        int all = (int)(pyung_area * 10);
        int front = all / 10;
        int end = all % 10;

        // 결과 출력
        System.out.println(front + "." + end);

        // 아파트 크기 판정하기
        if (pyung_area < 15){
            System.out.println("small");
        }else if (pyung_area < 30){
            System.out.println("normal");
        }else if (pyung_area < 50){
            System.out.println("large");
        }else {
            System.out.println("huge");
        }
    }

    void J013()
    {
        System.out.println("J013. 국,영,수 과목 점수를 입력받아 총점과 평균을 계산하고, 등급 판정");
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

    void J014()
    {
        System.out.println("J014. 연봉을 입력받아 소득세 계산");
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
