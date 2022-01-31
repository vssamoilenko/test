package com.foxminded.anagram;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest {

    Reverse reverseInputText = new Reverse();

    @Test
    void testWords() {
        assertEquals("d1cba hgf!e",  reverseInputText.reverse("a1bcd efg!h"));
    }
    @Test
    void testEmptyString() {
        assertEquals("",  reverseInputText.reverse(""));
    }
    @Test
    void testRussionString() {
        assertEquals("авыф",  reverseInputText.reverse("фыва"));
    }

}