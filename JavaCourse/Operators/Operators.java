package Operators;

import java.util.Scanner;

public class Operators {

    // 1. Arithmetic Operators
    public void Arithmetic(int a, int b) {
        System.out.println("\n*** Arithmetic Operators ***");
        System.out.println("Addition (a + b)       : " + (a + b));
        System.out.println("Subtraction (a - b)    : " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b)       : " + (a / b));
        System.out.println("Modulus (a % b)        : " + (a % b));
    }

    // 2. Assignment Operators
    public void Assignment(int a, int b) {
        System.out.println("\n*** Assignment Operators ***");
        int temp;
        temp = a;          System.out.println("a = b        : " + (temp = b));
        temp = a;          System.out.println("a += b       : " + (temp += b));
        temp = a;          System.out.println("a -= b       : " + (temp -= b));
        temp = a;          System.out.println("a *= b       : " + (temp *= b));
        temp = a;          System.out.println("a /= b       : " + (temp /= b));
        temp = a;          System.out.println("a %= b       : " + (temp %= b));
    }

    // 3. Relational Operators
    public void Relational(int a, int b) {
        System.out.println("\n*** Relational Operators ***");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
    }

    // 4. Logical Operators
    public void Logical(boolean a, boolean b) {
        System.out.println("\n*** Logical Operators ***");
        System.out.println("a && b : " + (a && b));
        System.out.println("a || b : " + (a || b));
        System.out.println("!a     : " + (!a));
    }

    // 5. Unary Operators
    public void Unary(int a) {
        System.out.println("\n*** Unary Operators ***");
        System.out.println("Unary Plus  (+a) : " + (+a));
        System.out.println("Unary Minus (-a) : " + (-a));
    }

    // 6. Increment & Decrement
    public void Inc_Dec(int a, int b) {
        System.out.println("\n*** Increment & Decrement ***");
        System.out.println("++a : " + (++a));
        System.out.println("a++ : " + (a++));
        System.out.println("--b : " + (--b));
        System.out.println("b-- : " + (b--));
    }

    // 7. Ternary Operator
    public void Ternary(int a, int b) {
        System.out.println("\n*** Ternary Operator ***");
        int max = (a > b) ? a : b;
        System.out.println("Max value : " + max);
    }

    // 8. Bitwise Operators
    public void Bitwise(int a, int b) {
        System.out.println("\n*** Bitwise Operators ***");
        System.out.println("a & b : " + (a & b));
        System.out.println("a | b : " + (a | b));
        System.out.println("a ^ b : " + (a ^ b));
        System.out.println("~a    : " + (~a));
    }

    // 9. Shift Operators
    public void Shift(int a, int b) {
        System.out.println("\n*** Shift Operators ***");
        System.out.println("a << b : " + (a << b));
        System.out.println("a >> b : " + (a >> b));
    }

    // ---------------- MAIN METHOD ----------------
    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);
        Operators op = new Operators();

        char repeat;  // Variable to store user's choice to continue or exit

        do {
            System.out.println("\n***** OPERATORS IN JAVA *****");
            System.out.println("1. Arithmetic");
            System.out.println("2. Assignment");
            System.out.println("3. Relational");
            System.out.println("4. Logical");
            System.out.println("5. Unary");
            System.out.println("6. Increment / Decrement");
            System.out.println("7. Ternary");
            System.out.println("8. Bitwise");
            System.out.println("9. Shift");

            System.out.print("Enter your choice : ");
            int choice = cs.nextInt();   // Read user's menu choice

            switch (choice) {

                case 1, 2, 3, 6, 7, 8, 9 -> {
                    System.out.print("Enter value 1 : ");
                    int a = cs.nextInt();
                    System.out.print("Enter value 2 : ");
                    int b = cs.nextInt();

                    if (choice == 1) op.Arithmetic(a, b);
                    else if (choice == 2) op.Assignment(a, b);
                    else if (choice == 3) op.Relational(a, b);
                    else if (choice == 6) op.Inc_Dec(a, b);
                    else if (choice == 7) op.Ternary(a, b);
                    else if (choice == 8) op.Bitwise(a, b);
                    else if (choice == 9) op.Shift(a, b);
                }

                case 4 -> {     // Logical operators work with boolean values
                    System.out.print("Enter boolean value 1 (true/false) : ");
                    boolean x = cs.nextBoolean();   // Read first boolean value
                    System.out.print("Enter boolean value 2 (true/false) : ");
                    boolean y = cs.nextBoolean();  // Read second boolean value
                    op.Logical(x, y);
                }

                case 5 -> {  // Unary operator needs only one integer value
                    System.out.print("Enter value : ");
                    int a = cs.nextInt();
                    op.Unary(a);
                }

                default -> System.out.println("Invalid choice!");
            }

            System.out.print("\nDo you want to continue? (y/n): ");
            repeat = cs.next().charAt(0);  // Read user's decision to continue or exit

        } while (repeat == 'y' || repeat == 'Y');

        System.out.println("\nThank you for using Operators Program!");
        cs.close();
    }
}
