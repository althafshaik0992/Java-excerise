package oops;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking == true && hourOfDay > 1 || hourOfDay < 22) {
            if (barking == true && hourOfDay < 0 || hourOfDay < 22) {
                return true;
            } else {
                return false;
            }
        } else
            return false;


    }
}
