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
    public void testSoma()
    {
        int soma;

        soma = Calculadora.operacao(1, "+", 2);

        try {
            System.out.printf("\nResultado 1 + 2 = %d", soma);
            assertEquals(3, soma);
        } catch (AssertionError e) {
            fail("Resultado da soma não é 3");
        }
    }

    @Test
    public void testSub()
    {
        int sub;

        sub = Calculadora.operacao(2, "-", 1);
                
        try {
            System.out.printf("\nResultado 2 - 1 = %d", sub);
            assertEquals("Resultado 2 - 1 = 1 \n", 1, sub);
        } catch (AssertionError e) {
            fail("Resultado da subtração não é 1");
        }
    }
    
    @Test
    public void testMult()
    {
        int mult;

        mult = Calculadora.operacao(3, "*", 3);

        try {
            System.out.printf("\nResultado 3 * 3 = %d", mult);
            assertEquals("Resultado 3 * 3 = 9 \n", 9, mult);
        } catch (AssertionError e) {
            fail("Resultado da multiplicação não é 9");
        }
    }
    
    @Test
    public void testDiv()
    {
        int div;

        div = Calculadora.operacao(4, "/", 2);
                
        try {
            System.out.printf("\nResultado 4 / 2 = %d\n", div);
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
