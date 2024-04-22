package time.test;

import java.time.LocalDate;

public class TestLoopPlus {

    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2024, 1, 1);

        for (int i = 0; i < 5; i++) {
            LocalDate nextDate = startDate.plusWeeks(i * 2);
            System.out.println("날짜 " + (i * 2) + "주 후: " + nextDate);
        }
    }
}
