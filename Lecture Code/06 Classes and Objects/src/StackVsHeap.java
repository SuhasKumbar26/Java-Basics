public class StackVsHeap {
    public static void main(String[] args) {
        System.out.println("Stack v/s Heap memory");
        System.out.println("---------------------");
        System.out.println("Stack: ");
        System.out.println("""
                1.Ordered on top of each other
                2.Where method invocation & local variables are alive
                3.Object references(address) are stored here""");
        System.out.println("---------------------");
        System.out.println("Heap: ");
        System.out.println("""
                1.No particular order is maintained
                2.Where real objects are stored Here""");

    }
}
