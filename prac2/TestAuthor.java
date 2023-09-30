package prac2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAuthor {

    private Author author;

    @Before
    public void setUp() {
        author = new Author("Grigory Rasskazov", "Grishanya12345@mail.ru", 'M');
    }

    @Test
    public void toStringMethodTest() {
        String expectedResult = "Grigory Rasskazov (M) at Grishanya12345@mail.ru";
        assertEquals(expectedResult, author.toString());
        System.out.println(author);
    }
}
