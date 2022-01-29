package com.endava.calculator;

import com.endava.calculator.basic.Basic;
import com.endava.calculator.basic.BasicOperations;
import com.endava.calculator.expert.Expert;
import com.endava.calculator.expert.ExpertOperations;
import org.junit.jupiter.api.*;

public class FactorialTest {
    private BasicOperations basicCalculator;
    private ExpertOperations expertCalculator;
    @BeforeAll
    public static void setUpAllTests(){
        System.out.println("\nBefore All");
    }

    @AfterAll
    public static void tearDownAllTests(){
        System.out.println("After all\n");
    }

    @BeforeEach
    public void setUpEachTest(){
        basicCalculator = new Basic();
        expertCalculator = new Expert();
        System.out.println("\nBefore Each");
    }

    @AfterEach
    public void tearDownEachTest(){
        System.out.println("After Each\n");
    }
    @Test
    public void shouldFactorialSeveralNumbers(){
        //When
        double result = expertCalculator.factRecursiv(5);
        //Then
        System.out.println(result);
    }

    @Test
    public void shouldFactorialOneOperand(){
        //When
        double result = expertCalculator.factRecursiv(1);
        //Then
        System.out.println(result);
    }

    @Test
    public void shouldFactorialWithZero(){
        //When
        double result = expertCalculator.factRecursiv(0);
        //Then
        System.out.println(result);
    }

}
