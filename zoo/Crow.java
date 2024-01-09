package zoo;

public class Crow extends Animal{
    private int wings;
    private Sound sound = new Sound(3, 4, 5);


    public Crow(int wings, Sound sound) {
        this.wings = wings;
        this.sound = sound;
    }

    public String toString() {
        return "Crow [wings=" + wings + ", sound=" + sound + "]";
    }


    @Override
    public void move() {
        System.out.println("Crow is flying");
    }

}
