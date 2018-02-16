package pl.anna.calculatorAnyNumber;

import java.util.List;

public class Calculator {
    private List<Integer> numbers;

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void addNumber(Integer x){
        numbers.add(x);
    }

    public int sum(){
        int cumulativeNumbers = 0;
        for(int i = 0; i<numbers.size(); i++){
            cumulativeNumbers += numbers.get(i);
        }
        return cumulativeNumbers;
    }
}
