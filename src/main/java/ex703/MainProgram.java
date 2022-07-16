package ex703;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
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

    public static int indexOfSmallestFrom(int[] array, int position){
        int smallest = array[position];
        int smallestIndex = position;
        for(int i = position; i < array.length; i++){
            if(array[i] < smallest){
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

}