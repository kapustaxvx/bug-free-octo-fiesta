package HomeWorkFour;

public abstract class Animal {
    protected int maxRunDistance;
    protected double maxHeight;
    protected int maxSwimDistance;


    public void run(int runDistance){
        if (runDistance <= 0) {
            System.err.println("Значение должно быть положительным");
        } else if (runDistance <= maxRunDistance) {
            System.out.println("run: " + true);
        } else System.out.println("run: " + false);
    }

    public void swim(int swimDistance){
        if (swimDistance <= 0) {
            System.err.println("Значение должно быть положительным");
        } else if (swimDistance <= maxSwimDistance) {
            System.out.println("swim: " + true);
        } else System.out.println("swim: " + false);
    }

    public void jump(double height){
        if (height <= 0) {
            System.err.println("Значение должно быть положительным");
        } else if (height <= maxHeight) {
            System.out.println("jump: " + true);
        } else System.out.println("jump: " + false);
    }
}
