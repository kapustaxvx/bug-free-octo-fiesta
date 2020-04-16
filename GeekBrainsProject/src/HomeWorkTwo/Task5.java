package HomeWorkTwo;

public class Task5 {
    public static void main(String[] args) {

        int[] arrayTask5 = {6, -147, 68, 876, -1113, 27, 2009, 116, -524, 0};
        // Ищем максимальный и минимальный эллемент массива и выводим их на экран
        maxAndMinValue(arrayTask5);

    }

    // Метод ищет максимальное и минимальное значеник в массиве и выводит их на экран
    static void maxAndMinValue(int[] array) {

        // Записываем в переменный мах и мин значения 1-х элементов массива
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {

            // Перебираем массив, если след элемент больше
            // или меньше, записываем новое значение в переменную
            // если оно удовлетворяет условию
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
        }
        System.out.println("Minimum: " + min + "\nMaximum: " + max);
    }

}
