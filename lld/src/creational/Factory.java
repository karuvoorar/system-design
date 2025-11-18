package creational;

/**
 * We don't want to make changes to the logic class rather we use the factory
 * class to create the object for us based on the i/p param we provide
 *
 * The logic for instance creation is segregated from actual logic
 * So, any change in additional use case of adding more logistics
 * it will be added in factory class
 *
 * Pros
 * - Improves code reusability
 * - Promotes Loose coupling
 * - Centralizes Object creation
 *
 * Cons
 * - Code will be little lengthy, core complexity
 * - More code overhead
 */
public class Factory {

    public static void main(String[] args) {
        Logistics logistics = LogisticsFactory.getLogistics("Sea");
        logistics.send();
    }
}

// Factory Class taking care of Logistics
class LogisticsFactory {
    public static Logistics getLogistics(String mode) {
        if (mode.equalsIgnoreCase("Sea")) {
            return new Sea();
        } else if (mode.equalsIgnoreCase("Road")) {
            return new Road();
        }
        throw new IllegalArgumentException("Unknown logistics mode: " + mode);
    }
}

/**
 * Below is some example for understanding
 */
interface Logistics {
    void send();
}

class Road implements Logistics {

    @Override
    public void send() {
        System.out.println("Sending goods via road...");
    }
}

class Sea implements Logistics {

    @Override
    public void send() {
        System.out.println("Sending goods via sea...");
    }
}