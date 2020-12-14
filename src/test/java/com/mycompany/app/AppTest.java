package com.mycompany.app;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testAppConstructor() {
        try {
            new Calculadora();
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }

    @Test
    public void testAppMain()
    {
        // App.main(null);
        // try {
        //     assertEquals("Hello World!" + System.getProperty("line.separator"), outContent.toString());
        // } catch (AssertionError e) {
        //     fail("\"message\" is not \"Hello World!\"");
        // }
        int soma, sub, mult, div;

        soma = Calculadora.operacao(1, "+", 2);
        sub = Calculadora.operacao(2, "-", 1);
        mult = Calculadora.operacao(3, "*", 3);
        div = Calculadora.operacao(4, "/", 2);
                
        try {
            assertEquals("Resultado 1 + 2 = 3 \n", 3, soma);
        } catch (AssertionError e) {
            fail("Resultado da soma não é 3");
        }
        try {
            assertEquals("Resultado 2 - 1 = 1 \n", 1, sub);
        } catch (AssertionError e) {
            fail("Resultado da subtração não é 1");
        }
        try {
            assertEquals("Resultado 3 * 3 = 9 \n", 9, mult);
        } catch (AssertionError e) {
            fail("Resultado da multiplicação não é 9");
        }
        try {
            assertEquals("Resultado 4 / 2 = 2 \n", 2, div);
        } catch (AssertionError e) {
            fail("Resultado da divisão não é 2");
        }
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
