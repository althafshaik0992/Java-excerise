package oops;

import java.util.Scanner;

public class Intdouble {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
//        int i= 100 ;
//        Double d = 42.0;
//        String s= "42 is the answer to life, the universe, and everything!";

        //scan.close();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}