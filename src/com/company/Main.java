package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input;
        do {

            System.out.println("Enter an integer: "); //prompt
            Scanner scan = new Scanner(System.in); //Init scan
            int topNum = scan.nextInt();
            scan.nextLine();
            int i;

            for (i = 0; i <= topNum; i++) {
                if (i == 0) {
                    System.out.println("Number  Squared Cubed");
                    System.out.println("======  ======= ======");
                } else {
                    System.out.printf("%d      %d      %d\n", i, (i * i), (i * i * i));
                }
            }
            System.out.println("Continue? (y/n): ");
            input = scan.nextLine();

        } while (input.equalsIgnoreCase("y"));
    }
}
