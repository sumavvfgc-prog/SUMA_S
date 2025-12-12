import java.util.Scanner;

class Calculator {
    double a, b;

  
    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    
    public double add() {
        return a + b;
    }

    public double subtract() {
        return a - b;
    }

    public double multiply() {
        return a * b;
    }

    public double divide() {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add/sub/mul/div): ");
        String op = sc.next();

        Calculator c = new Calculator(a, b);

        double result = 0;

        switch (op.toLowerCase()) {
            case "add":
                result = c.add();
                break;
            case "sub":
                result = c.subtract();
                break;
            case "mul":
                result = c.multiply();
                break;
            case "div":
                result = c.divide();
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }

        System.out.println("Result: " + result);
    }
}
