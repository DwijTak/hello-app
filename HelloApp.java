/**
 * UC3: Display Hello with Command-Line Argument or Default Message
 */

public class HelloApp {

    public static void main(String[] args) {

        // Assign name using ternary operator
        String name = (args.length > 0) ? args[0] : "World";

        // Print greeting
        System.out.println("Hello, " + name + "!");

    }
}