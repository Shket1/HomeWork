/*
Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings
of a1 which are substrings of strings of a2.

Даны 2 массива, массив а1 является подстрокой массива а2. выводит отсортированный массив подстрок
Можно сделать проше:
                   return Arrays.stream(array1)
                          .filter(str ->
                          Arrays.stream(array2).anyMatch(s -> s.contains(str)))
                          .distinct()
                          .sorted()
                          .toArray(String[]::new);
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            boolean isContain = false;
            for (int j = 0; j < array2.length; j++) {
                if (array2[j].contains(array1[i])) {
                    isContain = true;
                }
            }
            if (isContain) {
                list.add(array1[i]);
            }
        }
        String[] array3 = new String[list.size()];
        if (list.size() < 1) {
            return new String[0];
        } else {
            for (int i = 0; i < list.size(); i++)
                array3[i] = list.get(i);
        }
        Arrays.sort(array3);
        return array3;
    }
}
