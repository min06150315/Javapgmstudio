// J043. 로또 번호 당첨 확인하기
package Practice.JavaLab5;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Java043 {
    int[] number;
    Scanner keyboard = new Scanner(System.in);
    Random random = new Random();
    public Java043() {
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
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(45) + 1;
            if (!checkNumber(number[i]))
                number[i] *= -1;
        }
    }
    public boolean checkNumber(int num) {
        return num > 0;
    }
    public void remake() {  // 사용자에게 로또 번호 새로 입력받기 (1~45 중 중복된 숫자 입력 불가)
        for (int i = 0; i < number.length; i++) {
            number[i] = keyboard.nextInt();
        }
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
        if (award == 6)
            System.out.println("1등");
        else if (award == 5)
            System.out.println("2등");
        else if (award == 4)
            System.out.println("3등");
        else if (award == 3)
            System.out.println("4등");
        else if (award == 2)
            System.out.println("5등");
        else
            System.out.println("꽝");
    }
    public static void main(String[] args) {
        Java043 PS = new Java043();
        System.out.println(">> 랜덤 생성 로또 번호 >>");
        PS.printNumbers();
        PS.remake();
        System.out.println(">> 유저가 입력하는 로또 번호 >>");
        PS.printNumbers();
        PS.printAwards();
    }
}
