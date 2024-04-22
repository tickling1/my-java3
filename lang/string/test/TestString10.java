package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruit = "apple,banana,mango";

        String[] fruits = fruit.split(",");
        for (String s : fruits) {
            System.out.println(s);
        }
        String joinedString = String.join("->", fruits);
        System.out.println("joinedString = " + joinedString);
    }
}
