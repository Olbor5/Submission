package Submission;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestKlass {

    @Test

    public void testAddRowIncreaseRowCount() {
        TextCounter counter = new TextCounter();

        counter.addRow("Hejsan");

        int expected = 1;
        int actual = counter.getRowCount();

        assertEquals(expected, actual);

        counter.addRow("Pepparkaka");

        expected = 2;
        actual = counter.getRowCount();

        assertEquals(expected, actual);

        counter.addRow("Kanelbulle");

        expected = 3;
        actual = counter.getRowCount();

        assertEquals(expected, actual);

    }

    @Test
    public void testIncreaseCharCount() {

        TextCounter counter = new TextCounter();

        counter.addRow("Hej");
        int expected = 3;
        int actual = counter.getCharCount();

        assertEquals(expected, actual);

        counter.addRow("Hejsan");
        expected = 9;
        actual = counter.getCharCount();

        assertEquals(expected, actual);
    }

    @Test
    public void testMultipleCharCount() {
        TextCounter counter = new TextCounter();

        counter.addRow("Hej hej");
        int expected = 7;
        int actual = counter.getCharCount();

        assertEquals(expected, actual);

    }

    @Test
    public void testSpecialCharactersAndNumbers() {
        TextCounter counter = new TextCounter();

        counter.addRow("123!#%");
        int expected = 6;
        int actual = counter.getCharCount();

        assertEquals(actual, expected);

    }

    @Test
    public void testAddRowCountAndCharCount() {
        TextCounter counter = new TextCounter();

        counter.addRow("Hejsan");
        counter.addRow("Hej");

        int expectedRowCount = 2;
        int actualRowCount = counter.getRowCount();

        int expectedCharCount = 9;
        int actualCharCount = counter.getCharCount();

        assertEquals(expectedRowCount, actualRowCount);
        assertEquals(expectedCharCount, actualCharCount);

    }

}
