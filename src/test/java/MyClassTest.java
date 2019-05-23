import org.junit.Test;

import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void lastTenDigits() {

        int number = 1000;
        String expected = "9110846701";

        String actual = MyClass.lastTenDigits(number);

        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void lastTenDigitsThrowException() {

        MyClass.lastTenDigits(5);
    }
}