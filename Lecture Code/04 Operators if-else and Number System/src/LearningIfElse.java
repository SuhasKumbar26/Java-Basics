public class LearningIfElse {
    public static void main(String[] args){
        boolean isMale = false;
        String name = "Sahil";
        if (isMale){
            System.out.print("Mr. "+name);
        } else System.out.print("Ms. "+name);

        boolean isSeniorCitizen = false;
        boolean isAdult = false;

        if (isSeniorCitizen){
            System.out.println("\n50% discount");
        } else if (isAdult) {
            System.out.println("\n25% discount");
        } else System.out.println("\nNo discount....");
    }
}
