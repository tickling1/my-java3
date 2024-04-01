package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        //int result = addValue + value;
        //ImmutableObj immutableObj = new ImmutableObj(result);
        //return new ImmutableObj(result);
        return new ImmutableObj(addValue + value);
    }
    public int getValue() {
        return value;
    }
}
