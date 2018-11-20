package com.company;


public class Main {

    public static void main(String[] args) {
        int num = 2;
        Validate(99);
        // write your code her
       try {
            int op = num % 0;
            //breaks the flow of program , doesnt go to next lin even ;
            System.out.println("i am being executed");
            int arr[] = new int[5];
            arr[6] = 60;
        } catch (ArithmeticException ae) {
            System.out.println("exception caught, the op is " + ae);

        }
        // multiple catch blocks can also be defined for a program

        catch (ArrayIndexOutOfBoundsException aib) {
            System.out.println("array is out of bounds " + aib);
        } finally {
            System.out.println("I will always execute , i am a finally block , just get it ");
        }
        //nested try catch
        int output , number=2;

        int array[]= new int [6];

        try {

            output = number % 0;

            System.out.println("first try block here ");

        }


        catch (ArithmeticException ae) {
            System.out.println(" exception , going in second try statement");
            try {
                output=number%1;
                System.out.println("i am here in second try block");

            } catch (ArrayIndexOutOfBoundsException ai) {
                System.out.println("i am in second catch block "+ai);
            }
            try {
                array[7]=16;

            } catch (ArrayIndexOutOfBoundsException ai) {
                System.out.println("i am out of bounds ");
            }


        }



   }
//
    static void Validate(int numHair){
        if(numHair<100){
            throw  new ArithmeticException("You are probably bald ");

        }
        else{
            System.out.println("you are not bald my dear friend ");
        }


        System.out.println("code ends here");
    }



}
