Explaination:

Class calculator:
- Consists of mehods: addition, subtraction, multiplication, division, fibbonacci, sum and average of an array.
- For the first four basic operations two variables are considered and operations are conducted.
- For Fibbonacci, initially two variables are declared (first and second)such that first=0 and second=1. A for loop is applied to the function such that until mentioned number the
  pointers will keep moving similar to that of the cocept of slider pointers.
- For array related functions (sum and avg) a parameterized function is considered for the array size and similar typical logic (sum=sum+n,avg=total/count) of basic codes is applied with
  using for loop for the elements in an array.

Class Input:
- getDouble:
  This method asks the user to enter a value, validates the input, and returns the valid number.

- getOperation:
  This method asks the user to enter a mathematical operation (+, -, *, /) and ensures the input is valid.

- arrayInput:
  This method collects a specified number of integers from the user, validating each input to ensure it is an integer.

Class Main:

The program starts by asking what you want to do: use a calculator (Calculator methods), generate a Fibonacci sequence (fibonacci method), or work with arrays (sumOfArray and avgOfArray methods). 
If you choose the calculator, you enter two numbers using getDouble and an operation with getOperation, and it gives the result using methods like add, subtract, multiply, or divide(using switch case). For Fibonacci, 
you pick how many numbers you want, and it shows the sequence using the fibonacci method. In arrays, you can add all elements or find their average after entering them using the arrayInput method.
It also handles wrong inputs.
