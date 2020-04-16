package HomeWorkFour;

public class Cat extends Animal {
    private int appetite;
    private String name;

    public void setFull(boolean full) {
        isFull = full;
    }

    public boolean isFull() {
        return isFull;
    }

    private boolean isFull = false;



    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }


    public Cat(){
        name = "";
        appetite = 10;
        maxHeight = 2.0;
        maxRunDistance = 200;
        isFull = false;
    }

    public Cat(String name, int appetite){
        isFull = false;
        maxRunDistance = 200;
        maxHeight = 2.0;
        this.appetite = appetite;
        this.name = name;
    }


    public void eat(Bowl bowl){
        if(getAppetite() < 0){
            System.err.println(getName() + " погиб от голода");
        } else if (getAppetite() <= bowl.getFoodMas()){
            System.out.println(getName() + " сытый");
            bowl.setFull(false);
            bowl.setFoodMas(bowl.getFoodMas() - getAppetite());
            /*if (!(getAppetite() <= bowl.getFoodMas())){
                System.out.println(getName() + " не покушал");
                System.out.println("Миска пуста");
                bowl.fillBowl();
                eat(bowl);
            }*/
            setFull(true);
            setAppetite(0);
        } else {
            System.out.println(getName() + " не покушал");
            System.out.println("Миска пуста");
            bowl.fillBowl();
        }
    }


    @Override
    public void swim(int swimDistance) {
        System.out.println("Котик не умеет плавать");
    }
}

