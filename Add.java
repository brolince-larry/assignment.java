// Class demonstrating method overloading
class Addition {
    
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three double values
    double add(double a, double b, double c) {
        return a + b + c;
    }

    // Method to add a double and an integer
    double add(double a, int b) {
        return a + b;
    }
}

// Main class to test the Addition class
public class Add {
    public static void main(String[] args) {
        Addition obj = new Addition();

        // Testing different overloaded methods
        System.out.println("Sum of two integers: " + obj.add(28, 45));
        System.out.println("Sum of three double values: " + obj.add(28.98, 45.56, 23.76));
        System.out.println("Sum of a double and an integer: " + obj.add(56.45, 43));
    }
}
