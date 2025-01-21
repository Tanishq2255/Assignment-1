//Calulator.java


// Calculator.java
// Calculator.java
public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return b != 0 ? a / b : 0; // Return 0 if division by zero
    }
	
	public void fibonacci(int a){
        int first = 0; 
		int second = 1;		        
        for (int i = 1; i <= a; i++) { 
            System.out.print(first + " ");
            
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
		}
	}
}
