package HomeWorkTwo;

public class Task4 {
    public static void main(String[] args) {

        int[][] arrayTask4 = new int[4][4];
        // Заполняем массив
        diagonalByOne(arrayTask4);
        // Выводим результат на экран
        for (int i = 0; i < arrayTask4.length; i++) {
            for (int j = 0; j < arrayTask4[1].length; j++) {
                System.out.print(arrayTask4[i][j]);
            }
            System.out.println();
        }
    }

    // Метод заполняет диагональные эллементы массива 1
    static int[][] diagonalByOne(int[][] array) {

        // Заходим в оба массива, если индекс ячейки первого массива равен
        // индексу ячейки второго массива записываем 1
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                if (i == j) array[i][j] = 1;
            }
        }
        return array;
    }
}
