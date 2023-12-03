package org.asia;

public class Calculator {
    private Integer number1;
    private Integer number2;

    public Calculator(Integer number1, Integer number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Integer getNumber1() {
        return number1;
    }

    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    public Integer getNumber2() {
        return number2;
    }

    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }

    public Integer addNumbers(){
        return number1+number2;
    }

    public Integer subtractNumbers(){
        return number1-number2;
    }

    public Integer multiplyNumbers(){
        return number1*number2;
    }

    public Float divideNumbers(){
        return ((float)number1/(float)number2);
    }

    public Integer powerNumbers(){
        return (int) Math.pow(number1,number2);
    }

    /**
     * Daje a bo tak
     * @param a nie wiem
     * @param b tez nie wiem
     * @return a
     */
    public Integer adam(Integer a, Integer b){
        return a;
    }
}
