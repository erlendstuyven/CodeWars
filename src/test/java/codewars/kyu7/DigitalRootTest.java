package codewars.kyu7;

import codewars.kyu7.DigitalRoot;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitalRootTest {
    @Test
    public void Tests() {
        assertEquals( "Nope!" , DigitalRoot.digital_root(16), 7);
        assertEquals( "Nope!" , DigitalRoot.digital_root(163), 10);
        assertEquals( "Nope!" , DigitalRoot.digital_root(1111111111), 10);
        assertEquals( "Nope!" , DigitalRoot.digital_root(0), 0);
        assertEquals( "Nope!" , DigitalRoot.digital_root(493193), 2);
        assertEquals( "Nope!" , DigitalRoot.digital_root(132189), 6);

    }

}