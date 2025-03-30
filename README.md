# CAT-2-OOP
-code is written and edited by Agonga David (BBIT 145937)

## Student.java file
 - The class uses private instance variables (`Sname` and `grade`) to store the student's name and grade.
   - Public getter and setter methods (`getSName`, `setSName`, `getGrade`, `setGrade`) are provided to access and modify these variables.
   - The `checkGrade` method ensures that the grade is within a valid range (0 to 100). If the grade is invalid, it is reset to 0.
   - Contains a test class with the main method to check functionality.

## MathOperations.java file
 - The class provides methods to perform multiplication operations.
   - The `multiply(int a, int b)` method multiplies two integers and returns the result.
   - The `multiply(int a, int b, int c)` method is overloaded to multiply three integers and returns the result.
   - The `main` method tests both methods and prints the results.

## animal folder
 - This folder contains 3 Java class files: `Animal.java`, `Cat.java`, and `Dog.java`.

   - `Animal.java` file:
     - This class represents a generic animal.
     - It contains a method `makeSound` that prints a generic animal sound.
     - The `main` method creates an instance of `Animal` and calls the `makeSound` method.

   - `Cat.java` file:
     - This class extends the `Animal` class.
     - It overrides the `makeSound` method to print "cat: Meows".

   - `Dog.java` file:
     - This class extends the `Animal` class.
     - It overrides the `makeSound` method to print "dog: Barks".

## Appliance folder
 - This folder contains 3 Java class files: `appliance.java`, `Fan.java`, and `Tv.java`.

   - `appliance.java`
     - This is an abstract class that defines a blueprint for appliances.
     - It contains an abstract method `turnOn` that must be implemented by subclasses.
     - The `main` method demonstrates polymorphism by creating instances of `Fan` and `Tv` and calling their `turnOn` methods.

   - `Fan.java`
     - This class extends the `appliance` abstract class.
     - It implements the `turnOn` method to show that "The Fan has been turned on."

   - `Tv.java`
     - This class extends the `appliance` abstract class.
     - It implements the `turnOn` method to show that "The TV has been turned on."

## Divisioncalc.java file
 - This file contains a simple division calculation program.
   - It asks the user to input 2 numbers.
   - It attempts to divide the first number by the second number.
   - If the division is successful, it prints the result.
   - If the second number is zero, it catches the `ArithmeticException` and prints an error message ("Cannot divide by zero!").
