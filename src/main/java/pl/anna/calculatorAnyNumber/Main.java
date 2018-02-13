package pl.anna.calculatorAnyNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        int number =  calculator.getNumber();

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();


    }

}
