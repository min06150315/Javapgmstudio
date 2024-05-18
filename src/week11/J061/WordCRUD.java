package week11.J061;

import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD {
    ArrayList<Word> list;
    public WordCRUD() {
        list = new ArrayList<Word>();
    }
    void addWord() {    // 단어 추가
        String english, korean;
        int level;
        Scanner s = new Scanner(System.in);
        System.out.print("English > ");
        english = s.next();
        s.nextLine();
        System.out.print("Korean > ");
        korean = s.nextLine();
        System.out.print("Level (1~3) > ");
        level = s.nextInt();
        Word new_word = new Word(english, korean, level);
        list.add(new_word);
    }
    void editWord() {   // 단어 뜻 수정
        int num;
        String new_korean;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Number of Word: ");
        num = s.nextInt() - 1;

        if (num >= 0 && num < list.size()) {
            System.out.print("New Meaning: ");
            new_korean = s.next();
            list.get(num).setKor_Word(new_korean);
            System.out.println("Edit Complete.");
        } else {
            System.out.println("No Data!!");
        }

    }
    void listWord() {   // 단어 목록 출력
        for (int i = 0; i < list.size(); i++)
            System.out.printf("%d - %s\n", i + 1, list.get(i).toString());
    }
    void deleteWord() {   // 단어 삭제
        int num;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Number of Word: ");
        num = s.nextInt() - 1;

        if (num >= 0 && num < list.size()) {
            list.remove(num);
            System.out.println("Delete Complete.");
        } else {
            System.out.println("No Data!!");
        }
    }
}
