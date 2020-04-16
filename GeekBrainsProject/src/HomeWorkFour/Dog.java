package HomeWorkFour;

public class Dog extends Animal{

    public Dog(){
        maxRunDistance = 500;
        maxHeight = 0.5;
        maxSwimDistance = 10;
    }

    public Dog(int maxRunDistance){
        this.maxRunDistance = maxRunDistance;
        maxHeight = 0.5;
        maxSwimDistance = 10;
    }


    public Dog(int maxRunDistance, double maxHeight, int maxSwimDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxHeight = maxHeight;
        this.maxSwimDistance = maxSwimDistance;
    }

}
