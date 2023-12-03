package org.asia;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void calculatorAddTest(){
        Calculator Steve = new Calculator(1,2);
        assertEquals(3,Steve.addNumbers());
    }
    @Test
    public void calculatorPowerTest(){
        Calculator Roger = new Calculator(2,3);
        assertEquals(8,Roger.powerNumbers());
        Roger.adam(2,3);
    }
}
