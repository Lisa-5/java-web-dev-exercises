package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice2WordSearch {

    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<>();
        String[] wordArray = {"Write", "a", "static", "method", "to", "print", "out", "each", "word", "in", "a", "list", "that", "has", "exactly", "5", "letters"};
        ArrayList<String> wordSearchResults = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word length as an integer you wish to search for: ");
        int wordLength = Integer.parseInt(input.next());
        input.close();

        wordList.addAll(Arrays.asList(wordArray));

        for(int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).length() == wordLength) {
                wordSearchResults.add(wordList.get(i));
                System.out.println(wordList.get(i));
            }
        }
        System.out.println(wordSearchResults);




    }
}
