public class LeapYearCalculator {


    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {

            if (year % 4==0  && year % 100 == 0 && year % 400 == 0) {
                System.out.println("the year is leap year");
                return true;
            }
        }
        else
            System.out.println("the year is  not leap year");
        return false;
    }
}
