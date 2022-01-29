package com.endava.calculator;

import com.endava.calculator.basic.Basic;
import com.endava.calculator.basic.BasicOperations;
import com.endava.calculator.expert.Expert;
import com.endava.calculator.expert.ExpertOperations;
import org.junit.jupiter.api.*;

public class MultiplyTest {
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
    public void shouldMultiplyAnOperandWithOne(){
        //When
        int result = (int) basicCalculator.multiply(2,1);
        //Then
        System.out.println(result);
    }

    @Test
    public void shouldMultiplyPositiveAndNegativeOperands(){
        //When
        int result = (int) basicCalculator.multiply(-4,2);
        //Then
        System.out.println(result);
    }
    @Test
    public void shouldMultiplyNegativesOperands(){
        //When
        int result = (int) basicCalculator.multiply(-3,-2);
        //Then
        System.out.println(result);
    }
    @Test
    public void shouldMultiplyWithZero(){
        //When
        int result = (int) basicCalculator.multiply(3,0);
        //Then
        System.out.println(result);
    }
    @Test
    public void shouldMultiplySeveralOperands(){
        //When
        int result = (int) basicCalculator.multiply(3,2,4,-2);
        //Then
        System.out.println(result);
    }
    @Test
    public void shouldMultiplyBigOperands(){
        //When
        int result = (int) basicCalculator.multiply(Integer.MAX_VALUE, 2);
        //Then
        System.out.println(result);
    }
}
