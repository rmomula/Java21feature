public class StructuredConcurrency {
    public static void main(String[] args) {

        // Create a scoped value
        var techGearShowScopedValue = ScopedValue.of(10);
        // Use the scoped value in a concurrent block
        concurrent(() -> {
        // The scoped value is accessible here
        System.out.println("The techGearShow scoped value is " + techGearShowScopedValue.get());
        });
    }
}
