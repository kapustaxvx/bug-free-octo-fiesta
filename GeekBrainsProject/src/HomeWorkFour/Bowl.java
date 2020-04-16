package HomeWorkFour;

public class Bowl {

    private int volume;  // Объем миска
    private int foodMas;  // Количество еды в миске
    private boolean isFull;   // Полная ли миска
    private boolean isExist;


    public Bowl(int volume, int foodMas) {
        this.isExist = true;
        if (foodMas < 0) {
            isExist = false;
            System.err.println("Масса еды не может быть отрицательной");
        }
        if (volume <= 0) {
            System.err.println("Объем миски задан неверно");
            isExist = false;
        }
        if (isExist && foodMas < volume) {
            this.volume = volume;
            this.foodMas = foodMas;
            this.isFull = false;
        } else if (isExist && foodMas > volume) {
            System.err.println("Миска перепонена");
            this.volume = volume;
            this.foodMas = volume;
            this.isFull = true;
        } else if (isExist) {
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

    // Заполняем миску
    public void fillBowl() {
        if (!isFull) {
            if (getVolume() <= 0) setFull(false);
            else {
                setFull(true);
                setFoodMas(getVolume());
                System.out.println("Миска наполнена");
            }
        } else {
            System.out.println("В миске нет места");
        }

    }
}
