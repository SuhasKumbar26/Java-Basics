public class StringConcatenate {

    public static String concatenate(String... string){
        StringBuilder sb = new StringBuilder();
        for (String s : string) {
            sb.append(s).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(concatenate("Hello", "Java","Developers","hope","You", "all are","doing","Good"));
    }
}
