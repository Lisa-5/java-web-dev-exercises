package exercises;

import java.util.Scanner;

public class AlicePart2 {
    public static void main(String[] args) {
        String searchTerm;
        Scanner input;

        String quote = "Alice was beginning to get very tired of sitting by her " +
                "sister on the bank, and of having nothing to do: once or " +
                "twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without " +
                "pictures or conversation?'";

        System.out.println(quote);
        input = new Scanner(System.in);
        System.out.println("Enter a word or phrase from the quote to search: ");
        searchTerm = input.nextLine().trim();
        input.close();


        if (quote.toLowerCase().contains(searchTerm.toLowerCase().trim())) {
            int index = quote.indexOf(searchTerm);
            int index2 = index + 1 + searchTerm.length();
            String string1 = quote.substring(0, index);
            String string2 = quote.substring(index2);
            String modifiedSentence = string1.concat(string2);

            System.out.println("The quote contains: " + searchTerm);
            System.out.println("It's index is " + index + " and its length is " + searchTerm.length());
            System.out.println(modifiedSentence);
        } else {
            System.out.println("The quote does not contain: " + searchTerm);
        }

    }
}
