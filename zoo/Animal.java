package zoo;

public abstract class Animal{
    private int legs;
    private int eyes;

    public String toString() {
        return "Animal [legs=" + legs + ", eyes=" + eyes + "]";
    }
    public static String hello() {
        return "Hello from Crow";
    }

    public abstract void move();

}
