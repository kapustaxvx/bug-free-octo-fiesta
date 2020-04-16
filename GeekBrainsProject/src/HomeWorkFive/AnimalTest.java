package HomeWorkFive;


public class AnimalTest {
    public static void main(String[] args) {

        Bowl bowl = new Bowl(20, 4);
        System.out.println("Количество еды в миске " +
                +bowl.getFoodMas() + " Миска полная: " + bowl.isFull());

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Барсик", 4);
        cats[1] = new Cat("Коржик", 3);
        cats[2] = new Cat("Василек", 7);
        cats[3] = new Cat("Мурка", 5);
        cats[4] = new Cat("Петр", 4);

        for (Cat cat : cats) {
            cat.eat(bowl);
            if (!cat.isFull()) cat.eat(bowl);
            bowl.info();
        }

    }
}
