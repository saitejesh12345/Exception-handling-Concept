package org.example;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("A");
        int b =0;
        int arr[] ={1,2,3};
        try {
            int s = 5 / b; //throw error
            System.out.println(arr[5]);

        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("System throwing error");

        }
        //catch (ArithmeticException ex){
//            System.out.println("arithmatic");}
         catch (Exception ex){  //it will catch all exceptions from top to bottom
            System.out.println("exception caught");
        }
        System.out.println("B");
    }
}
