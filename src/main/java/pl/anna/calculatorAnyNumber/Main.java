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

        for(int i = 0; i<myListOfNumbers.size(); i++){
            while(!scanner.nextLine().equals("END")) {
                int newNumber = scanner.nextInt();
                myListOfNumbers.add(newNumber);
            }
        }

        myListOfNumbers.add(56);
        myListOfNumbers.add(7854);
        myListOfNumbers.add(85555);
        myListOfNumbers.add(8);
        myListOfNumbers.add(798);

        int theSum = calculator.sum(myListOfNumbers);
        System.out.println(theSum);
    }



}
