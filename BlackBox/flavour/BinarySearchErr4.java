package flavour;

import src.BinarySearchFlavour;

public class BinarySearchErr4 extends BinarySearchFlavour {

    private static final boolean correctness = false;

    public int binarySearch(int [] arr, int low, int high, int elem) {

        if(low > high || low < 0 || high > arr.length-1){
            return -2;
        }

        while (high >= low) {

            int mid = (low + high) / 2;

            if (arr[mid] == elem){
                return mid;
            }

            if (arr[mid] > elem){
                high = mid - 1;
            } else {
                low = mid - 1; //mistake is here
            }

        }

        // not found.
        return -1;
    }

    @Override
    public boolean correctness(){
        return correctness;
    }
}
