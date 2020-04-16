package HomeWorkTwo;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        // Заменяем нули на единыцы и единицы на нули
        changeOneZero(array);
        // Выводим результат на экран
        for (Integer integer : array) System.out.print(integer + " ");
    }

    // Метод меняет в массиве 1 на 0 и 0 на 1
    static int[] changeOneZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) array[i] = 0;
            else if (array[i] == 0) array[i] = 1;
        }
        return array;
    }

}
