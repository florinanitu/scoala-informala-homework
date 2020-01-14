import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void getMax() {
        Calculator c = new Calculator(1, 2, 3);
        Integer max = c.getMax();
        assertEquals(max, 3);
    }

    @Test
    void getMaxNegative() {
        Calculator c = new Calculator(1, 2, -3);
        Integer max = c.getMax();
        assertEquals(max, 2);
    }

    @Test
    void getMaxWithEqualValues() {
        Calculator c = new Calculator(2, 2, 2);
        Integer max = c.getMax();
        assertEquals(max, 2);
    }

    @Test
    void isAEvenWithOddNumber() {
        Calculator c = new Calculator(1, 2, 3);
        boolean isAEven = c.isAEven();
        assertFalse(isAEven);
    }

    @Test
    void isAEvenWithEvenNumber() {
        Calculator c = new Calculator(2, 2, 3);
        boolean isAEven = c.isAEven();
        assertTrue(isAEven);
    }

    @Test
    void isAEvenWithNegtiveNumber() {
        Calculator c = new Calculator(-2, 2, 3);
        boolean isAEven = c.isAEven();
        assertTrue(isAEven);
    }

    @Test
    void getMin() {
        Calculator c = new Calculator(2, 4, 6);
        Integer min = c.getMin();
        assertEquals(min, 2);
    }

    @Test
    void getMinWithNegativeValue() {
        Calculator c = new Calculator(-2, 4, 6);
        Integer min = c.getMin();
        assertEquals(min, -2);
    }

    @Test
    void getMinWithEqualValues() {
        Calculator c = new Calculator(7, 7, 7);
        Integer min = c.getMin();
        assertEquals(min, 7);
    }

    @Test
    void getSumWithNegativeValue() {
        Calculator c = new Calculator(-2, 7, 8);
        Integer sum = c.getSum();
        assertEquals(sum, 13);
    }

    @Test
    void getSum() {
        Calculator c = new Calculator(1, 2, 3);
        Integer sum = c.getSum();
        assertEquals(sum, 6);

    }

    @Test
    void getSumWithSameValues() {
        Calculator c = new Calculator(1, 1,1);
        Integer sum = c.getSum();
        assertEquals(sum, 3);

    }

    @Test
    void getAverage() {
        Calculator c = new Calculator(1, 2,3);
        double average = c.getAverage();
        assertEquals(average, 2);

    }

    @Test
    void getAverageWithNegativeValue() {
        Calculator c = new Calculator(-1, 2,3);
        double average = c.getAverage();
        assertEquals(average, 1,3);
    }

    @Test
    void getAverageWithSameValues() {
        Calculator c = new Calculator(-1, -1,-1);
        double average = c.getAverage();
        assertEquals(average,-1);
    }
    @Test
    void areAllPositiveWithNegativeValues(){
        Calculator c=new Calculator(-1,-2,-3);
        boolean areAllPositive=c.areAllPositive();
        assertFalse(areAllPositive);
    }

    @Test
    void areAllPositiveWithTwoNegativeValues(){
        Calculator c=new Calculator(-1,-2,3);
        boolean areAllPositive=c.areAllPositive();
        assertFalse(areAllPositive);
    }

    @Test
    void areAllPositive(){
        Calculator c=new Calculator(2,7,3);
        boolean areAllPositive=c.areAllPositive();
        assertTrue(areAllPositive);
    }

}