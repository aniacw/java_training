package pl.anna.calculator;

public class Main {
    public static void main(String[] args){

        Calculator calculator = new Calculator();
        calculator.setNumber1(-55);
        calculator.setNumber2(23);

        int sum = calculator.sum();
        System.out.println("Summed:" + sum);

        int subtract = calculator.subtract();
        System.out.println("Subtracted: " + subtract);

        double divide = calculator.divide();
        System.out.println("Divided " + divide);

        int multiply = calculator.multiply();
        System.out.println("Multiplied " + multiply);

        CalculatorDouble calculatorDouble = new CalculatorDouble();
        calculatorDouble.setD1(12.4);
        calculatorDouble.setD2(4.5);

        double sumDouble = calculatorDouble.sumDouble();
        System.out.println("Summed: " + sumDouble);

        double subtractDouble = calculatorDouble.subtractDouble();
        System.out.println("Subtracted: " + subtractDouble);

        double divideDouble = calculatorDouble.divideDouble();
        System.out.println("Divided: " + divideDouble);

        double multiplyDouble = calculatorDouble.multiplyDouble();
        System.out.println("Multiplied: " + multiplyDouble);
    }
}
