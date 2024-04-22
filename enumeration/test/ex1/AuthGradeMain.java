package enumeration.test.ex1;

public class AuthGradeMain {

    public static void main(String[] args) {

        AuthGrade[] authGrades = AuthGrade.values();

        for (AuthGrade authGrade : authGrades) {
            System.out.println("grade = " + authGrade.name() + ", level = " + authGrade.getLevel() + ", description = " + authGrade.getDescription());
        }
    }
}
