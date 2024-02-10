package pl.touk.sputnik;

public class NewAlgorithm {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two numbers (integer division)
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    // Method to calculate the remainder of dividing two numbers
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot calculate modulo by zero");
        }
        return a % b;
    }
}