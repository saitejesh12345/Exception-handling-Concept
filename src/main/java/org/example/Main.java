package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("A");
        int b =0;
        try {
            int s = 5 / b;
        }
        catch (ArithmeticException ex){
            System.out.println("System throwing error");
            System.out.println(ex.getStackTrace());
            System.out.println(ex.getMessage());
        }
        System.out.println("B");
    }
}