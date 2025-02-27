package ToString;

public class StudentToString {
    String name;
    int age;

    StudentToString (String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append("My name is ").append(name);
        sb.append(" and my age is: ").append(this.age);
        return sb.toString();
    }

    public static void main(String[] args) {
        StudentToString student = new StudentToString("Suhas",21);
        System.out.println(student);
    }

}
