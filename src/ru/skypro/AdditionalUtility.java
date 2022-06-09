package ru.skypro;

import java.util.*;

public class AdditionalUtility {

    public static void oddNumbers(List<Integer> oddNumbers) {
        for (Integer oddNumber : oddNumbers) {
            if (!(oddNumber % 2 == 0)) {
                System.out.print(oddNumber + " ");
            }
        }
    }

    public static void evenNumbers(List<Integer> evenNumbers) {
        List<Integer> sortedNumbers = new ArrayList<>();
        for (Integer number : evenNumbers) {
            if (number % 2 == 0) {
                if (!sortedNumbers.contains(number)) {
                    sortedNumbers.add(number);
                }
            }
        }
        Collections.sort(sortedNumbers);
        for (Integer evenNumber : sortedNumbers) {
            System.out.print(evenNumber + " ");
        }
    }

    public static void stringWithNoDublicates(List<String> list) {
        Set<String> setList = new HashSet<String>(list);
        for (String s : setList) {
            System.out.print(s + " ");
        }
    }


    public static void countDuplicates(List<String> words) {
        Map<String, Integer> counter = new HashMap<>();
        for (String s : words) {
            if (!counter.containsKey(s)) {
                counter.put(s, 1);
            } else {
                counter.put(s, counter.get(s) + 1);
            }
        }
        for (Map.Entry<String, Integer> word : counter.entrySet()) {
            if (word.getValue() >= 2) {
                System.out.println("Слово " + word.getKey() + " встречается " + word.getValue() + " раз(а)");
            }
        }
    }

}