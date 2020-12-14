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
        System.out.printf("Resultado 1 + 2 = ", soma);

        sub = Calculadora.operacao(2, "-", 1);
        System.out.printf("Resultado 2 - 1 = ", sub);

        mult = Calculadora.operacao(3, "*", 3);
        System.out.printf("Resultado 3 * 3 = ", mult);

        div = Calculadora.operacao(4, "/", 2);
        System.out.printf("Resultado 4 / 2 = ", div);

    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
