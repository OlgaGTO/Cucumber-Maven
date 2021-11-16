package com.bdd;

// import java.util.Scanner;

public class FizzBuzz {
    /*
    public static void main(String[] args){
        Scanner readNumber = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = readNumber.nextInt();
        String fizzBuzzResult = play(number);
        System.out.println(fizzBuzzResult);
    } */
    public String play(int number) {
        if (number % 3 == 0) {  //restul impartirii la 3.
            if (number % 5 == 0) {
                return "fizzbuzz";
            } else {
                return "fizz"; }
        } else if (number % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(number); }
}
