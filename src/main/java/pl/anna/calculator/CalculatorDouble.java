package pl.anna.calculator;

public class CalculatorDouble extends Calculator {

    double d1 = (double) getNumber1();
    double d2 = (double) getNumber2();

    public CalculatorDouble(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    public CalculatorDouble() {
    }

    public double getNumberD1() {
        return this.d1;
    }

    public double getNumberD2() {
        return this.d2;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    public double sumDouble() {
        return d1 + d2;
    }

    public double subtractDouble() {
        return d1 - d2;
    }

    public double divideDouble(){
        return  d1 / d2;
    }
     public double multiplyDouble(){
        return d1 * d2;
     }

}
