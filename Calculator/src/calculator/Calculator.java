package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пример в формате: 10 + 20.");

        String example = scanner.nextLine();
        scanner.close();

        try {
            System.out.println(calculate(example));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static double calculate(String example) throws Exception {
        String[] arr = example.split(" ");

        try {
            Double.parseDouble(arr[0]);
            Double.parseDouble(arr[2]);
        } catch (Exception e) {
            throw new Exception("Error! Not number");
        }

        double one = Double.parseDouble(arr[0]);
        double two = Double.parseDouble(arr[2]);
        double res = 0;

        switch(arr[1]) {
            case "+":
                return one + two;
            case "-":
                return one - two;
            case "*":
                return one * two;
            case "/":
                if (two == 0) {
                    throw new Exception("Error! Division by zero");
                }
                return one / two;
        }
        throw new Exception("Operation Error!");
    }
}