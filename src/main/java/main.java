public class main {


    public static void main(String[] args) {

        long calc= speedconverter.tomilesperhour(12.5);
        System.out.println("caluction = " +calc);

       speedconverter.printconversion(10.5);

       MegaBytesConverter.printMegaBytesAndKiloBytes(2500);

      boolean response =  BarkingDog.shouldWakeUp(true,2);
        System.out.println("response " + response);

        boolean year=LeapYearCalculator.isLeapYear(2000);
        System.out.println("response " + year);

        boolean compare = DecimalComparator.areEqualByThreeDecimalPlaces(1.2346,2.334544);
        System.out.println("compare  " + compare);
    }

    }

