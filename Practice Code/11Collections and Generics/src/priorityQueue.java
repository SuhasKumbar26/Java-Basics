import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> studentsList = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getGrade() - s2.getGrade();
            }
        });

        studentsList.offer(new Student("Don",'A'));
        studentsList.offer(new Student("Pari",'D'));
        studentsList.offer(new Student("John",'B'));
        studentsList.offer(new Student("Smith",'C'));
        studentsList.offer(new Student("Suh",'A'));

        System.out.println(studentsList);
        System.out.println("Got: "+studentsList.poll());
        System.out.println("Got: "+studentsList.poll());
        System.out.println("Got: "+studentsList.poll());
        System.out.println("Got: "+studentsList.poll());
        System.out.println("Got: "+studentsList.poll());
        System.out.println(studentsList);
    }

    //Student class
    public static class Student{
        private final String name;
        private final char grade;

        public Student(String name, char grade){
            this.name = name;
            this.grade = grade;
        }

        public String getName(){
            return this.name;
        }

        public char getGrade(){
            return this.grade;
        }

        @Override
        public String toString() {
            return name + ": "+grade;
        }
    }
}
