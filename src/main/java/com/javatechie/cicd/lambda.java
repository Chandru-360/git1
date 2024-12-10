public class SingleFileLambdaExample {
    public static void main(String[] args) {
        // A lambda expression to print a message
        Runnable printMessage = () -> System.out.println("Hello from the lambda function!");
        // Executing the lambda function
        printMessage.run();
        // A lambda expression to process a string (e.g., convert it to uppercase)
        String input = "lambda expressions in Java!";
        String result = toUpperCase(input, (str) -> str.toUpperCase());
        // Printing the result
        System.out.println("Uppercase Result: " + result);
    }
    // A method that takes a string and a function to process the string
    public static String toUpperCase(String input, Function<String, String> function) {
        return function.apply(input);
    }
}
