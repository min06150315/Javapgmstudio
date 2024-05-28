package week13;

import java.util.ArrayList;

public class ScoreManager {
    ArrayList<Score> list;
    public ScoreManager() {
        list = new ArrayList<Score>();
    }
    void addList(Score e) {
        list.add(e);
    }
    void printClasses() {    // 각 과목별 총점과 평균 점수를 출력
        int totalKor = 0, totalEng = 0, totalMath = 0;
        double avgKor, avgEng, avgMath;
        for (Score s : list) {
            totalKor += s.getKor();
            totalEng += s.getEng();
            totalMath += s.getMath();
        }
        avgKor = (double) totalKor / list.size();
        avgEng = (double) totalEng / list.size();
        avgMath = (double) totalMath / list.size();

        System.out.printf("Korean - Total: %d, Average: %.1f\n", totalKor, avgKor);
        System.out.printf("English - Total: %d, Average: %.1f\n", totalEng, avgEng);
        System.out.printf("Math - Total: %d, Average: %.1f\n", totalMath, avgMath);
    }
    void printStudents() {    // 각 학생별 총점과 평균 점수를 출력
        for (int i = 0; i < list.size(); i++) {
            int sum = list.get(i).getKor() + list.get(i).getEng() + list.get(i).getMath();
            double avg = sum / 3.0;

            list.get(i).setSum(sum);
            list.get(i).setAvg(avg);

            System.out.printf("[%d] %s\n", (i + 1), list.get(i).toString());
        }
    }
    void printHighest() {    // 가장 높은 평균 점수를 받은 학생의 이름과 점수 출력
        double maxAvg = 0;
        Score topStudent = null;
        for (Score s : list) {
            if (s.getAvg() > maxAvg) {
                maxAvg = s.getAvg();
                topStudent = s;
            }
        }
        if (topStudent != null) {
            System.out.printf("[Top Student] %s\n", topStudent.toString());
        }
    }
}
