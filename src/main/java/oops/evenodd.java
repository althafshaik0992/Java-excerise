package oops;

import java.util.Scanner;

public class evenodd {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.close();

int  n=20;
        if (n%2!=0)
        {
            System.out.println(" wired");

        } else if (n % 2 == 0 && n > 2 && n < 5) {
            System.out.println("not wired ");

        }  else if (n % 2 == 0 && n > 6 && n < 20) {

            System.out.println(" wired");
        }

        else if (n % 2 == 0 && n >= 20) {
            System.out.println("not wired ");
        }
    }
}
