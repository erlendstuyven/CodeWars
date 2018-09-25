package codewars.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConversionTest {

    private Conversion conversion = new Conversion();

    @Test
    public void shouldConvertToRoman() {
        assertEquals("XL", conversion.solution(40));
        assertEquals("CM", conversion.solution(900));
        assertEquals("DC", conversion.solution(600));
        assertEquals("CD", conversion.solution(400));
        assertEquals("XCI", conversion.solution(91));
        assertEquals("IX", conversion.solution(9));
        assertEquals("IV", conversion.solution(4));
        assertEquals("I", conversion.solution(1));
        assertEquals("VI", conversion.solution(6));
        assertEquals( "M", conversion.solution(1000));
        assertEquals( "MML", conversion.solution(2050));
        assertEquals( "MMD", conversion.solution(2500));
        assertEquals( "MMDCCC", conversion.solution(2800));
        assertEquals( "MMDCCCL", conversion.solution(2850));
        assertEquals( "MMDCCCLX", conversion.solution(2860));
        assertEquals( "MMDCCCLXV", conversion.solution(2865));
        assertEquals( "MMDCCCLXVIII", conversion.solution(2868));
        assertEquals( "CMXCVIII", conversion.solution(998));
    }
}
