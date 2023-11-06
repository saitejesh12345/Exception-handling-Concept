package org.example.customexception1;

public class customeException1 {
    public static void main(String[] args) {
        System.out.println("Program starts");
        int age = 10;
        try {
            func(age);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array");
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic");
        } catch (UserUnderageException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("E");
        } finally { //finally will alwys runs whether exception caught or not
            System.out.println("Always prints");//if try statements runs finally definetly runs
        }
        System.out.println("Program finshed");
    }

    //ArithmeticException,ArrayIndexOutOfBoundsException - RuntimeException
    public static void func(int age) throws UserUnderageException {
        if (age < 15) {
            throw new UserUnderageException("you are underage.You are Supposed to be older than 15yrs");
        }
        int b = 0;
        int arr[] = {1, 2, 3};
        int u = 8 / b;
        System.out.println(arr[4]);
    }


    public static void func2(int age) throws UserUnderageException{
        func(age);
    }
}
