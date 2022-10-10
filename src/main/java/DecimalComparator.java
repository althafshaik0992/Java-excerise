public class DecimalComparator {

    public static   boolean areEqualByThreeDecimalPlaces(double num1,double num2)
    {
        if (num1 <0 && num2>0 || num1 >0 && num2 <0){
            return false;
        }

        double firstThousand = num1*1000;
        double secondThousand = num2*1000;

        int firstint = (int)firstThousand;
        int secondint = (int)secondThousand;

        if (firstint==secondint){
            return true;
        }

        return false;

    }

}

