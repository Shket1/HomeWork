/*
метод возвращает количество битов равных 1 в числе.
можно сделать проще вот так Integer.bitCount(n);
 */

public class BitCounting {
    public static int countBits(int n){
        int res = 0;
        while (n != 0){
            if ((n % 2) > 0) res++;
            n /= 2;
        }
        return res;
    }
}
