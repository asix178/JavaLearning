package org.asia;

public class Main {
    public static void main(String[] args) {

        Calculator Jake = new Calculator(2,3);
        System.out.println("Add: "+Jake.addNumbers());
        System.out.println(Jake.subtractNumbers());
        System.out.println(Jake.divideNumbers());
        System.out.println(Jake.multiplyNumbers());
        System.out.println(Jake.powerNumbers());
    }
}