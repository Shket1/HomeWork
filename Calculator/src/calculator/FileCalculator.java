package calculator;
/*
Перед началом использования нужно поменять в переменной output путь, куда будут записываться ответы примеров
Нужно указать полный путь на файл с примерами после запузка программы
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCalculator {

    public static final String OUTPUT = "C:\\Users\\ma4e9\\IdeaProjects\\Calculator\\src\\calculator\\result";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите полный путь файла с примерами типа \"10 + 20\", каждый пример на дово строке.");
        String example = scanner.nextLine();
        scanner.close();
        String res = "";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(example))) {
            while (bufferedReader.ready()) {
                res = bufferedReader.readLine();
                try {
                    res = res + " = " + calculate(res);
                    System.out.println(calculate(res));
                    writeInFile(res, OUTPUT);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    writeInFile(res + " = " + e.getMessage(), OUTPUT);
                }
            }
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

        switch (arr[1]) {
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

    public static void writeInFile(String res, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName, true)){
            fileWriter.write(res + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
