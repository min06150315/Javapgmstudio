// J045. 랜덤 코드 만들기
package Practice.JavaLab5;
import java.util.Random;
import java.util.Scanner;

public class Java045 {
    StringBuilder password;
    Random random = new Random();
    public Java045() { // 생성자
        password = new StringBuilder();
    }
    public void makeCode(int length1, int length2) {        // length1: 알파벳 길이  length2: 숫자 길이
        char PwChar;
        int PwNum;
        int alpha;
        // 랜덤 알파벳 추가
        for (int i = 0; i < length1; i++) {
            alpha = random.nextInt(26);
            PwChar = (char) ('A' + alpha);
            password.append(PwChar);
        }
        password.append("-");
        // 랜덤 숫자 추가
        for (int i = 0; i < length2; i++) {
            PwNum = random.nextInt(10);
            if (i == 0) {
                while (PwNum == 0) {
                    PwNum = random.nextInt(10);
                    if (PwNum != 0)
                        break;
                }
            }
            password.append(PwNum);
        }
    }
    public void print() {
        System.out.println(">> PassWord >> ");
        System.out.println(password);
    }
    public static void main(String[] args) {
        Java045 PS = new Java045();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the Length1 and Length2 of Password: ");
        int len1 = keyboard.nextInt();
        int len2 = keyboard.nextInt();
        PS.makeCode(len1, len2);
        PS.print();
    }

}
