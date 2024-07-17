// A class with public access specifier
public class MyClass {
    
    // Public field
    public int publicField = 10;

    // Public method
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass myObject = new MyClass();

        // Accessing the public field
        System.out.println("Public Field: " + myObject.publicField);

        // Calling the public method
        myObject.publicMethod();
    }
	#feature201 changes by Vivek on Payment Gateway Module Oct2023
	// A class with protected access specifier
public class Animal {
    
    // Protected field
    protected String species = "Unknown"; // Initialize with a default value

    // Protected method
    protected void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
#feature201 changes end
}