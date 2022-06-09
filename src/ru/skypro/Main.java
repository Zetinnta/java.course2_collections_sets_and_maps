package ru.skypro;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        AdditionalUtility ulitily = new AdditionalUtility();

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 8, 3, 4, 4, 3, 5, 6, 7, 9, 21, 20, 48, 13));
        List<String> words = (List.of("Смех", "Радость", "Счастье", "Горе", "Усталость",
                "Бодрость", "Смех", "Счастье", "Смех", "Радость", "Бодрость"));

        AdditionalUtility.oddNumbers(nums);

        System.out.println();
        delimeter();

        AdditionalUtility.evenNumbers(nums);
        System.out.println();
        delimeter();

        AdditionalUtility.stringWithNoDublicates(words);
        System.out.println();
        delimeter();

        AdditionalUtility.countDuplicates(words);


    }


    public static void delimeter() {
        System.out.println("--------------------------------------------------------------------");
    }
}


