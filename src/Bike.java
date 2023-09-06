/**
 * Bike class will be extended by three subclasses, named whatever you like:
 * 1. A bike with no suspension,
 * 2. A bike with a hardtail suspension,
 * 3. A bike with full suspension
 *
 * For each subclass, implement ride to print a message for ride
 * about the ride experience for that type of bike
 *
 */
public abstract class Bike {
    private String suspensionType; // none, hardtail, full
    private String modelName;

    public Bike(String modelName, String suspensionType) {
        this.modelName = modelName;
        this.suspensionType = suspensionType;
    }

    public void ride() {}
}
