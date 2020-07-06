package test.java.hello;

import main.java.hello.Greeter;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreeterTest {
    private final Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHello() {
        assertTrue(greeter.sayHello().contains("Hello"));
    }
}
