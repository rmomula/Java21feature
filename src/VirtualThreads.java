public class VirtualThreads {
    public static void main(String[] args) {
    
            // Create a virtual thread
    var techGearShowVirtualThread = VirtualThread.of(() -> {
    System.out.println("Hello from the techGearShow virtual thread!");
    });
    // Start the virtual thread
    techGearShowVirtualThread.start();

    // Do some work in the main thread
    System.out.println("Hello from the main thread!");

    // Wait for the virtual thread to finish
    techGearShowVirtualThread.join();
    }
}
