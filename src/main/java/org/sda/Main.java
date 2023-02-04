package org.sda;

/**
 * Main class
 *
 * @author Vinod John
 * @Date ${DATE}
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        float result = calculator.addTwoNumbers(3.5f, 5);
        System.out.println(result);
    }
}