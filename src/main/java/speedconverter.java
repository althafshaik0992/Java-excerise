public class speedconverter {

    public static long tomilesperhour(double kilometerperhour) {


        if (kilometerperhour < 0) {
            return -1;
        }
        return Math.round(kilometerperhour / 1.609);
    }


    public static void printconversion(double kilometerperhour)
    {
                 if (kilometerperhour <0)
                 {
                     System.out.println("invlaid value ");

                 }else
                 {
                     long  milesperhour=tomilesperhour(kilometerperhour);
                     {
                         System.out.println(kilometerperhour + " km/h"
                                           + " = " + milesperhour + " mi/h");
                     }
                 }
    }
    }




