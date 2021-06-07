package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choise;
        double fahrenheit;
        double celsius;
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU.");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit ");
        System.out.printf("Enter your choise: ");
        choise = scanner.nextInt();

        if (choise == 0) {
            System.out.printf("No choise");
        }
        if (choise == 1) {
            System.out.printf("Enter a Fahrenheit: ");
            fahrenheit = scanner.nextDouble();
            System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
        }
        if (choise == 2) {
            System.out.printf("Enter a Celsius: ");
            celsius = scanner.nextDouble();
            System.out.println("Celsius to fahrenheit: " + celsiusToFahrenheit(celsius));
        }
    }

    public static double fahrenheitToCelsius(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double celsiusToFahrenheit(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
