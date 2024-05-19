package program.excercise;

public class LeapYear {
    public static void main(String[] args) {


        int year = 2024;
        System.out.println(isLeapYear(year));
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }

}
