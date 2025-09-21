public class Main {

    // 1. Метод printThreeWords
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2. Метод checkSumSign
    public static void checkSumSign() {
        int a = 5;
        int b = -10;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3. Метод printColor
    public static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4. Метод compareNumbers
    public static void compareNumbers() {
        int a = 25;
        int b = 30;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5. Проверка суммы в диапазоне [10, 20]
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 6. Печать знака числа
    public static void printSign(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    // 7. Проверка на отрицательное число
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // 8. Печать строки n раз
    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    // 9. Проверка високосного года
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    // 10. Инвертирование массива
    public static void invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
    }

    // 11. Заполнение массива числами от 1 до 100
    public static int[] fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    // 12. Умножение элементов массива меньше 6 на 2
    public static void modifyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    // 13. Заполнение диагоналей единицами
    public static void fillDiagonals(int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - 1 - i] = 1;
        }
    }

    // 14. Создание массива с initialValue
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    // Главный метод main для демонстрации работы всех методов
    public static void main(String[] args) {
        // 1. Вызов printThreeWords
        System.out.println("1. printThreeWords:");
        printThreeWords();

        // 2. Вызов checkSumSign
        System.out.println("\n2. checkSumSign:");
        checkSumSign();

        // 3. Вызов printColor
        System.out.println("\n3. printColor:");
        printColor();

        // 4. Вызов compareNumbers
        System.out.println("\n4. compareNumbers:");
        compareNumbers();

        // 5. Вызов isSumInRange
        System.out.println("\n5. isSumInRange:");
        System.out.println("Сумма 5 и 7 в диапазоне [10, 20]: " + isSumInRange(5, 7));
        System.out.println("Сумма 10 и 10 в диапазоне [10, 20]: " + isSumInRange(10, 10));

        // 6. Вызов printSign
        System.out.println("\n6. printSign:");
        printSign(0);
        printSign(-5);

        // 7. Вызов isNegative
        System.out.println("\n7. isNegative:");
        System.out.println("0 отрицательное: " + isNegative(0));
        System.out.println("-5 отрицательное: " + isNegative(-5));

        // 8. Вызов printStringMultipleTimes
        System.out.println("\n8. printStringMultipleTimes:");
        printStringMultipleTimes("Hello", 3);

        // 9. Вызов isLeapYear
        System.out.println("\n9. isLeapYear:");
        System.out.println("2020 високосный: " + isLeapYear(2020));
        System.out.println("1900 високосный: " + isLeapYear(1900));

        // 10. Вызов invertArray
        System.out.println("\n10. invertArray:");
        int[] binaryArray = {1, 1, 0, 0, 1, 0};
        System.out.print("До: ");
        for (int num : binaryArray) {
            System.out.print(num + " ");
        }
        invertArray(binaryArray);
        System.out.print("\nПосле: ");
        for (int num : binaryArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 11. Вызов fillArray
        System.out.println("\n11. fillArray:");
        int[] filledArray = fillArray();
        for (int i = 0; i < 10; i++) { // Выведем первые 10 элементов для краткости
            System.out.print(filledArray[i] + " ");
        }
        System.out.println("...");

        // 12. Вызов modifyArray
        System.out.println("\n12. modifyArray:");
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("До: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        modifyArray(numbers);
        System.out.print("\nПосле: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 13. Вызов fillDiagonals
        System.out.println("\n13. fillDiagonals:");
        int size = 5;
        int[][] matrix = new int[size][size];
        fillDiagonals(matrix);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 14. Вызов createArray
        System.out.println("\n14. createArray:");
        int[] initialArray = createArray(5, 7);
        for (int num : initialArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}