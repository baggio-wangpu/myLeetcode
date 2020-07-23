import org.junit.Test;

import static org.junit.Assert.*;

public class SayHelloTest {

    @Test
    public void shouldSayHello() {
        assertEquals("Hello, Qualified!", SayHello.sayHello("Qualified"));
        assertEquals("Hello there!", SayHello.sayHello(""));
        assertEquals("Hello there!", SayHello.sayHello(null));
    }

}