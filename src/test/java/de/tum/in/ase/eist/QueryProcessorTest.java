package de.tum.in.ase.eist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueryProcessorTest {

    private final QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    void testEmptyStringIfCannotProcessQuery() {
        assertEquals("", queryProcessor.process("test"));
    }

    @Test
    void testKnowsAboutShakespeare() {
        String actual = queryProcessor.process("Shakespeare");
        if (!actual.contains("playwright")) {
            fail("The QueryProcessor does not know about Shakespeare.");
        }
    }

    @Test
    void isNotCaseSensitive() {
        String actual = queryProcessor.process("shakespeare");
        if (!actual.contains("playwright")) {
            fail("Your QueryProcessor should not be case sensitive.");
        }
    }

    @Test
    public void isNotCaseSensitive2() {
        assertTrue(queryProcessor.process("your name").contains("Lukas"));
    }


    @Test
    public void blaTest(){
        assertEquals("4034", queryProcessor.process("what is 2019 plus 2015"));
    }


    @Test
    public void blaTest1(){
        assertEquals("787", queryProcessor.process("which of the following numbers is the largest: 662, 787"));
    }
}
