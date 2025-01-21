// Main.java
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Input input = new Input();

        System.out.println("Welcome to the Calculator!");

        double num1 = input.getDouble("Enter the first number: ");
        double num2 = input.getDouble("Enter the second number: ");
        char operation = input.getOperation();

        double result = 0;
        switch (operation) {
            case '+':
                result = calculator.add(num1, num2);
                break;
            case '-':
                result = calculator.subtract(num1, num2);
                break;
            case '*':
                result = calculator.multiply(num1, num2);
                break;
            case '/':
                result = calculator.divide(num1, num2);
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed. Result set to 0.");
                }
                break;
        }

        System.out.println("The result is: " + result);
        input.close();

        System.out.println("Thank you for using the Calculator!");
    }
}
