package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice2WordSearch2 {

    public static void main(String[] args) {


        ArrayList<String> wordSearchResults = new ArrayList<>();
        String quote = "I would not, could not, in a box. I would not, could not " +
                "with a fox. I will not eat them in a house. I will not eat them " +
                "with a mouse.";
        String cleanQuoteComma = quote.replaceAll(",", "");
        String cleanQuoteCommaPeriod = cleanQuoteComma.replaceAll("\\.", "");
        String[] quoteArray = cleanQuoteCommaPeriod.split("\\s+");
        ArrayList<String> quoteArrayList = new ArrayList<String>(Arrays.asList(quoteArray));

        System.out.println(quoteArrayList);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word length, as an integer, that you wish to search for: ");
        int wordLength = Integer.parseInt(input.next());
        input.close();

        for(int i = 0; i < quoteArrayList.size(); i++) {
            if (quoteArrayList.get(i).length() == wordLength) {
                wordSearchResults.add(quoteArrayList.get(i));
                System.out.println(quoteArrayList.get(i));
            }
        }
        System.out.println(wordSearchResults);

    }
}
