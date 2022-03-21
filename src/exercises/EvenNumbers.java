package exercises;

import java.util.ArrayList;

public class EvenNumbers {

    public static Integer sumEvenNumbers(ArrayList<Integer> args){
        int sum = 0;
        for(int i = 0; i < args.size() ; i++){
            if (args.get(i) % 2 == 0 ) {
                sum += args.get(i);
            }
        }
        return sum;
    }
}
