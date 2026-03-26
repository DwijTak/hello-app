/**
 * UC5: Display Hello with Multiple Command-Line Arguments or Default Message
 */

public class HelloApp {

    public static void main(String[] args) {

        String names;

        if (args.length > 0) {
            // Join all names with comma and space
            names = String.join(", ", args);
        } else {
            names = "World";
        }

        System.out.println("Hello, " + names + "!");
    }
}