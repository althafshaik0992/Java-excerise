public class NumberOfDaysiInMonth {


    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            int leap = year / 400;

            System.out.println(" year " + year);
            return true;
        } else
            return false;

    }

    public static void  getDaysInMonth(int month, int year) {

         int days=0;
        if (year < 1 && year > 9999) {
            System.out.println("" + -1);
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12: {
               days=31;
            }
            break;
            case 2: {
                if (month == 2) {
                    isLeapYear(year);
                    days=28;
                } else
                    days=29;
            }break;
            case 4:
            case 6:
            case 9:
            case 8:
            case 11: {
                days = 30;
            }
            break;
            default: {
                if (month < 1 && month > 12) {
                    System.out.println("" + -1);
                }
            }
        }

    }
}

