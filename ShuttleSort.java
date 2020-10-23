import java.util.Arrays;

public class ShuttleSort extends Sortinger{

    public int[] array;
    ShuttleSort(int n){
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random()*30 ) + 15);
        }
    }

    @Override
    public String toString() {
        return "ShuttleSort{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
    @Override
    void sort() {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i, i - 1);
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (array[z] < array[z - 1]) {
                        swap(array, z, z - 1);
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
