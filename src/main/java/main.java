public class main {


    public static void main(String[] args) {

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


        double cal = AreaCalculator.area(-1.0);
        double rec = AreaCalculator.area(2, 3);
        System.out.println("circle area " + cal);
        System.out.println("rec area " + rec);


        BankAccount bankAccount = new BankAccount(12345678,"althaf","althaf@gmail.com",1234567899,2000.0);
        System.out.println("Accountnumber  " +bankAccount.getAccountnumber());
        System.out.println("Customername  " +bankAccount.getCustomername());
        System.out.println("Email  " +bankAccount.getEmail());
        System.out.println("Phonenumber  " +bankAccount.getPhonenumber());
        System.out.println("Balance  " +bankAccount.getBalance());
        bankAccount.deposit(100.0);
        bankAccount.withdraw(50.0);


        DayOfTheWeekChallenge.printDayOfTheWeek(3);

//        boolean leapyear = NumberOfDaysiInMonth.isLeapYear(2000);
//        System.out.println(" leap year " + leapyear);


        NumberOfDaysiInMonth.getDaysInMonth(3,2000);



    }
}





