public class StringFormat {
    public static void main(String[] args) {
        String name = "Max";
        int marks = 988975;
        System.out.println("Hello "+name+", Your marks are: "+marks);

        //String format
        System.out.printf("Hello %s, Your marks are: %d\n",name,marks);

        System.out.printf("Name: '%s' %n",name);
        System.out.printf("Name: %S  \n",name);
        System.out.printf("Name: %5s \n",name);
        System.out.printf("Name: %-5s \n",name);

        System.out.printf("Marks are: %d\n",marks);
        System.out.printf("Marks are: %010d\n",marks);
        System.out.printf("Marks are: %+d\n",marks);
        System.out.printf("Marks are: %-10d\n",marks);
        System.out.printf("Marks are: %0,10d\n",marks);
    }
}
