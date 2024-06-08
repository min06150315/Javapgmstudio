package week14;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        Scanner s = new Scanner(System.in);
        int menu;
        System.out.print("Enter the Problem Number: ");
        menu = s.nextInt();

        if (menu == 91) {
            pStudio.J091();
        } else if (menu == 92) {
            pStudio.J092();
        } else if (menu == 93) {
            pStudio.J093();
        } else if (menu == 94) {
            pStudio.J094();
        } else {
            System.out.println("bye!");
        }
    }
    void J091() {
        // J091, 국영수 점수 분석하기 (HashMap 버전)       // 데이터파일로부터 읽어들인 학생의 점수 데이터를 HashMap에 보관하기
        Scanner s = new Scanner(System.in);
        ScoreManager manager = new ScoreManager();
        //String filename = "./src/week14/TextFiles/data091_1.txt";     // 첫번째 테스트용
        String filename = "./src/week14/TextFiles/data091_2.txt";     // 두번째 테스트용
        int count = 1;
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

            Score new_score = new Score(kor, eng, math);
            manager.addHashMap(name, new_score);
        }

        while (true) {
            int menu;
            System.out.print("\n1.점수 통계 출력 2.학생 검색기능 3.학생 점수 수정 기능 4.프로그램 종료 > ");
            menu = s.nextInt();

            if (menu == 1) {
                // 1) 점수 통계 출력;
                System.out.println("각 과목별 총점과 평균 점수를 출력");
                manager.printClasses();

                System.out.println("\n각 학생별 총점과 평균 점수를 출력");
                manager.printStudents();

                System.out.println("\n가장 높은 평균 점수를 받은 학생의 이름과 점수 출력");
                manager.printHighest();
            } else if (menu == 2) {
                // 2) 학생 겁색기능
                String name;
                System.out.print("학생 이름을 입력하세요: ");
                name = s.next();
                manager.searchStudentName(name);
            } else if (menu == 3) {
                // 3) 학생 점수 수정 기능
                String name;
                int kor, eng, math;
                System.out.print("학생 이름을 입력하세요: ");
                name = s.next();
                System.out.print("국어 점수를 입력하세요: ");
                kor = s.nextInt();
                System.out.print("영어 점수를 입력하세요: ");
                eng = s.nextInt();
                System.out.print("수학 점수를 입력하세요: ");
                math = s.nextInt();
                manager.updateStudentScore(name, kor, eng, math);
            } else {
                // 4) 프로그램 종료
                System.out.println("bye!");
                break;
            }
        }
    }
    void J092() {
        // J092. 주차장 입출력 관리
        Scanner keyboard = new Scanner(System.in);
        SimpleDateFormat s = new SimpleDateFormat("yyyyMMdd HHmm");
        HashMap<Integer, Car> map = new HashMap<>();
        while (true) {
            int menu;
            System.out.print("\n1) enter. 2) exit. 3) list. 4) quit. > ");
            menu = keyboard.nextInt();

            if (menu == 1) {
                // 1) 입차(enter) - 차량번호(4자리)와 차종을 입력받아 주차 등록함
                int number;
                String type;
                System.out.print("Enter number, type > ");
                number = keyboard.nextInt();
                type = keyboard.next();
                String entryTime = s.format(new Date());
                map.put(number, new Car(number, type, entryTime));
            } else if (menu == 2) {
                // 2) 출차(exit) - 주차된 차량 중 하나를 선택하여 주차비용을 계산하고 출차 처리함
                int number;
                System.out.print("Enter car number to exit > ");
                number = keyboard.nextInt();

                if (map.containsKey(number)) {
                    Car car = map.get(number);
                    String exitTime = s.format(new Date());
                    int time = car.calculateTime(car.entryTime, exitTime);
                    int fee = car.calculateFee(time);
                    map.remove(number);
                    System.out.println(car.number + " " + car.type + " " + time + "min, " + "Parking fee " + fee + " (current time " + s.format(new Date()) + ")");
                } else {
                    System.out.println("Can't Find Car Number.");
                }
            } else if (menu == 3) {
                // 3) 목록(list) - 현재 주차된 모든 차량 정보와 입차시간을 출력함
                int i = 1;
                if (!map.isEmpty()) {
                    System.out.println("========================================");
                    System.out.println("num\t\t\ttype\ttime");
                    for (Car car : map.values())
                        System.out.println("[" + i++ + "] " + car.number + "\t" + car.type + "\t" + car.entryTime);
                }
            } else {
                // 4) 종료(quit) - 프로그램 종료
                System.out.println("bye!");
                break;
            }
        }
    }
    void J093() {
        // J093. SimpleChat 기능 추가 #1

    }
    void J094() {
        // J094. SimpleChat 기능 추가 #2

    }
}
