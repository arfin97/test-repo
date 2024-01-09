package zoo;

public class Sound {
    private int loudness;
    private int bass;

    private int treble;

    private int legs;

    public Sound(int loudness, int bass, int treble) {
        this.loudness = loudness;
        this.bass = bass;
        this.treble = treble;
    }

    public String toString() {
        return "Sound [loudness=" + loudness + ", bass=" + bass + ", treble=" + treble + "]";
    }
}
