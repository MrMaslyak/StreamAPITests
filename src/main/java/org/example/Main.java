package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberManager  manager = new NumberManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введіть ціле число (або 'exit' для завершення): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                double number = Double.parseDouble(input);
                manager.addNumber((int) number);
            } catch (NumberFormatException e) {
                System.out.println("Невірний ввід. Будь ласка, введіть ціле число.");
            }
        }


        manager.printResults();
    }

}
