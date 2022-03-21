package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String quote;
        String searchTerm;
        Scanner input;

        quote = "Alice was beginning to get very tired of sitting by her " +
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

        if (quote.toLowerCase().contains(searchTerm.trim().toLowerCase())) {
            System.out.println("The quote contains: " + searchTerm);
        } else {
            System.out.println("The quote does not contain: " + searchTerm.trim());
        }
    }
}
