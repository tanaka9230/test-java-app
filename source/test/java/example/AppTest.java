package example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest
{
    @Test
    public void test_message() {
        assertEquals("Hello World!", App.message());
    }
}
