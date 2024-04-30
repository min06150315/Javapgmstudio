// J044. Random Password 만들기
package Practice.JavaLab5;
import java.util.Random;
import java.util.Scanner;

public class Java044 {
    StringBuilder password;
    Random random = new Random();
    public Java044() { // 생성자
        password = new StringBuilder();
    }
    public void make(int length) {  // length 길이를 갖는 암호문자열 출력하기
        int randomNum;
        for (int i = 0; i < length; i++) {
            randomNum = random.nextInt(10);
            password.append(randomNum);
        }
    }
    public void print() {
        System.out.println(">> PassWord >> ");
        System.out.println(password);
    }
    public static void main(String[] args) {
        Java044 PS = new Java044();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the Length of Password : ");
        int len = keyboard.nextInt();
        PS.make(len);
        PS.print();
    }
}