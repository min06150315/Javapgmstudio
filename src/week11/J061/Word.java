package week11.J061;

public class Word {
    private String eng_word;    // 영문 단어
    private String kor_Word;    // 한글 뜻
    private int difficulty;     // 난이도 (1 ~ 3)
    Word(String eng_word, String kor_Word, int difficulty) {
        this.eng_word = eng_word;
        this.kor_Word = kor_Word;
        this.difficulty = difficulty;
    }
    public String getEng_word() {
        return eng_word;
    }
    public String getKor_Word() {
        return kor_Word;
    }
    public int getDifficulty() {
        return difficulty;
    }
    public void setEng_word(String eng_word) {
        this.eng_word = eng_word;
    }
    public void setKor_Word(String kor_Word) {
        this.kor_Word = kor_Word;
    }
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
    public String toString() {      // 멤버의 내용을 문자열로 리턴
        return String.format("%s [%d] : %s", eng_word, difficulty, kor_Word);
    }
}
