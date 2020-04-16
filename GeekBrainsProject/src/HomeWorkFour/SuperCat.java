package HomeWorkFour;

public class SuperCat extends Cat {
    public SuperCat(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
        maxHeight = 2.0;
    }

    public SuperCat(int maxRunDistance, double maxHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxHeight = maxHeight;
    }
}
