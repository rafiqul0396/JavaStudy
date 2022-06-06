package com.company.ScannerInput;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner obj to read System input
        String inputTaken = "";
        while (true) {
            String input = scanner.nextLine(); // reading one line of input
            if (input.matches("\\s+")) // if it matches spaces/tabs, stop reading
                break;
            inputTaken += input + " ";
        }
        System.out.println(inputTaken);
    }
}
