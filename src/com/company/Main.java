package com.company;

import java.util.Scanner;

public class Main {

    static void guessNumberOneTime(int guessedNumber, int number) {
        if (guessedNumber == number) {
            System.out.println("You have guessed the number is " + guessedNumber);
        } else if (guessedNumber > number) {
            System.out.println("Your number is too high");
        } else {
            System.out.println("Your number is too low");
        }
    }

    static void randomizer(int number) {
        int guessedNumber = -1;
        Scanner input = new Scanner(System.in);
        while (guessedNumber != number) {
            System.out.print("Enter your guess 0 to 100: ");
            guessedNumber = input.nextInt();
            guessNumberOneTime(guessedNumber, number);
        }
    }

    static void looper() {
        Scanner input = new Scanner(System.in);
        int number, max;
        number = input.nextInt();
        max = number;
        while (number != 0) {
            number = input.nextInt();
            if (number > max) {
                max = number;
            }
            System.out.println("max is " + max);
            System.out.println("number is " + number);
        }
    }

    static void doer() {
        int data;
        int sum = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter an integer (0 ends it): ");
            data = input.nextInt();
            sum += data;
        } while (data != 0);

        System.out.println("The sum is " + sum);
    }

    static void multiplication() {
        System.out.println(" ");
        System.out.print("   ");

        // display list
        for (int j = 1; j <= 9; j++) {
            System.out.print("    " + j);
        }
        System.out.println("\n -----------------------------------------------");

        //display body
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");

            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d ", i * j);
            }
            System.out.println();
        }
    }

    static void gcd() {
        Scanner input = new Scanner(System.in);

        // Enter 2 integers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        int gcd = 1;
        int k = 2;

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            k++;
        }
        System.out.println("The gcd is " + gcd);

    }

    static void breaker() {

        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            sum += number;
            if (sum >= 100) {
                break;
            }
        }

        System.out.println("The number is " + number);
        System.out.println("The number is " + sum);

    }

    static void continuer() {

        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            if (number == 10 || number == 11) {
                continue;
            }
            sum += number;
        }

        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);

    }

    public static void main(String[] args) {
//        int number = (int) (Math.random() * 101);
//        randomizer(number);
//        looper();
//        doer();
//        multiplication();
//        gcd();
//        breaker();
        continuer();

    }
}
