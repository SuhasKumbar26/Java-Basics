public class MathClass {
    public static void main(String[] args){

        System.out.println(Math.abs(-89));
        System.out.println(Math.ceil(19.01));
        System.out.println(Math.floor(67.9));
        System.out.println(Math.round(29.1));
        System.out.println(Math.max(23,17));
        System.out.println(Math.min(-89,12));
        System.out.println(Math.pow(3,2));
        System.out.println(Math.sqrt(5));
        System.out.println(Math.PI);

        //Random
//      System.out.println(Math.random());

        for (int i = 0; i < 10; i++) {
            int random = (int) Math.round(Math.random() * 10);
            System.out.println(random);
        }
    }
}
