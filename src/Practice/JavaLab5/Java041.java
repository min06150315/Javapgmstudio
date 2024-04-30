// J041. 로또 번호 만들기
package Practice.JavaLab5;
import java.util.Arrays;
import java.util.Random;
public class Java041 {
    int[] number;
    Random random = new Random();
    public Java041() {
        remakeAuto();
    }
    public void printNumbers() {
        Arrays.sort(number);
        /*
        for (int i = 0; i < number.length; i++)
            System.out.print(number[i] + " ");
         */
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
    public static void main(String[] args) {
        Java041 PS = new Java041();
        System.out.println(">> 첫 번째 랜덤 생성 로또 번호 >>");
        PS.printNumbers();
        PS.remakeAuto();
        System.out.println(">> 두 번째 랜덤 생성 로또 번호 >>");
        PS.printNumbers();
    }
}
