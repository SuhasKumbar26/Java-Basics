public class StringBuilderClass {
    public static void main(String[] args) {
        //StringBuilder
        StringBuilder sentence = new StringBuilder("Hello");
        sentence.append(" java");
        sentence.append(" Developers");
        System.out.println(sentence);

        //StringBuffer(Safe fast)
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" Learners...");
        System.out.println(stringBuffer);


        System.out.println("""
                \nString
                            mutable: Immutable
                            Storage: String Pool
                            Thread safety: Not used in threaded environments
                            Speed: Slowest
                
                StringBuilder
                            mutable: mutable
                            Storage: Heap
                            Thread safety: Not Thread safe but used in SINGLE thread environments
                            Speed: Fastest
                
                "StringBuffer"
                            mutable: mutable
                            Storage: Heap
                            Thread safety: Thread SAFE but used in Multi-thread environments
                            Speed: Fast
                """);
    }
}
