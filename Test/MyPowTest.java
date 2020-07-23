import org.junit.Test;

import static org.junit.Assert.*;

public class MyPowTest {

    private MyPow myPow = new MyPow();

    @Test
    public void myPow() {
        System.out.println(myPow.myPow(2.00000, 10));
        System.out.println(myPow.myPow(2.10000, 3));
        System.out.println(myPow.myPow(2.00000, -2));
        System.out.println(myPow.myPow(0.00001,2147483647));
    }
}