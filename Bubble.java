
public class Bubble {
    public static void main(String args[]) {

        int[] array = {9, 3, 7, 2, 5, 4, 1, 8, 6};
        System.out.println("Before running Bubble Sort ");

        for (int i =0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // this is to start a new line

      //  System.out.println(" Size of array " +  array.length );


        for (int i=0; i < array.length -1; i++)  // for loop for the next larger item to move to the correct position
         for (int j=0; j < array.length -i - 1; j++)  // for loop for the second variable to move to the correct position
             // System.out.print(j + " ");

             if (array[j] > array[j+1]) {
                int temp = array[j];
                array[j]= array[j+1];
                array[j+1] = temp;


             }
        System.out.println("After running Bubble Sort ");

        for (int i =0; i<array.length; i++) {
             System.out.print(array[i] + " ");
         }
    }
}