package mx.x10.reverseeffectapps;

import mx.x10.reverseeffectapps.datastructures.CustomStack;
import mx.x10.reverseeffectapps.math.rounding.CustomDecimalRounder;
import mx.x10.reverseeffectapps.math.rounding.DecimalRounder;
import mx.x10.reverseeffectapps.math.rounding.TwoPlaceDecimalRounder;
import mx.x10.reverseeffectapps.utils.Log;

/**
 * Class Playground -
 *
 * This is for holding test cases.
 *
 * Created by Robert on 4/25/2017.
 */
public class Playground {

    // Test CustomStack class
    public static void testCustomStack() {
        CustomStack<String> stack = new CustomStack<>();
        stack.push("String 1");
        stack.push("String 2");
        stack.push("String 3");

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        stack.push("Another string");

        System.out.println(stack);
    }

    // Test Rounding classes
    public static void testDecimalRounding() {
        DecimalRounder rounder = new TwoPlaceDecimalRounder(123.124456, false);
        Log.dl(rounder.toString());

        DecimalRounder rounder1 = new CustomDecimalRounder(623.6553249, 4, false);
        Log.dl(rounder1.toString());
    }
}
