package week10;
import java.util.Random;

public class MakePW {
    StringBuilder password;
    Random random = new Random();
    public MakePW() { // 생성자
        password = new StringBuilder();
    }
    public void make(int length) {  // length 길이를 갖는 암호문자열 출력하기
        password = new StringBuilder();
        char PwChar;
        int alpha;
        for (int i = 0; i < length; i++) {
            alpha = random.nextInt(26);
            PwChar = (char) ('A' + alpha);
            password.append(PwChar);
        }
    }
    public void print() {
        System.out.print("PassWord: ");
        System.out.println(password);
    }
    public void make(int length, int amount) {  // 파라미터: length - 암호 문자열의 길이, amount - 생성하는 암호의 개수
        for (int i = 0; i < amount; i++) {
            make(length);
            print();
        }
    }
}
