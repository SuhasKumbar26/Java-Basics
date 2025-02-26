public class GarbageCollection {
    public static void main(String[] args) {
        System.out.println("Garbage collection");
        System.out.println("""
                1.Garbage collection is automatically done by the JVM.
                2.Object those don't have reference are eligible for Garbage.
                3.It uses Generational Garbage collection strategy(Young,Old,Permanent generations).
                4.It's full controlled by JVM , No manual control given to developer.
                5.Garbage collection happens in Heap memory.
                """);
    }
}
