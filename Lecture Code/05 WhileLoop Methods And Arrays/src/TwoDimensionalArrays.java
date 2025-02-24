public class TwoDimensionalArrays {
    public static void main(String[] args) {

        int[][] arr = new int[2][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        char[][] num = {{'a','b','c'},{'d','e'}};
        /*
        *      -----------
        *   0 | a   b   c |
        *   1 | d   e   - |
        *      -----------
         */

        int i = 0;
        while (i < arr.length){
            int j = 0;
            while (j < arr[i].length){
                System.out.println("index ["+i+"]"+"["+j+"]: "+arr[i][j]);
                j++;
            }
            i++;
        }

        System.out.println();
        int k = 0;
        while (k < num.length){
            int j = 0;
            while (j < num[k].length){
                System.out.print(num[k][j]+" ");
                j++;
            }
            System.out.println();
            k++;
        }
    }
}
