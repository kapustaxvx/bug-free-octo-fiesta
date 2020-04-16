package HomeWorkThree;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    /*
     * блок настроек игры
     * */

    private static char[][] map;    // Игровое поле
    private static int SIZE = 3;     // Размер поля


    private static final char DOT_EMPTY = '*';  // Пустая ячейка
    private static final char DOT_X = 'X';      // Крестик
    private static final char DOT_O = 'O';      // Нолик

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    private static boolean firstStepForComp = true;


    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (isEndGame(DOT_X)) {
                break;
            }


            compTurn();
            printMap();
            if (isEndGame(DOT_O)) {
                break;
            }
        }

        System.out.println("Игры закончена");

    }

    /*
     * Методы инициализации игрового поля
     */

    // Заполняем игровое поле
    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    // Печатаем игровое поле
    private static void printMap() {

        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }


    /*
     *  Методы для хода игрока и компьютера
     */

    private static void humanTurn() {
        int x = -1;
        int y = -1;

        while (!isCellCorrect(x, y)) {
            System.out.println("Введите координаты вашего хода через пробел");
            y = scanner.nextInt() - 1;
            x = scanner.nextInt() - 1;
        }

        map[y][x] = DOT_X;

    }

    private static void compTurn() {
        int x = -1;
        int y = -1;



        // Если ход не первый, обходим весь массив ишем пустые клетки
        // проверяем на наличие О рядом и ставим свой О
        if (!firstStepForComp) {
            stop:
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) {
                        if (checkIndexForComp(i, j)) {
                            map[i][j] = DOT_O;
                            System.out.println("Ход компьютера: " + (j + 1) + " " + (i + 1));
                            break stop;
                        }
                    }
                }
            }
        } else {
            do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            } while (!isCellCorrect(x, y));

            // Ставим переменную первый ход в фолс
            firstStepForComp = false;
            map[y][x] = DOT_O;
            System.out.println("Ход компьютера: " + (y + 1) + " " + (x + 1));
        }
    }


    // Обходим и ищем в соседних клетках О
    private static boolean checkIndexForComp(int x, int y) {
        boolean result = false;

        if (checkDotO(x - 1, y - 1)) {
//            System.out.println("x - 1, y - 1");
            result = true;
        } else if (checkDotO(x - 1, y)) {
//            System.out.println("x - 1, y");
            result = true;
        } else if (checkDotO(x - 1, y + 1)) {
//            System.out.println("x - 1, y + 1");
            result = true;
        } else if (checkDotO( x, y - 1)) {
//            System.out.println("x, y - 1");
            result = true;
        } else if (checkDotO( x, y + 1)) {
//            System.out.println("x, y + 1");
            result = true;
        } else if (checkDotO(x + 1, y - 1)) {
//            System.out.println("x + 1, y - 1");
            result = true;
        } else if (checkDotO(x + 1, y)) {
//            System.out.println("x + 1, y");
            result = true;
        } else if (checkDotO(x + 1, y + 1)) {
//            System.out.println("x + 1, y + 1");
            result = true;
        } else System.out.println("все фейк");


        return result;
    }


    // Проверяем подходит входит ли ячейка в массив и стоит ли в ней О
    private static boolean checkDotO(int x, int y) {
        boolean result = false;

        if (!(x < 0 || x >= SIZE || y < 0 || y >= SIZE)  && map[x][y] == DOT_O) {
            result = true;
        }
        return result;
    }



    /*
     * Метод по вычислению корректорнисти ячейки
     * х - горизонталь
     * у - вертикаль
     * */

    private static boolean isCellCorrect(int x, int y) {
        boolean result = true;

        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) result = false;
        else if (map[y][x] != DOT_EMPTY) result = false;

        return result;
    }

    /*
     * Метод определяющий оконченна ли игра
     */

    private static boolean isEndGame(char dot) {
        boolean result = false;

        if (!hasEmpty()) {
            System.out.println("Не осталось свободных ячеек.");
            result = true;
        }

        if (winCombination(dot)) {
            System.out.println("Победил игрок: " + dot);
            return true;
        }

        return result;
    }

    /*
     * Определяем есть ли пустые ячейки в поле
     */

    private static boolean hasEmpty() {
        boolean result = false;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    result = true;
                    break;
                }
            }
        }

        return result;
    }

    /*
     *  Определяем победные комбинации для поля любого размера
     */

    public static boolean winCombination(char dot) {
        boolean result = false;
        int countDotsInLine = 0;

        // Проверяем одну диагональ на выйгрышь
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == dot) {
                countDotsInLine++;
            } else {
                countDotsInLine = 0;     // Сбрасываем счетчик
                break;                   // выходим из цикла
            }

            if (countDotsInLine == SIZE) result = true;
        }


        // Проверяем 2ю диагоняль на выйгрышь
        for (int i = 0; i < SIZE; i++) {
            if (map[i][SIZE - i - 1] == dot) {
                countDotsInLine++;
            } else {
                countDotsInLine = 0;
                break;
            }

            if (countDotsInLine == SIZE) result = true;
        }

        // Проверяем горизонтальные линии
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == dot) countDotsInLine++;
            }
            if (countDotsInLine == SIZE) {
                result = true;
                break;
            } else countDotsInLine = 0;
        }


        // Проверяем вертикальные линии
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == dot) countDotsInLine++;
            }
            if (countDotsInLine == SIZE) {
                result = true;
                break;
            } else countDotsInLine = 0;
        }

        return result;
    }

}
