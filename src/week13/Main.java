// Java Lab#9 - File I/O
package week13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        Scanner keyboard = new Scanner(System.in);

        // 원하는 문제 번호 입력받아서 보여주기
        int num;
        while (true) {
            System.out.print("Enter the Problem Number: ");
            num = keyboard.nextInt();

            if (num == 81) pStudio.J081();
            else if (num == 82) pStudio.J082();
            else if (num == 83) pStudio.J083();
            else if (num == 84) pStudio.J084();
            else if (num == 85) pStudio.J085();
            else break;
        }
    }
    void J081() {
        // J081. 최댓값과 최솟값 구하기 (파일 버전)


    }
    void J082() {
        // J082. 비만인 사람 비율 알아내기 (파일 버전)


    }
    void J083() {
        // J083. 국영수 점수 분석하기 (파일 버전)


    }
    void J084() {
        // J084. 학부 영문이름 중 가장 긴 이름 찾기


    }
    void J085() {
        // J085. 텍스트 파일 내의 알파벳(대소문자열)의 개수와 빈칸의 개수 구하기


    }
}
