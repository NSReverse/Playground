package mx.x10.reverseeffectapps.math.rounding;

/**
 * Interface DecimalRounder -
 *
 * This interface provides some prototyping methods for subclasses.
 *
 * @author Robert
 * Created 4/25/2017.
 */
public interface DecimalRounder {
    public abstract void setValue(double workingDouble, boolean forceCeiling);
    public abstract double getValue();
    public abstract String toString();
}
