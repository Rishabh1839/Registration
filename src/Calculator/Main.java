package Calculator;

import java.util.Scanner;
import java.text.NumberFormat;

public class Main
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //creating a new user menu
        System.out.println("Welcome to Calculator! Using OOP Methods");
        System.out.println("This is the Main Menu");
        System.out.println("Choose your exp<b></b>pression: ");
        System.out.println("1. Addition /n 2.Substraction /n 3. Multiplication /n 4.Division");

        //creating a choice making for the user
        int choice = input.nextInt();

        // creating switch cases for options
        switch(choice){
            case 1:
                addition();

            case 2:
                substraction();

            case 3:
                multiplication();

            case 4:
                division();
        }
    }

    //doing addition in this class
    static void addition()
    {
        Scanner math1 = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.println("Enter the first number!");
        a = math1.nextInt();
        System.out.println("Second Number!");
        b = math1.nextInt();
        c = a + b;
        System.out.println("The total value is" + c);
        return;
    }

    static void substraction()
    {
        Scanner math1 = new Scanner(Systen.in);
        double a;
        double b;
        double c;

        System.out.println("Enter the first number!");
        a = math1.nextInt();
        System.out.println("Second Number!");
        b = math1.nextInt();
        c = a - b;
        System.out.println("The total value is" + c);
        return;

    }

    static void multiplication()
    {
        Scanner math1 = new Scanner(Systen.in);
        double a;
        double b;
        double c;

        System.out.println("First Number!");
        a = math1.nextInt();
        System.out.println("Second Number!");
        b = math1.nextInt();
        c = a * b;
        System.out.println("The total value is" + c);
        return;
    }

    static void division()
    {
        Scanner math1 = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.println("First Number!");
        a = math1.nextInt();
        System.out.println("Second Number!");
        b = math1.nextInt();
        c = a / b;
        System.out.println("The total value is" + c);
        return;
    }
}