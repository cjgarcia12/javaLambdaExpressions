package org.example;

import java.util.function.*;

public class Main {

    @FunctionalInterface
    interface MathOperation {
        double operation(double a, double b);
    }

    @FunctionalInterface
    interface Counter {
        void countTo(int target);
    }

    public static void main(String[] args) {
        // Task 1: Simple Lambda Expressions
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        System.out.println("Addition: " + add.operation(1, 2));
        System.out.println("Subtraction: " + subtract.operation(1, 2));
        System.out.println("Multiplication: " + multiply.operation(1, 2));
        System.out.println("Division: " + divide.operation(1, 2));

        // Task 2: Lambda Expressions with Custom Functional Interfaces
        Counter count = (a) -> {
            for (int i = 0; i <= a; i++) {
                System.out.println(i);
            }
        };
        count.countTo(8);

        // Task 3: Lambda Expressions with Built-in Functional Interfaces
        // Predicate
        Predicate<Integer> isEven = (a) -> a % 2 == 0;
        System.out.println("Is 2 even? " + isEven.test(2));

        // Function
        Function<String, String> addHey = (str) -> str + " hey";
        System.out.println(addHey.apply("blah"));

        // Consumer
        Consumer<String> printString = (str) -> System.out.println(str);
        printString.accept("hey");

        // Supplier
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random Value: " + randomValue.get());

        // BinaryOperator
        BinaryOperator<Integer> multiplyNumbers = (a, b) -> a * b;
        System.out.println("Multiplication of 3 and 5: " + multiplyNumbers.apply(3, 5));
    }
}
