package com.company.wiproPracticeQuestion;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int a[] = {1,2,3,4,5};
            System.out.println(a[0]);
            int result = 10/0;
            String str =null;
            str.length();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bound " + e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println("Index out of bound " + e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("Index out of bound " + e.getMessage());
        }
        finally {
            System.out.println("Try again!!!");
        }
    }
}
