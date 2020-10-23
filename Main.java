import java.util.Random;
public class Main {
    public static void main(String[] args) {

        ShuttleSort shuttleSort = new ShuttleSort(10000);
        System.out.print("time shuttle sort "+shuttleSort.sortWithTime()+"\n");
        //System.out.println(shuttleSort);
        QuickSort quickSort = new QuickSort(10000);
        System.out.println("time quick sort "+quickSort.sortWithTime()+"\n");

        //System.out.println(quickSort);
    }
}
