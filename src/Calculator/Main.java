package Calculator;

import java.util.Scanner;

class Calculator{
    int a, b;
    Calculator(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    // addition
    int add() { return a + b;}
    // subtraction
    int subtract() { return a - b;}
    // multiplication
    int multiplication() { return a * b;}
    // division
    int division() { return a / b;}
}

public class Main {
    public static void main(String args[])
    {
        Scanner sr=new Scanner(System.in);
        System.out.print("Enter the first Integer: ");
        int a = sr.nextInt();
        System.out.print("Enter the second Integer: ");
        int b = sr.nextInt();
        System.out.print("Enter the operation that you want to perform (+,-,*,/): ");
        String op=sr.next();
        int c = 0;

        Calculator obj = new Calculator(a, b);
        switch(op)
        {
            case "+": c = obj.add();
            break;
            case "-": c = obj.subtract();
            break;
            case "*": c = obj.multiplication();
            break;
            case "/": c = obj.division();
            break;

            default: System.out.println("Invalid!");
        }

        System.out.println(a + op + b + "=" + c);

    }
}