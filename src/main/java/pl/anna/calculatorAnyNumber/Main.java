package pl.anna.calculatorAnyNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        List<Integer> myListOfNumbers = new ArrayList<>();
        System.out.println("Type your numbers...");
        Scanner scanner = new Scanner(System.in);

        Integer readedNumber = 1;
        while(readedNumber!=0) {
                readedNumber = scanner.nextInt();
                myListOfNumbers.add(readedNumber);
            }
        calculator.setNumbers(myListOfNumbers);
        int theSum = calculator.sum();
        System.out.println(theSum);
    }



}
