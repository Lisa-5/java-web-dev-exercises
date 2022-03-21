package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static exercises.EvenNumbers.sumEvenNumbers;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        int[] numData = {0,1,2,3,4,5,6,7,8,9,10,11,12};

        for (int integer : numData) {
            numbers.add(integer);
        }

        int sumOfEvenNumbers = sumEvenNumbers(numbers);

        System.out.println("The sum of the even numbers in the numbers ArrayList " +
                "is: " + sumOfEvenNumbers);
    }
}
