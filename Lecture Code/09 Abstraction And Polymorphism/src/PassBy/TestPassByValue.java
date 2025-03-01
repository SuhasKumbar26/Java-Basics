package PassBy;


public class TestPassByValue {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int sum = sum(x,y);
        System.out.printf("x:%d y:%d sum:%d",x,y,sum);
    }

    public static int sum(int a, int b){
        //return a+b;
         a = 95;
         return a+b;
    }
}
