package lang.string.chaining;

public class MethodChainingMain3 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();

        int result = adder.add(1).add(2).add(3).getValue();
        // int result = adder.x001(1).x001(2).add(3).getValue();
        System.out.println("result = " + result);
    }
}
