package mx.x10.reverseeffectapps.utils;

/**
 * Class Log -
 *
 * This class just wraps System.out
 *
 * @author Robert
 * Created 4/25/2017.
 */
public class Log {

    /**
     * Static Method dl(String) -
     *
     * This method prints a new line in the console with a debug tag for easy debugging.
     *
     * @param message A String to print to console.
     */
    public static void dl(String message) {
        System.out.println("DEBUG >> " + message);
    }

    /**
     * Static Method d(String) -
     *
     * This method prints to the console with a debug tag for easy debugging. Does not break lines.
     *
     * @param message A String to print to console.
     */
    public static void d(String message) {
        System.out.print("DEBUG >> " + message);
    }

    /**
     * Static Method p(String) -
     *
     * This method wraps System.out.print(String) for convenience.
     *
     * @param message A String to print to console.
     */
    public static void p(String message) {
        System.out.print(message);
    }

    /**
     * Static Method pl(String) -
     *
     * This method wraps System.out.println(String) for convenience.
     *
     * @param message A String to print to console.
     */
    public static void pl(String message) {
        System.out.println(message);
    }
}
