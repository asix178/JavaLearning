package org.asia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor //generuje knstruktor bezargumentowy
public class Calculator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bulbulatorStefan;
    private Integer number1;
    private Integer number2;


    public Calculator(Integer number1, Integer number2) {
        this.number1 = number1;
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
