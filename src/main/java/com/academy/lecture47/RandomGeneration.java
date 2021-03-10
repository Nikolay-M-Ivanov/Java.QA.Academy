package com.academy.lecture47;

import java.util.Random;

public class RandomGeneration {

    private static final String CAPITAL_LETTERS = "QWERTYUIOP";
    private static final String SMALL_LETTERS = "qwertyuio";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()_+";

    Random random = new Random();

    public void generateRandomPassword(){
        StringBuilder password = new StringBuilder();

        // Generate two random CAPTIAL letters
        for (int i = 1; i <=2; i++){
            char generatedChar = generateChar(CAPITAL_LETTERS);
            insertRandomPosition(password, generatedChar);
        }
        // Generate two random small letters
        for (int i = 1; i <=2; i++){
            char generatedChar = generateChar(SMALL_LETTERS);
            insertRandomPosition(password, generatedChar);
        }
        // Generate two random digits
        for (int i = 1; i <=2; i++){
            char generatedChar = generateChar(DIGITS);
            insertRandomPosition(password, generatedChar);
        }
        // Generate two random special chars
        for (int i = 1; i <=2; i++){
            char generatedChar = generateChar(SPECIAL_CHARS);
            insertRandomPosition(password, generatedChar);
        }
        System.out.println("Generated password is: " + password);
    }

    private void insertRandomPosition(StringBuilder password, char generatedChar) {
        int randomPosition = random.nextInt(password.length() + 1);
        password.insert(randomPosition, generatedChar);
    }

    private char generateChar(String availableChars) {
        int randomIndex = random.nextInt(availableChars.length());
        return availableChars.charAt(randomIndex);
    }


    public void toto5from35Generation() {
        for (int num = 1; num <= 5; num++) {
            int randomNumber = random.nextInt(35) + 1;
            System.out.println("Number is: " + randomNumber);
        }
    }

    public void randomNumberBetweenRange(int min, int max){
        int number = random.nextInt(max - min) + min;
        System.out.println("Number between range: " + number);
    }
}
