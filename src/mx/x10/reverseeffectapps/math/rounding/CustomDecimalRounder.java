package mx.x10.reverseeffectapps.math.rounding;

/**
 * Class CustomDecimalRounder -> DecimalRounder -
 *
 * This class allows for a String-formatted decimal rounding with the number of places at the choice of the user.
 *
 * @author Robert
 * Created 4/25/2017.
 */
public class CustomDecimalRounder implements DecimalRounder {
    private double workingDouble;
    private int decimalPlaces;

    /**
     * Constructor CustomDecimalRounder(double, int, boolean) -
     *
     * This is a standard constructor for CustomDecimalRounder which allows the user to input the default value,
     * the number of places the decimal should round, and whether or not to force it to round up.
     *
     * @param workingDouble A double representing the default value to work with.
     * @param decimalPlaces An int representing the number of places the decimal should round to.
     * @param forceCeiling A boolean representing whether or not to force the decimal to round up.
     */
    public CustomDecimalRounder(double workingDouble, int decimalPlaces, boolean forceCeiling) {
        this.workingDouble = workingDouble;
        this.decimalPlaces = decimalPlaces;
        roundDecimalPlaces(forceCeiling);
    }

    /**
     * Private Method roundDecimalPlaces(boolean) -
     *
     * This method is an inner workings method called by the constructor and setValue(double) in order to setup the
     * value for storage.
     *
     * @param forceCeiling A boolean representing if the method should force the value to round up.
     */
    private void roundDecimalPlaces(boolean forceCeiling) {
        double temp = workingDouble;

        int wholeNumber = (int)temp;
        double tempDecimal = workingDouble - (double)wholeNumber;

        double multipliedDecimal = tempDecimal * Math.pow(10, decimalPlaces);

        double x = multipliedDecimal - ((int)multipliedDecimal);
        int roundingNumber = (int)(x * 10);
        boolean shouldRoundUp = roundingNumber >= 5;

        if (forceCeiling || shouldRoundUp) {
            multipliedDecimal = Math.ceil(multipliedDecimal);
        }
        else {
            multipliedDecimal = Math.floor(multipliedDecimal);
        }

        tempDecimal = multipliedDecimal / Math.pow(10, decimalPlaces);
        workingDouble = (double)wholeNumber + tempDecimal;
    }

    /**
     * Method setValue(double, boolean) -
     *
     * This method manually sets a new value similar to the way the constructor is called to set a new value and
     * whether the user wants the value to round up or not.
     *
     * @param workingDouble A double representing what the new value should be.
     * @param forceCeiling A boolean representing if the value should round up.
     */
    @Override
    public void setValue(double workingDouble, boolean forceCeiling) {
        this.workingDouble = workingDouble;
        roundDecimalPlaces(forceCeiling);
    }

    /**
     * Getter Method getValue() -
     *
     * This method gets the currently stored value.
     *
     * @return A double representing the currently stored value.
     */
    @Override
    public double getValue() {
        return this.workingDouble;
    }

    /**
     * Override Method toString() -
     *
     * This method gives a String representation of the current state of the object with the proper
     * formatting.
     *
     * @return A String representation of the value and it's formatting.
     */
    @Override
    public String toString() {
        return String.format("%." + decimalPlaces + "f", workingDouble);
    }
}
