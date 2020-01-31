package com.leandro.it;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciFunctionTest {

    @Test
    void fibonacciNumberLessThan0() {
        FibonacciFunction fibonacciNumber = new FibonacciFunction();

        int inputNumber;
        inputNumber = fibonacciNumber.fibonacciN(-1);

        assertEquals(-1, inputNumber);
    }

    @Test
    void fibonacciNumberEqual0() {
        FibonacciFunction fibonacciNumber = new FibonacciFunction();

        int inputNumber;
        inputNumber = fibonacciNumber.fibonacciN(0);

        assertEquals(0,inputNumber);
    }

    @Test
    void fibonacciFuntion() {
        FibonacciFunction fibonacciNumber = new FibonacciFunction();

        int inputNumber;
        inputNumber = fibonacciNumber.fibonacciN(6);

        System.out.println(inputNumber);
    }
}