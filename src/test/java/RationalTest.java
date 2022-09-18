import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        //what should be the assert statement?
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testSubtract(){
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;

        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testMultiply(){
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;

        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(8, x.denominator);
    }

    @Test
    public void testDivide(){
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;

        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.divide(y);
        Assert.assertEquals(2, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }

    @Test
    public void testEquals(){
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;

        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.equals(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(2, x.denominator);
    }

    @Test
    public void testComparedTo(){
        // tLessThan -> rational x < rational y
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 4;

        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 3;

        long tLessThan = x.compareTo(y);
        Assert.assertEquals(-1, tLessThan);

        //----------------------
        // t1 -> rational x = rational y
        x.numerator = 1;
        x.denominator = 2;

        y.numerator = 1;
        y.denominator = 2;

        long tEqualTo = x.compareTo(y);
        Assert.assertEquals(0, tEqualTo);

        //----------------------
        // t1 -> rational x > rational y
        x.numerator = 1;
        x.denominator = 3;

        y.numerator = 1;
        y.denominator = 4;

        long tMoreThan = x.compareTo(y);
        Assert.assertEquals(1, tMoreThan);

    }

    @Test
    public void testToString(){
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;

        Rational y = new Rational();
        y.numerator = 1;
        y.denominator= 4;
        String ans = x.toString();
        Assert.assertEquals("1/2", ans);
    }
}
