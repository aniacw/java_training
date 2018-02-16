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

        while(scanner.nextInt()!=0) {
                int newNumber = scanner.nextInt();
                myListOfNumbers.add(newNumber);
            }

        int theSum = calculator.sum(myListOfNumbers);
        System.out.println(theSum);
    }



}
