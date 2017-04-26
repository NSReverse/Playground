package mx.x10.reverseeffectapps.math.rounding;

/**
 * Class TwoPlaceDecimalRounder -> DecimalRounder -
 *
 * This class allows for a String-formatted decimal rounding with two places.
 *
 * @author Robert
 * Created 4/25/2017.
 */
public class TwoPlaceDecimalRounder implements DecimalRounder {
    private double workingDouble;

    /**
     * Constructor TwoPlaceDecimalRounder(double, boolean) -
     *
     * This is a standard constructor for TwoPlaceDecimalRounder which allows the user to input the default
     * value and whether or not the value should round up.
     *
     * @param workingDouble A double representing the default value to work with.
     * @param forceCeiling A boolean representing whether or not to force the decimal to round up.
     */
    public TwoPlaceDecimalRounder(double workingDouble, boolean forceCeiling) {
        this.workingDouble = workingDouble;
        roundTwoDecimalPlaces(forceCeiling);
    }

    /**
     * Private Method roundTwoDecimalPlaces(boolean) -
     *
     * This method is an inner workings method called by the constructor and setValue(double) in order
     * to setup the value for storage.
     *
     * @param forceCeiling A boolean representing if the method should force the value up.
     */
    private void roundTwoDecimalPlaces(boolean forceCeiling) {
        double temp = workingDouble;

        int wholeNumber = (int)temp;
        double tempDecimal = workingDouble - (double)wholeNumber;

        double multipliedDecimal = tempDecimal * 100;

        double x = multipliedDecimal - ((int)multipliedDecimal);
        int roundingNumber = (int)(x * 10);
        boolean shouldRoundUp = roundingNumber >= 5;

        if (forceCeiling || shouldRoundUp) {
            multipliedDecimal = Math.ceil(multipliedDecimal);
        }
        else {
            multipliedDecimal = Math.floor(multipliedDecimal);
        }

        tempDecimal = multipliedDecimal / 100;
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
        roundTwoDecimalPlaces(forceCeiling);
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
        return workingDouble;
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
        return String.format("%.2f", workingDouble);
    }
}
