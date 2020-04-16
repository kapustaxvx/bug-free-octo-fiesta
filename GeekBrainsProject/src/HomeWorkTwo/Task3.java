package HomeWorkTwo;

public class Task3 {
    public static void main(String[] args) {

        int[] arrayTask3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        // Перебираем массив и умножаем на 2 числа меньше 6
        multiplyNumbersLessSix(arrayTask3);
        // Выводим результат на экран
        for (Integer integer : arrayTask3) System.out.print(integer + " ");

    }

    // Метод умножающий на 2 все числа меньше 6
    static int[] multiplyNumbersLessSix(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array[i] *= 2;
        }
        return array;
    }
}
