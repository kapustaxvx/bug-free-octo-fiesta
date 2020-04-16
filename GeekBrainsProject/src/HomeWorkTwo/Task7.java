package HomeWorkTwo;

public class Task7 {
    public static void main(String[] args) {

        // Инициализируем массив
        int[] arrayTask7 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Производим сдвиг
        shiftByN(arrayTask7, -1);

        // Выводим результат на экран
        for (Integer integer : arrayTask7) System.out.print(integer + " ");
    }

    // Смещает количество эллементов массива на n позиций
    static int[] shiftByN(int[] array, int n) {

        // Если сдвиг больше длины массива, оптимизируем его делением по модулю
        int shift = n % array.length;

        // Если n > 0  сдвигаем массив вправо
        if (n > 0) {
            for (int i = 0; i < shift; i++) {

                // Первый элемент записывает в буффер, а на его место
                // записываем элемент из хвоста массива
                int buf = array[0];
                array[0] = array[array.length - 1];

                // Циклично сдвигаем весь массив
                for (int j = 1; j < array.length - 1; j++) {
                    array[array.length - j] = array[array.length - j - 1];
                }

                // Записываем в 1 ячейку значение из буффера
                array[1] = buf;
            }
        }

        // Если n < 0 смещаем массив влево
        if (n < 0) {
            for (int i = 0; i > shift; i--) {

                // Последний элемент записываем в буффер, а на его место
                // записываем элемент из начала массива
                int buf = array[array.length - 1];
                array[array.length - 1] = array[0];

                // Циклично сдвигаем массив
                for (int j = 1; j < array.length - 1; j++) {
                    array[j - 1] = array[j];
                }

                // Записываем в предпоследнюю ячейку значение из буффера
                array[array.length - 2] = buf;
            }
        }

        return array;
    }


}
