package org.launchcode.java.studios.countingcharacters;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingChars2 {

    public static void main(String[] args) {

        HashMap<Character,Integer> CharCounterMap = new HashMap<>();
        String string;
        System.out.println("Please enter a string to search: ");
            Scanner input = new Scanner(System.in);
            string = input.nextLine().toLowerCase();

        char[] stringToSearch = string.toCharArray();
        //stringToSearch = Arrays.stream(stringToSearch).filter(x => Character.isLetter(x)).toArray();
        for(char c : stringToSearch) {
            if(Character.isLetter(c)) {
                if(!CharCounterMap.containsKey(c)) {
                    CharCounterMap.put(c, 1);
                }else {
                    Integer count = CharCounterMap.get(c) + 1;
                    CharCounterMap.put(c, count);
                }
            }
        }

        for(Map.Entry<Character,Integer> character : CharCounterMap.entrySet()){
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
