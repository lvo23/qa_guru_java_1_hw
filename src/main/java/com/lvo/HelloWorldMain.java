package com.lvo;

/**
 * @author Vlad Litvinov
 */
public class HelloWorldMain {

    public static void main(String[] args) {

        // 0) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой
        // примитивные типы данных, их нулевые (дефолтные) значения, границы, занимаемое место
        // в памяти
        byte typeByte; // = 0, -128 до 127 включительно, 1 байт
        short typeShort; // = 0, -32 768 до 32,767 включительно, 2 байта
        int typeInt; // = 0, -2147483648 до 2147483647 включительно, 4 байта
        long typeLong; // = 0L, –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807, 8 байт
        float typeFloat; // = 0.0f, -3.4*1038 до 3.4*1038, 4 байта
        double typeDouble; // = 0.0d, ±4.9*10-324 до ±1.7976931348623157*10308, 8 байт
        boolean typeBoolean; // false, 1 бит (но размер не определяется)
        char typeChar; // '\u0000', '\u0000' до '\uffff', один 16-битный символ Unicode

        // также есть классы-обёртки над примитивными или ссылочные
        Byte tByte = Byte.MAX_VALUE;
        Short tShort = Short.MIN_VALUE;
        Integer tInt = Integer.MAX_VALUE;
        Long tLong = Long.MIN_VALUE;
        Float tFloat = Float.MAX_VALUE;
        Double tDouble = Double.MIN_VALUE;
        Boolean tBoolean = Boolean.TRUE;
        Character tChar = Character.MIN_VALUE;
        String tString = "Hello world";

        // 1) поупражняться с математическими и логическими операторами, добиться переполнения
        // при вычислениях, посмотреть результаты (вывести в консоль)
        // 3) прочитать про приоритет операторов в java
        int x = 1;
        int y = 2;
        int z = 3;

        int result = ++x + y * z; // порадок операций тут важен
        System.out.println(result); // по приоритету будет 8

        if (result == 8) {
            System.out.println("Результат равен 8");
        } else {
            System.out.println("Результат неравен 8");
        }

        // при использованиий ссылочных типов лучше использовать методы для сравнения значений
        Integer sampleNum = 10;
        boolean resultTrue = sampleNum.equals(10);

        // переполнение типа Integer
        System.out.println("Переполняем значение Integer: " + Integer.MAX_VALUE + 1);

        // 2) попробовать вычисления комбинаций типов данных (int и double)
        int firstResult = 2 * 5;
        double secondResult = 1.5 * 4;
        System.out
                .println("First result: " + firstResult + "\n" + "Second result: " + secondResult);
    }
}
