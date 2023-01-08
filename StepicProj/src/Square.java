/*
этот метод проверяет является ли число квадратом от самого себя
 */

public class Square {
    public static boolean isSquare(int n) {
        return (((int)Math.sqrt(n) * (int)Math.sqrt(n)) == n);
    }
}
