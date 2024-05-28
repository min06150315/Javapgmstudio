// Java Lab#9 - File I/O
package week13;

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        Scanner keyboard = new Scanner(System.in);

        // 원하는 문제 번호 입력받아서 보여주기
        int num;
        System.out.print("\nEnter the Problem Number: ");
        num = keyboard.nextInt();

        if (num == 81) pStudio.J081();
        else if (num == 82) pStudio.J082();
        else if (num == 83) pStudio.J083();
        else if (num == 84) pStudio.J084();
        else if (num == 85) pStudio.J085();
    }
    void J081() {
        // J081. 최댓값과 최솟값 구하기 (파일 버전)
        String filename = "./src/week13/TextFiles/data081_1.txt";
        //String filename = "./src/week13/TextFiles/data081_2.txt";
        Scanner inputStream = null;
        int[] numbers = new int[10];
        int count = 0;
        try {
            inputStream = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the file " + filename);
            System.exit(0);
        }
        while (inputStream.hasNextInt()) {
            int num = inputStream.nextInt();
            numbers[count++] = num;
        }
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];
            if (numbers[i] > max)
                max = numbers[i];
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
    void J082() {
        // J082. 비만인 사람 비율 알아내기 (파일 버전)
        String filename = "./src/week13/TextFiles/data082_1.txt";
        //String filename = "./src/week13/TextFiles/data082_2.txt";
        Scanner inputStream = null;
        int[] height = new int[5];
        int[] weigth = new int[5];
        double[] bmi = new double[5];
        int count = 0;
        int countBMI = 0;
        try {
            inputStream = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the file " + filename);
            System.exit(0);
        }
        while (inputStream.hasNextInt()) {
            int num1 = inputStream.nextInt();
            height[count] = num1;
            int num2 = inputStream.nextInt();
            weigth[count] = num2;
            count++;
        }
        for (int i = 0; i < height.length; i++) {
            bmi[i] = weigth[i] / Math.pow(height[i] * 0.01, 2);
            if (bmi[i] >= 25)
                countBMI++;
        }

        double rate = (double) countBMI / height.length * 100;
        System.out.println("All " + height.length + " persons.");
        System.out.println("Total overweight persons: " + countBMI + " (" + rate + "%)");
    }
    void J083() {
        // J083. 국영수 점수 분석하기 (파일 버전)
        ScoreManager manager = new ScoreManager();
        //String filename = "./src/week13/TextFiles/data083_1.txt";
        String filename = "./src/week13/TextFiles/data083_2.txt";
        Scanner inputStream = null;
        try {
            inputStream = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the file " + filename);
            System.exit(0);
        }
        while (inputStream.hasNext()) {
            String name = inputStream.next();
            int kor = inputStream.nextInt();
            int eng = inputStream.nextInt();
            int math = inputStream.nextInt();

            Score new_score = new Score(name, kor, eng, math);
            manager.addList(new_score);
        }
        System.out.println("각 과목별 총점과 평균 점수를 출력");
        manager.printClasses();

        System.out.println("\n각 학생별 총점과 평균 점수를 출력");
        manager.printStudents();

        System.out.println("\n가장 높은 평균 점수를 받은 학생의 이름과 점수 출력");
        manager.printHighest();
    }
    void J084() {
        // J084. 학부 영문이름 중 가장 긴 이름 찾기
        //String filename = "./src/week13/TextFiles/data084_1.txt";
        String filename = "./src/week13/TextFiles/data084_2.txt";
        Scanner inputStream = null;
        String[] majors = new String[13];
        int count = 0;
        try {
            inputStream = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the file " + filename);
            System.exit(0);
        }
        while (inputStream.hasNextLine()) {
            String name = inputStream.nextLine();
            majors[count] = name;
            count++;
        }

        System.out.println("Count : " + count);

        int maxLength = majors[0].length();
        int minLength = majors[0].length();

        for (int i = 1; i < count; i++) {
            int length = majors[i].length();
            if (length > maxLength)
                maxLength = length;
            if (length < minLength)
                minLength = length;
        }

        System.out.print("Longset name : ");
        for (int i = 0; i < count; i++) {
            if (majors[i].length() == maxLength)
                System.out.print(majors[i] + " ");
        }
        System.out.print("\nShortest name : ");
        for (int i = 0; i < count; i++) {
            if (majors[i].length() == minLength)
                System.out.print(majors[i] + " ");
        }
    }
    void J085() {
        // J085. 텍스트 파일 내의 알파벳(대소문자열)의 개수와 빈칸의 개수 구하기
        //String filename = "./src/week13/TextFiles/data085_1.txt";
        String filename = "./src/week13/TextFiles/data085_2.txt";
        Scanner inputStream = null;
        int lowerCount = 0, upperCount = 0, spaceCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int c;
            while ((c = reader.read()) != -1) {
                char ch = (char) c;
                if (Character.isLowerCase(ch)) {
                    lowerCount++;
                } else if (Character.isUpperCase(ch)) {
                    upperCount++;
                } else if (ch == ' ') {
                    spaceCount++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error opening the file " + filename);
            System.exit(0);
        }

        System.out.println("A~Z - " + upperCount);
        System.out.println("a~z - " + lowerCount);
        System.out.println("spaces - " + spaceCount);
    }
}
