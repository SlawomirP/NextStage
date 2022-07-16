package ex703;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {6, 5,4,97,3,1, 8, 7, 11};
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));

    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for(Integer number : array){
            if(number < smallest){
                smallest = number;
            }
        }
        return smallest;
    }
    public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int smallestIndex = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] <= smallest){
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] array, int position){}
}