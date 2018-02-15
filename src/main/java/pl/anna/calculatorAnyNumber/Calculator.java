package pl.anna.calculatorAnyNumber;

import java.util.List;

public class Calculator {
    private List<Integer> numbers;
    private int numberToAdd;

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void addNumber(){
        numbers.add(numberToAdd);
    }

    public int sum(List<Integer> numbers){
        int cumulativeNumbers = 0;
        for(int i = 0; i<numbers.size(); i++){
            cumulativeNumbers += numbers.get(i);
        }
        return cumulativeNumbers;
    }
}
