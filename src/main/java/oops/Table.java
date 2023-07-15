package oops;

import java.io.*;

import static java.util.stream.Collectors.joining;


public class Table {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();


//        int n = 2;
       int i;


        for (i = 1; i <= 10; i++) {
           int result = n*i;



            System.out.println(n + "*" +i +"= "+(result));


        }
    }


}

