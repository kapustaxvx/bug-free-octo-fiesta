package HomeWorkTwo;

public class Task6 {
    public static void main(String[] args) {

        int[] arrayTask6 = {1, 1, 1, 2, 1};
        // Проверяем балланс половин и выводим результат на экран
        System.out.println(checkBalance(arrayTask6));

    }

    // Метод сравнивает правую и левую части массива на равенство
    static boolean checkBalance(int[] array) {

        // Создаем 2 переменный, для суммирования 1 и 2-ой половин массива
        int firstSum = 0;
        int secondSum = 0;

        // Если длина массива четная вычисляем суммы половин
        if (array.length % 2 == 0) {
            for (int i = 0; i < array.length / 2; i++) {
                firstSum += array[i];
            }
            for (int i = array.length / 2 - 1; i < array.length; i++) {
                secondSum += array[i];
            }
            //Если длина массива не четная, оставляем слева на 1 элемент больше
        } else {
            for (int i = 0; i < array.length / 2 + 1; i++) {
                firstSum += array[i];
            }
            for (int i = array.length / 2 + 1; i < array.length; i++) {
                secondSum += array[i];
            }
        }

        // Возвращаем булево значение
        return firstSum == secondSum;
    }
}
