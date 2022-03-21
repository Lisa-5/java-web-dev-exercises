package exercises;

public class ArrayPractice1 {

    public static void main(String[] args) {

        int[] numArray = {1, 1, 2, 3, 5, 8};

        for(int i = 0; i < numArray.length; i++)

            if (numArray[i] % 2 == 1){
                System.out.println(numArray[i]);
            }

        System.out.println("--------");

        for (int number : numArray) {

            if (number % 2 == 1) {
                System.out.println(number);
            }
        }
    }
}
