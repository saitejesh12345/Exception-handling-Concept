package org.example;

public class Main2 {

        public static void main(String[] args) {
            System.out.println("A");
            int b =0;
            int arr[] ={1,2,3};
            try {
                System.out.println(arr[5]); //throw error
                int s = 5 / b;
            }
            catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("System throwing error");

            } catch (ArithmeticException ex){
                System.out.println("arithmatic");
            }
            System.out.println("B");
        }
    }

