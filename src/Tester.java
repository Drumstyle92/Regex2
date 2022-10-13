/**
 * @author Drumstyle92
 * class that contains the program.
 */
public class Tester {
    /**
     * @param args main parameter.
     * main method where we find a string, a string method and its output.
     */
    public static void main(String[] args) {
        // string creation.
        String out = "tup tuup tuuup tuuuup";
        System.out.println("--------------------------------------------");
        System.out.println(out.replaceAll("u{2,3}","x"));
    }
}
