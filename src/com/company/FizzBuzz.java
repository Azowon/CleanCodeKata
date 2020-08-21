package com.company;

public class FizzBuzz {

    /**
     * CleanCodeKata by David Schweizer
     * Requirements by https://codingdojo.org/kata/FizzBuzz/
     *
     */

    public static void main(String[] args) {
        new FizzBuzz().circle();
    }

    public void circle() {

        for(int i = 0; i <= 100; i++) {

            boolean isNumber = true;

            if(checkNumber(i, 3)) {
                System.out.print("Fizz");
                isNumber = false;
            }
            if(checkNumber(i, 5)) {
                System.out.print("Buzz");
                isNumber = false;
            }
            if(isNumber)
                System.out.print(i);
            System.out.println();
        }

    }

    private boolean checkNumber(int givenNumber, int searchNumber) {

        if(givenNumber % searchNumber == 0)
            return true;

        String numberAsString = givenNumber+"";

        for(int i = 0; i < numberAsString.length(); i++ ) {
            if(numberAsString.charAt(i) == Character.forDigit(searchNumber, 10))
                return true;
        }
        return false;
    }
}