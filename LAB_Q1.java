/*Write a java class with a private instance variable and a method that takes a parameter with the
 same name as the instance variable. use the "this" keyword to differentiate between the instance 
 variable and the parameter.*/

 public class LAB_Q1 {
    private int value; // private instance variable

    // Constructor
    public LAB_Q1(int value) {
        // Use "this" to refer to the instance variable
        this.value = value;
    }

    // Method with a parameter having the same name as the instance variable
    public void setValue(int value) {
        // Use "this" to refer to the instance variable and differentiate it from the parameter
        this.value = value;
    }

    // Method to retrieve the value of the instance variable
    public int getValue() {
        return this.value;
    }

    // Main method for testing
    public static void main(String[] args) {
        LAB_Q1 exampleObj = new LAB_Q1(10);

        System.out.println("Initial value: " + exampleObj.getValue());

        // Set a new value using the method with parameter
        exampleObj.setValue(20);
        System.out.println("Updated value: " + exampleObj.getValue());
    }
}