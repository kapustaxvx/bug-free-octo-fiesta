package HomeWorkTwo;

public class Task2 {
    public static void main(String[] args) {

        int[] arrayTask2 = new int[8];
        // Заполняем массив
        fillInArray(arrayTask2);
        // Выводим результат на экран
        for (Integer integer : arrayTask2) System.out.print(integer + " ");

    }

    // Метод заполняет массив числами, с шагом 3,с помощью цикла
    static int[] fillInArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }
        return array;
    }


}
