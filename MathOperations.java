public class MathOperations {

    //first method
    public int multiply(int a, int b) {
        return a * b;
    }

    //overloaded method from 2 to 3 integers
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    //main method to test the outputs
    public static void main(String[]args){
        MathOperations Multiplication = new MathOperations();
        System.out.println("Multiplication of 2 numbers: " + Multiplication.multiply(5, 8)); 
        System.out.println("Multiplication of 3 numbers: " + Multiplication.multiply(3, 9, 6)); 
    }
}