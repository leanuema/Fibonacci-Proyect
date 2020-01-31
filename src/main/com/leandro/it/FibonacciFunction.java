package com.leandro.it;

import exceptions.InvalidNumberException;

public class FibonacciFunction {

    int n;

    public FibonacciFunction() {

    }

    public int fibonacciN(int n) {

        if (n < 0) {
            throw new InvalidNumberException(n + " is an invalid number");

        } else if (n <= 2 && n >= 0) {
            return 1;

        } else {
            return fibonacciN(n - 1) + fibonacciN(n - 2);
        }
    }
}
