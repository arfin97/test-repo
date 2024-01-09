package zoo;

public class Dog extends Animal{
    private int tail;

    private Animal animal;

    private Sound sound;

    public Dog(int legs, int eyes, int tail, Sound sound) {
        this.tail = tail;
        this.sound = sound;
    }
    public String toString() {
        String superString = super.toString();
        return superString + " " + "Dog [tail=" + tail + ", sound=" + sound + "]";
    }

    @Override
    public void move() {
        System.out.println("Dog is running");
    }

}
