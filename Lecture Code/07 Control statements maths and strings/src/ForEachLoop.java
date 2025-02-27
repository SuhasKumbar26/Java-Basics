public class ForEachLoop {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,0};

        String[] array = new String[] {
                "suhas","kartik","pratap","pradeep"
        };

        //printing array elements using traditional for loop
        ForLoop(array);

        //printing array elements using ENHANCED for loop
        EnhancedForLoop(numbers);
    }

    //printing array elements using traditional for loop Method
    public static void ForLoop(String[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    //printing array elements using ENHANCED for loop Method
    public static void EnhancedForLoop(int[] arr){
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
