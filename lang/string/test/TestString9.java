package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] strings = email.split("@");
        System.out.println("ID: ".concat(strings[0]));
        System.out.println("Domain: ".concat(strings[1]));
    }
}
