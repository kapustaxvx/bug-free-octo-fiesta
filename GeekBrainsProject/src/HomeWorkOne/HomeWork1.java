package HomeWorkOne;

public class HomeWork1 {
    public static void main(String[] args) {

        String string = "String";
        byte b = 3;
        short sh = 100;
        char ch = 'c';
        int i = 5000;
        long l = 6000L;
        float f = 4.5f;
        double d = 7.55;
        boolean bool = false;


        double task3 = task3(3,6,7,0);
        System.out.println(task3);

        boolean task4 = task4(4,5);
        System.out.println(task4);

        task5(-1);

        boolean task6 = task6(-6);
        System.out.println(task6);


        task7("Bob");

        task8(1998);

        task9();
    }


    // Метод вычисляющий варажение a * (b + (c / d))

    static double task3(double a, double b, double c, double d){
        return a * (b + (c / d));
    }

    // Метод проверяющий что сумма входящих чисел находится в пределах от 10 до 20

    static boolean task4(int a, int b){
        int sum = a + b;
        return ((sum >= 10) && (sum <= 20));
    }

    // Метод который выводит в консоль, положительное или отрицательное число ему передали

    static void task5(int a){
        String val = (a < 0) ? "Число " +  a + " отрицательное." : "Число "
                 + a + " положительное.";
        System.out.println(val);
    }

    // Метод возвращает true если переданное в него число отрицательное.

    static boolean task6(int a){
        return (a < 0);
    }

    // Метод выводит в консоль приветствие с переданной ему строкой

    static void task7(String name){
        System.out.println("Привет, " + name + "!");
    }

    // Метод который определяет високосный ли год введен или нет

    static void task8(int year){
        if (((year % 4 ==0) && !(year % 100 == 0) || (year % 400 == 0)))
            System.out.println(year + " год високосный");
        else
            System.out.println(year + " год не високосный");
    }

    // Ответ на вопрос 9го задания

    static void task9(){
        System.out.println("Это две разные сигнатуры одного метода (перегрузка метода)");
    }




}
