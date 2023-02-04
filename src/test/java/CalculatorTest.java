import org.junit.jupiter.api.*;
import org.sda.Calculator;

/**
 * Unit tests for Calculator
 *
 * @author Vinod John
 * @Date 04.02.2023
 */
public class CalculatorTest {
    Calculator calculator;

    @BeforeAll //Executed before all the methods in the class
    public static void globalSetup() {
        System.out.println("Inside Before All...");
    }

    @AfterAll //Executed after all the methods in the class
    public static void finishTests() {
        System.out.println("Test execution completed!");
    }

    @BeforeEach //Executed before every test case
    public void setup() {
        System.out.println("Starting test..");
        calculator = new Calculator();
    }

    @AfterEach //Executed after every test case
    public void finishTest() {
        System.out.println("Test execution done!");
    }

    @DisplayName("Test to check the addition of two numbers")
    @Test
    public void whenAddTwoNumbersCalled_shouldReturnValue() {
        float result = calculator.addTwoNumbers(3, 9);

        Assertions.assertAll(
                () -> Assertions.assertEquals(12, result),
                () -> Assertions.assertTrue(result == 12)
        );
    }

    @Disabled
    @Test
    public void whenMultiplyTwoNumbersCalled_shouldReturnValue(){
        float result = calculator.multiplyTwoNumbers(4, 5);
        Assertions.assertTrue(result == 20);
    }
}
