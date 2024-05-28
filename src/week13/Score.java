package week13;

public class Score {
    private String name;
    private int kor, eng, math;
    private int sum;
    private double avg;

    // constructors
    Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    // getters & setters
    public String getName() {
        return name;
    }
    public int getKor() {
        return kor;
    }
    public int getEng() {
        return eng;
    }
    public int getMath() {
        return math;
    }
    public int getSum() {
        return sum;
    }
    public double getAvg() {
        return avg;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }
    public void setAvg(double avg) {
        this.avg = avg;
    }

    // 학생의 점수 출력 (overrided)
    public String toString() {
        return String.format("%s : %d %d %d - %d %.1f", name, kor ,eng, math, sum, avg);
    }

}
