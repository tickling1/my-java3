package lang.wrapper;

public class AutoBoxingMain1 {

    public static void main(String[] args) {
        // Primitive Type -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        // Wrapper -> Primitive Type
        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
