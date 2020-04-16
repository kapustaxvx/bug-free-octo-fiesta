package HomeWorkFive;

public class Bowl {

    private int volume;  // Объем миска
    private int foodMas;  // Количество еды в миске
    private boolean isFull;   // Полная ли миска


    public Bowl(int volume, int foodMas) {
        if (volume < 1) {
            System.err.println("Масса еды не может быть отрицательной или 0");
        } else if (foodMas < volume) {
            this.volume = volume;
            this.foodMas = foodMas;
            this.isFull = false;
        } else if (foodMas > volume) {
            System.err.println("Миска перепонена");
            this.volume = volume;
            this.foodMas = volume;
            this.isFull = true;
        } else {
            System.out.println("Миска полная");
            this.volume = volume;
            this.foodMas = foodMas;
            this.isFull = true;
        }


    }

    public Bowl() {   // Стандартная миска
        volume = 20;
        foodMas = 20;
        isFull = true;
    }

    public void setFoodMas(int foodMas) {
        this.foodMas = foodMas;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public boolean isFull() {
        return isFull;
    }

    public int getFoodMas() {
        return foodMas;
    }


    public int getVolume() {
        return volume;
    }

    public void eatFromBowl (int foodAppetite){
        if (foodAppetite > foodMas) {
            System.out.println("В миске недостаточно еды");
            setFull(false);
        } else {
            foodMas -= foodAppetite;
        }
    }

    public boolean checkFoodFor (int foodAppetite){
        return foodAppetite <= foodMas;
    }

    // Заполняем миску
    public void fillBowl() {
        if (!isFull) {
                setFull(true);
                setFoodMas(getVolume());
                System.out.println("Миска наполнена.");
                info();
        } else {
            System.out.println("В миске нет места");
        }
    }



    public void info(){
        System.out.println("Количество еды в миске "+
                + getFoodMas() + " Миска полная: " + isFull());
    }
}
