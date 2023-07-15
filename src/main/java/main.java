import oops.*;

import vehicle.Camry;

import inhertiance.*;

public class main {


    public static void main(String[] args) {


        Camry camry = new Camry(36);
        camry.accelerate(30);
        camry.accelerate(20);



        Animal animal=new Animal("animal",1,1,1,1);
        Dog dog = new Dog("ruffle",1,1,1,2,2,1,"silkey");

        dog.eat();
        dog.move(5);
        dog.run();
        dog.walk();

        long calc = speedconverter.tomilesperhour(12.5);
        System.out.println("caluction = " + calc);

        speedconverter.printconversion(10.5);

        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);

        boolean response = BarkingDog.shouldWakeUp(true, 2);
        System.out.println("response " + response);

        boolean year = LeapYearCalculator.isLeapYear(2000);
        System.out.println("response " + year);

        boolean compare = DecimalComparator.areEqualByThreeDecimalPlaces(1.2346, 2.334544);
        System.out.println("compare  " + compare);

        boolean sum = EqualSumChecker.hasEqualSum(2, 2, 4);
        System.out.println("sum checker " + sum);


        boolean teen = TeenNumberChecker.hasTeen(20, 25, 30);
        System.out.println("teen " + teen);

        boolean teen1 = TeenNumberChecker.isTeen(19);
        System.out.println("teen " + teen1);


        double cal= AreaCalculator.area(-1.0);
        double rec =AreaCalculator.area(2,3);
        System.out.println("circle area " + cal);
        System.out.println("rec area " + rec);
    }
}





