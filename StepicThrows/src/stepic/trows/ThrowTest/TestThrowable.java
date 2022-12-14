package stepic.trows.ThrowTest;

/**
 * Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.
 *
 * Метод getCallerClassAndMethodName() должен возвращать имя класса и метода,
 * откуда вызван метод, вызвавший данный утилитный метод. Или null (нулевую ссылку, а не строку "null"),
 * если метод, вызвавший getCallerClassAndMethodName() является точкой входа в программу, т.е. его никто не вызывал.
 *
 * Это актуально, например, в библиотеках логирования, где для каждого сообщения в логе надо выводить класс и метод,
 * откуда сообщение было залогировано.
 */

public class TestThrowable {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    //Данный метод возвращает полный путь. откуда был вызван класс
    public static String getCallerClassAndMethodName() {
        Throwable res = new Throwable();
        StackTraceElement[] res2 = res.getStackTrace();
        if(res2.length > 2) return res2[2].getClassName() + "#" + res2[2].getMethodName();

        return null;
    }
}
