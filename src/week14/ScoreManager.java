package week14;

import java.util.HashMap;

public class ScoreManager {
    HashMap<String, Score> map;
    public ScoreManager() {
        map = new HashMap<>();
    }
    void addHashMap(String name, Score e) {
        map.put(name, e);
    }
    void printClasses() {    // 각 과목별 총점과 평균 점수를 출력
        int totalKor = 0, totalEng = 0, totalMath = 0;
        for (Score s : map.values()) {
            totalKor += s.getKor();
            totalEng += s.getEng();
            totalMath += s.getMath();
        }
        double avgKor = (double) totalKor / map.size();
        double avgEng = (double) totalEng / map.size();
        double avgMath = (double) totalMath / map.size();

        System.out.printf("Korean - Total: %d, Average: %.1f\n", totalKor, avgKor);
        System.out.printf("English - Total: %d, Average: %.1f\n", totalEng, avgEng);
        System.out.printf("Math - Total: %d, Average: %.1f\n", totalMath, avgMath);
    }
    void printStudents() {    // 각 학생별 총점과 평균 점수를 출력
        int count = 1;
        for (HashMap.Entry<String, Score> entry : map.entrySet()) {
            Score s = entry.getValue();
            int sum = s.getKor() + s.getEng() + s.getMath();
            double avg = sum / 3.0;
            s.setSum(sum);
            s.setAvg(avg);
            System.out.printf("[%d] %s: %s\n", count++, entry.getKey(), s.toString());
        }
    }
    void printHighest() {    // 가장 높은 평균 점수를 받은 학생의 이름과 점수 출력
        double maxAvg = 0;
        String topStudent = null;
        for (HashMap.Entry<String, Score> entry : map.entrySet()) {
            Score s = entry.getValue();
            if (s.getAvg() > maxAvg) {
                maxAvg = s.getAvg();
                topStudent = entry.getKey();
            }
        }
        if (topStudent != null) {
            System.out.printf("[Top Student] %s: %s\n", topStudent, map.get(topStudent).toString());
        }
    }
    void searchStudentName(String name) {
        if (map.containsKey(name)) {
            Score value = map.get(name);
            System.out.println(name + ": " + value);
        } else {
            System.out.println("Can't Find Student.");
        }
    }
    void updateStudentScore(String name, int kor, int eng, int math) {
        if (map.containsKey(name)) {
            Score s = map.get(name);
            s.setKor(kor);
            s.setEng(eng);
            s.setMath(math);
            System.out.println("Update complete.");
        } else {
            System.out.println("Can't Find Student.");
        }
    }
}
