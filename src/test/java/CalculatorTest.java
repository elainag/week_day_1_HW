import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void whenCalculatorIsReadyReturnTrue(){
        assertTrue(calculator.getStatus());
    }

    @Test
    public void whenAddingTwoNumbersWeReturnTheCorrectAnswer() {
        assertEquals(10, calculator.add(7,3));
    }

    @Test
    public void whenSubtractingOneNumberFromAnotherReturnTheCorrectAnswer() {
        assertEquals(4, calculator.subtract(15,11));
    }

    @Test
    public void whenMultiplyingTwoNumbersWeReturnTheCorrectAnswer() {
        assertEquals(35, calculator.multiply(7,5));
    }

    @Test
    public void whenDividingOneNumberFromAnotherReturnTheCorrectAnswer() {
        assertEquals(12, calculator.divide(144,12));
    }
}
