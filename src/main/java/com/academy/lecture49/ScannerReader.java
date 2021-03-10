package com.academy.lecture49;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j


public class ScannerReader {

    public static void readFromConsole() {
        String string = new Scanner(System.in).nextLine();
        try {
            int i = Integer.parseInt(string);
            log.info("Your entered valid number: " + i);
        } catch (NumberFormatException nfe) {
            log.error("The entered string is not a valid number");
        }
    }
}
