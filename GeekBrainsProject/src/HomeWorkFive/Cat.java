package HomeWorkFive;


public class Cat extends Animal {
    private int appetite;
    private final String name;
    private boolean isFull;

    public void setFull(boolean full) {
        isFull = full;
    }

    public boolean isFull() {
        return isFull;
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }


    public Cat() {   // Стандартный котик
        name = "Бездомный котик";
        appetite = 10;
        maxHeight = 2.0;
        maxRunDistance = 200;
        isFull = false;
    }

    public Cat(String name, int appetite) {   // Определенный котик
        if (appetite > 0) isFull = false;
        else isFull = true;
        maxRunDistance = 200;
        maxHeight = 2.0;
        this.appetite = appetite;
        this.name = name;
    }


    // Метод кормящий кота, пока он голоден.
    // Если котик голоден и в миске не хватает еды
    //  она наполняется, после чего ему дается возможность поесть заново
    public void eat(Bowl bowl) {

        if (isFull) System.out.println(getName() + " сытый.");
        else if (bowl.checkFoodFor(getAppetite())) {
            System.out.println(getName() + " покушал.");
            bowl.eatFromBowl(getAppetite());
            setFull(true);
        } else {
            System.out.println(getName() + " не покушал.");
            System.out.println("Миска пуста");
            bowl.fillBowl();
           // eat(bowl);
        }
    }


    @Override
    public void swim(int swimDistance) {
        System.out.println("Котик не умеет плавать");
    }
}

