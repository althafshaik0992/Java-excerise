package vehicle;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Camry extends Car {

    private int roadServiceInMonths;

    public Camry(int roadServiceInMonths) {
        super("camry", "4wd", 4, 4, 4, false);
        this.roadServiceInMonths = roadServiceInMonths;
    }

    public void accelerate(int rate)  {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);

        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);

        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);

        } else {
            changeGear(4);
        }


        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
