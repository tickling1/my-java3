package lang.object.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //ToString() 반환 값 출력
        System.out.println(string);

        //object 직접 출력
        System.out.println(object);
    }
}
