/**
 * Hello world!
 */
/* public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }
    

} */

package com.mycompany.app;
import java.util.Scanner;

public class Calculadora {

    public static int operacao(int first, String operator, int second) {

        int result;

        switch (operator) {
        case "+":
            result = first + second;
            return result;

        case "-":
            result = first - second;
            return result;

        case "*":
            result = first * second;
            return result;

        case "/":
            result = first / second;
            return result;

        default:
            System.out.printf("Error! operator is not correct");
            return 0;
        }
    }

    
    public static void main(String[] args) {
        System.out.println("Eu sou Universal");
        
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
}