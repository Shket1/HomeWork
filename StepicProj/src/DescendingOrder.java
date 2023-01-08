/*
Этот метод получает на вход любое число, и делает из его чисел максимаьно возможное число
например из числа 23145 он сделает 54321
 */

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }
}
