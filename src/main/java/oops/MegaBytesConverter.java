package oops;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megabytes = Math.round(kiloBytes/1024);

            int remainingkilobytes = kiloBytes%1024;

            System.out.println(kiloBytes + " KB "
                    + " = " + megabytes+ " MB " + remainingkilobytes +" KB");
        }


    }
}