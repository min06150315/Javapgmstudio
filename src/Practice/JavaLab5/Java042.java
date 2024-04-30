// J042. 로또 번호 입력받기
package Practice.JavaLab5;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Java042 {
    int[] number;
    Random random = new Random();
    public Java042() {
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
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < number.length; i++) {
            number[i] = keyboard.nextInt();
        }
    }
    public static void main(String[] args) {
        Java042 PS = new Java042();
        System.out.println(">> 랜덤 생성 로또 번호 >>");
        PS.printNumbers();
        PS.remake();
        System.out.println(">> 유저가 입력하는 로또 번호 >>");
        PS.printNumbers();
    }
}
