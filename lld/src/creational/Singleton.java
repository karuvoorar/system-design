package creational;

/**
 * It is a creational pattern, When we don't want to create a new object of a
 * class every time, basically using the same object again and again for the
 * work, Singleton is the use case for it.
 *
 * - Throughout the application lifecycle we have only one object of this.
 * - E.g. Databases, Analytics, Logging
 *
 * Pros:
 * - Clean implementation
 * - supports lazy loading
 *
 * Cons:
 * - Hard to write unit tests
 * - Violates SRP - code logic, has to be maintained properly
 * - Special cases to avoid race condition
 */
public class Singleton { // this is thread safe

    // private field to avoid direct call
    // Eager loading bcs it is created at class loading level
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        // this is private ctor to avoid instance creation by the external classes.
    }

    // public method to access this instance of this class.
    public static Singleton getInstance() {
        // Eager loading
        return INSTANCE;

        /**
         * This is lazy loading, not thread safe
         * if(INSTANCE == null) {
         * INSTANCE = new Singleton();
         * } else return INSTANCE;
         */
    }
}
