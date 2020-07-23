public class SayHello {

    // Complete this function to return either
    // "Hello, [name]!" or "Hello there!"
    // based on the input
    public static String sayHello( String name ) {
        // You can print to STDOUT for debugging if you need to:
        System.out.print(name);

        // but you need to return the correct value in order to pass the challenge
        String result = "Hello";
        if(name == null || name.isEmpty()) {
            result = result + " there!";
        } else {
            result = result + ", " + name + "!";
        }
        return result; // TODO: return the correct value
    }
}
