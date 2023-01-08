import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long m = System.currentTimeMillis();
        System.out.println(WeightSort.orderWeight(" 14 220 22 11 54 67 99 13 "));
        System.out.println((double) (System.currentTimeMillis() - m));
    }
}