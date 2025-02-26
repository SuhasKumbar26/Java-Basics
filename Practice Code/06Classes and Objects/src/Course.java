public class Course {

    static int maxCapacity = 3;
    String courseName;
    int totalStudentEnrolled;

    Course (String courseName){
        this.courseName = courseName;
    }

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudents(){
        if (this.totalStudentEnrolled >= maxCapacity){
            System.out.println("Course already filled..");
        } else {
            System.out.println("Enrolled");
            this.totalStudentEnrolled++;
        }

    }

    void UnEnrollStudents(){
        if (this.totalStudentEnrolled > 0){
            System.out.println("UnEnrolled");
            this.totalStudentEnrolled--;
        } else System.out.println("No one enRolled yet");
    }

    public static void main(String[] args) {
        Course design = new Course("design");
        design.enrollStudents();
        design.enrollStudents();
        design.enrollStudents();
        design.enrollStudents();
        System.out.println("totalStudentEnrolled: "+design.totalStudentEnrolled);
        System.out.println("------------------");
        design.UnEnrollStudents();
        design.UnEnrollStudents();
        design.UnEnrollStudents();
        design.UnEnrollStudents();
        System.out.println("totalStudentEnrolled: "+design.totalStudentEnrolled);
    }

}
