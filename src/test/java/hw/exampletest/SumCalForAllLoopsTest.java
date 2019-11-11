package hw.exampletest;

import org.junit.Assert;
import org.junit.Test;

public class SumCalForAllLoopsTest {

    public int calculateSumOfWhile(int maxValue) {
        int sum = 0;
        int i = 1;
        while (i <= maxValue) {
            sum = sum + i;
            i++;
        }
        return sum;
    }

    public int calculateSumOfDoWhile(int maxValue) {
        int sum = 0;
        int i = 0;
        do {
            sum = sum + i;
            i++;
        }
        while (i <= maxValue);
        return sum;
    }

    public int calculateSumOfFor(int maxValue) {
        int sum = 0;
        for (int i = 0; i <= maxValue; i++) {
            sum = sum + i;
        }
        return sum;
    }

    @Test
    public void testSumOfZero() {
        Assert.assertEquals(0, new SumCalForAllLoopsTest().calculateSumOfWhile(0));
    }

    @Test
    public void testSumOfOne() {
        Assert.assertEquals(1, new SumCalForAllLoopsTest().calculateSumOfWhile(1));
    }

    @Test
    public void testSumOfTwo() {
        Assert.assertEquals(3, new SumCalForAllLoopsTest().calculateSumOfWhile(2));
    }

    @Test
    public void testSumOfThree() {
        Assert.assertEquals(6, new SumCalForAllLoopsTest().calculateSumOfWhile(3));
    }

    @Test
    public void testSumOfFour() {
        Assert.assertEquals(10, new SumCalForAllLoopsTest().calculateSumOfWhile(4));
    }

    @Test
    public void testSumOfOneTwenty() {
        Assert.assertEquals(120, new SumCalForAllLoopsTest().calculateSumOfWhile(15));
    }

    @Test
    public void testSumOfZeroDoWhile() {
        Assert.assertEquals(0, new SumCalForAllLoopsTest().calculateSumOfDoWhile(0));
    }

    @Test
    public void testSumOfOneDoWhile() {
        Assert.assertEquals(1, new SumCalForAllLoopsTest().calculateSumOfDoWhile(1));
    }

    @Test
    public void testSumOfTwoDoWhile() {
        Assert.assertEquals(3, new SumCalForAllLoopsTest().calculateSumOfDoWhile(2));
    }

    @Test
    public void testSumOfThreeDoWhile() {
        Assert.assertEquals(6, new SumCalForAllLoopsTest().calculateSumOfDoWhile(3));
    }

    @Test
    public void testSumOfFourDoWhile() {
        Assert.assertEquals(10, new SumCalForAllLoopsTest().calculateSumOfDoWhile(4));
    }

    @Test
    public void testSumOfOneTwentyDoWhile() {
        Assert.assertEquals(120, new SumCalForAllLoopsTest().calculateSumOfDoWhile(15));
    }
    @Test
    public void testSumOfZeroForForLoop() {
        Assert.assertEquals(0, new SumCalForAllLoopsTest().calculateSumOfFor(0));
    }

    @Test
    public void testSumOfOneForForLoop() {
        Assert.assertEquals(1, new SumCalForAllLoopsTest().calculateSumOfFor(1));
    }

    @Test
    public void testSumOfTwoForForLoop() {
        Assert.assertEquals(3, new SumCalForAllLoopsTest().calculateSumOfFor(2));
    }

    @Test
    public void testSumOfThreeForForLoop() {
        Assert.assertEquals(6, new SumCalForAllLoopsTest().calculateSumOfFor(3));
    }

    @Test
    public void testSumOfFourForForLoop() {
        Assert.assertEquals(10, new SumCalForAllLoopsTest().calculateSumOfFor(4));
    }

    @Test
    public void testSumOfOneTwentyForForLoop() {
        Assert.assertEquals(120, new SumCalForAllLoopsTest().calculateSumOfFor(15));
    }
}
