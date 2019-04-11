import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Agega on 1/12/16.
 */

public class AddTwoValuesTests {

    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }

    @Test
    public void testAddTwoPositiveValues() {
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddTwoNegativeValues() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }

    //TODO
    //add new tests for add() method
    @Test
    public void testAddTwoValues() { assertEquals("112 + 3 must be 115", 115, calc.add(112, 3)); }

    //TODO
    //add tests for new methods
    @Test
    public void multiplyAB(){ assertEquals("2 * 3 must be 6", 6, calc.multiply(2, 3));}
    //division Tests
    @Test
    public void testDivisionTwoValues() {assertEquals("12 / 3 must be 4", 4.0, calc.division(12, 3));}

    @Test
    public void divisionByZero() {
        String mesageError = "";
        try {
            calc.division(12, 0);
        } catch (ArithmeticException e) {
            mesageError = e.getMessage();
        }

            assertEquals("12 / 0 must be ", "/ by zero", mesageError);
        }

    //substration
    @Test
    public void testSubstration() {assertEquals("20 - 10  must be 10", 10, calc.substrationAB(20, 10));}

    //squareRoot
    @Test
    public void testSQRT() {assertEquals("144  must be 12", 12.0, calc.squareRootA(144));}

    //x*2
    @Test
    public void testPOV() {assertEquals("3 pov 2   must be 6", 9.0, calc.pov(3, 2));}

    //
    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!!");

    }
}
