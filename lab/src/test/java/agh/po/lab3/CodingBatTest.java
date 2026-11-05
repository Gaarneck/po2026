package agh.po.lab3;

import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CodingBatTest {
    CodingBat codingBat = new CodingBat();

    @Test
    public void loneTeenTest() {
        assertEquals(true, codingBat.loneTeen(13, 99));
        assertEquals(true, codingBat.loneTeen(21, 19));
        assertEquals(false, codingBat.loneTeen(13, 13));
    }

    @Test
    public void startHiTest() {
        assertEquals(true, codingBat.startHi("hi there"));
        assertEquals(true, codingBat.startHi("hi"));
        assertEquals(false, codingBat.startHi("hello hi"));
    }

    @Test
    public void countEvensTest() {
        assertEquals(2, codingBat.countEvens(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void firstHalfTest() {
        assertEquals("Woo", codingBat.firstHalf("WooHoo"));
        assertEquals("Hello", codingBat.firstHalf("HelloThere"));
        assertEquals("abc", codingBat.firstHalf("abcdef"));
    }

    @Test
    public void mapABTest()
    {
        assertEquals("HiThere", codingBat.mapAB
                (
                        new HashMap<String, String>()
                        {{
                            put("a", "Hi");
                            put("b", "There");
                        }}
                ).get("ab")
        );

        assertEquals("Hi", codingBat.mapAB
                (
                        new HashMap<String, String>()
                        {{
                            put("a", "Hi");
                        }}
                ).get("a")
        );

        assertEquals("There", codingBat.mapAB
                (
                        new HashMap<String, String>()
                        {{
                            put("b", "There");
                        }}
                ).get("b")
        );

        assertEquals("meh", codingBat.mapAB
                (
                        new HashMap<String, String>()
                        {{
                            put("c", "meh");
                        }}
                ).get("c")
        );

        {
            Map<String, String> result = codingBat.mapAB(
                    new HashMap<String, String>() {{
                        put("a", "aaa");
                        put("ab", "nope");
                        put("b", "bbb");
                        put("c", "ccc");
                    }}
            );

            assertEquals(
                    "aaaaaabbbbbbccc",
                    result.get("a") + result.get("ab") + result.get("b") + result.get("c")
            );
        }

        {
            Map<String, String> result = codingBat.mapAB(
                    new HashMap<String, String>() {{
                        put("ab", "nope");
                        put("b", "bbb");
                        put("c", "ccc");
                    }}
            );

            assertEquals(
                    "nopebbbccc",
                    result.get("ab") + result.get("b") + result.get("c")
            );
        }
    }

    @Test
    public void wordLenTest() {
        {
            return;
        }
    }
}