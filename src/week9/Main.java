package week9;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    static Scanner keyboard = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {
        int num;
        System.out.print("Enter the Problem Number: ");
        num = keyboard.nextInt();

        if (num == 41) {    // J041. 로또 번호 만들기
            Lotto lotto = new Lotto();
            System.out.println(">> 첫 번째 랜덤 생성 로또 번호 >>");
            lotto.printNumbers();
            lotto.remakeAuto();
            System.out.println(">> 두 번째 랜덤 생성 로또 번호 >>");
            lotto.printNumbers();
        } else if (num == 42) {      // J042. 로또 번호 입력받기
            Lotto lotto = new Lotto();
            System.out.println(">> 랜덤 생성 로또 번호 >>");
            lotto.printNumbers();
            lotto.remake();
            System.out.println(">> 유저가 입력한 로또 번호 >>");
            lotto.printNumbers();
        } else if (num == 43) {     // J043. 로또 번호 당첨 확인하기
            Lotto lotto = new Lotto();
            System.out.println(">> 랜덤 생성 로또 번호 >>");
            lotto.printNumbers();
            lotto.remake();
            System.out.println(">> 유저가 입력한 로또 번호 >>");
            lotto.printNumbers();
            lotto.printAwards();
        } else if (num == 44) {
            MakePW makePW = new MakePW();
            System.out.print("Enter the Length of Password : ");
            int len = keyboard.nextInt();
            makePW.make(len);
            makePW.print();
        } else if (num == 45) {
            MakePW makePW = new MakePW();
            System.out.print("Enter the Length1 and Length2 of Password: ");
            int len1 = keyboard.nextInt();
            int len2 = keyboard.nextInt();
            makePW.makeCode(len1, len2);
            makePW.print();
        } else if (num == 46) {
            MyString myString = new MyString();
            myString.str1 = keyboard.next();
            myString.str2 = keyboard.next();
            myString.print();
        }
    }
    static class Lotto {
        int[] number;
        public Lotto() {
            remakeAuto();
        }
        public void printNumbers() {
            Arrays.sort(number);
            for (int i : number)
                System.out.print(i + " ");
            System.out.print("\n");
        }
        public void remakeAuto() {
            number = new int[6];
            for (int i = 0; i < 6; i++) {
                number[i] = random.nextInt(45) + 1;
                if (!checkNumber(number[i]))
                    number[i] *= -1;
            }
        }
        public boolean checkNumber(int num) {
            return num > 0;
        }
        public void remake() {  // 사용자에게 로또 번호 새로 입력받기 (1~45 중 중복된 숫자 입력 불가)
            System.out.print("새로운 로또 번호를 입력하세요: ");
            for (int i = 0; i < number.length; i++)
                number[i] = keyboard.nextInt();
        }
        public int checkLotto(int[] check) {
            int count = 0;
            // 금주의 로또 번호 6개 입력 받고 일치 개수 찾기
            System.out.println(">> 금주의 로또 번호 >>");
            int[] WeekLotto = new int[6];
            for (int i = 0; i < WeekLotto.length; i++) {
                WeekLotto[i] = keyboard.nextInt();
                if (check[i] == WeekLotto[i])
                    count++;
            }
            return count;
        }
        public void printAwards() {
            int award = checkLotto(number);
            System.out.print("당첨 여부: ");
            if (award == 6) System.out.println("1등");
            else if (award == 5) System.out.println("2등");
            else if (award == 4) System.out.println("3등");
            else if (award == 3) System.out.println("4등");
            else if (award == 2) System.out.println("5등");
            else System.out.println("꽝");
        }
    }

    static class MakePW {
        StringBuilder password;

        public MakePW() { // 생성자
            password = new StringBuilder();
        }
        public void make(int length) {  // length 길이를 갖는 암호문자열 출력하기
            int randomNum;
            for (int i = 0; i < length; i++) {
                randomNum = random.nextInt(10);
                password.append(randomNum);
            }
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
    }

    static class MyString {
        String str1, str2;
        public static int whichFirst(String str1, String str2) {
            int num = 0;
            if (str1.compareTo(str2) > 0) {
                num = 2;
            }else if (str1.compareTo(str2) < 0) {
                num = 1;
            }
            return num;
        }
        public void print() {
            int num;
            num = whichFirst(str1.toLowerCase(), str2.toLowerCase());
            System.out.print(num);
            if (num == 1)
                System.out.println(" " + str1);
            else if (num == 2)
                System.out.println(" " + str2);
        }
    }
}
