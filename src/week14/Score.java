package week14;

public class Score {
    private int kor, eng, math;
    private int sum;
    private double avg;

    // constructors
    Score(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    void calculateSumAvg() {
        this.sum = this.kor + this.eng + this.math;
        this.avg = this.sum / 3.0;
    }
    // getters & setters
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
    public void setKor(int kor) {
        this.kor = kor;
        calculateSumAvg();
    }
    public void setEng(int eng) {
        this.eng = eng;
        calculateSumAvg();
    }
    public void setMath(int math) {
        this.math = math;
        calculateSumAvg();
    }
    public void setSum(int sum) {
        this.sum = sum;
    }
    public void setAvg(double avg) {
        this.avg = avg;
    }
    @Override   // 학생의 점수 출력 (overrided)
    public String toString() {
        return String.format("%d %d %d - %d %.1f", kor ,eng, math, sum, avg);
    }

}
