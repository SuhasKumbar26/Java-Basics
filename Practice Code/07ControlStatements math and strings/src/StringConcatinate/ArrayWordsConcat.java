package StringConcatinate;

public class ArrayWordsConcat {
    public static void main(String[] args){
        String[] name = {"Hello","java","developers","how","are","you","All...?"};
        StringBuilder sb = new StringBuilder();
        for (String str : name) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
