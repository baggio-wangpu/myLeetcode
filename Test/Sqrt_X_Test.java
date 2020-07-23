import org.junit.Test;

import static org.junit.Assert.*;

public class Sqrt_X_Test {

    private Sqrt_X_ sqrt = new Sqrt_X_();

    @Test
    public void mySqrt() {
        System.out.println(sqrt.mySqrt(1));
        System.out.println(sqrt.mySqrt(2));
        System.out.println(sqrt.mySqrt(3));
        System.out.println(sqrt.mySqrt(4));
        System.out.println(sqrt.mySqrt(5));
        System.out.println(sqrt.mySqrt(8));
        System.out.println(sqrt.mySqrt(16));
        System.out.println(sqrt.mySqrt(2147483647));
    }

    @Test
    public void mySqrt1() {
        System.out.println(sqrt.mySqrt1(1));
        System.out.println(sqrt.mySqrt1(2));
        System.out.println(sqrt.mySqrt1(3));
        System.out.println(sqrt.mySqrt1(4));
        System.out.println(sqrt.mySqrt1(5));
        System.out.println(sqrt.mySqrt1(8));
        System.out.println(sqrt.mySqrt1(16));
        System.out.println(sqrt.mySqrt1(2147483647));
    }
}