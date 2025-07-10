package String;

public class ValueAdd {

    private int value;

    public ValueAdd add(int value) {
        this.value += value;
        return this;
    }

    public int getValue() {
        return value;
    }
}