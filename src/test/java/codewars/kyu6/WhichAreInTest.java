package codewars.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class WhichAreInTest {

    @Test
    public void test1() {
        String a[] = new String[]{ "arp", "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }

    @Test
    public void test2() {
        String a[] = new String[]{ "war", "ewar" };
        String b[] = new String[] { "codewars", "codewars"};
        String r[] = new String[] { "ewar", "war" };
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }

    @Test
    public void test3() {
        String a[] = new String[]{"tarp", "mice", "bull" };
        String b[] = new String[] {"lively", "alive", "harp", "sharp", "armstrong"};
        String r[] = new String[] {};
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }
}