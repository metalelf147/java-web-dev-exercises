package org.launchcode.java.studios.charactercount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class charClass {

    public static void main(String[] args) {

        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero" +
                " to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be " +
                "factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

            char[] charactersInString = quote.toCharArray();

            HashMap<Character, Integer> charCountMap = new HashMap<>();
            for(char letter: charactersInString){
                if(charCountMap.containsKey(letter)){
                    charCountMap.put(letter, charCountMap.get(letter) + 1);
                } else {
                    charCountMap.put(letter, 1);
                }
            }

            //syntax for key and value when it. thru hashmap
            for(Map.Entry<Character, Integer> pair : charCountMap.entrySet()){
                System.out.println(pair.getKey() + ": " + pair.getValue());
            }
    };
}


// SCRAP PAPER CODE:
// char[] charactersInString = quote.toCharArray();
//
//        String[] split = quote.split("\\s");
//        for (int i : charactersInString) {
//            if
//        };




//        String[] split = quote.split("\\s");
//



//        for (char count : charactersInString){
////            if(quote.containsKey(count))
//        }


//        nums.put()
