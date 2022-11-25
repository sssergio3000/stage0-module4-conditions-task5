package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("leap");
        } else {
            System.out.println("not leap");
        }
//        System.out.println(year % 4 == 0 && year%100 !=100 && year % 400 ? "leap" : "not leap");
    }
}
