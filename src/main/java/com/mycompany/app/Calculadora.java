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
        System.out.println("Eu sou o Main");
    }
}