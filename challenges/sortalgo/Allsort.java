package challenges.sortalgo;

import java.time.Duration;
import java.util.ArrayList;

public class Allsort {
    public ArrayList<Integer> data= new ArrayList<>();
    public Duration timeElapsed;
    public static int swap = 0;
    public static int comparisons = 0;


    public void size(int size) {
        swap =0;
        comparisons=0;
        for (int i = 0; i < size; i++) {
            data.add((int) (Math.random() * (size + 1)));
        }
    }
    public ArrayList<Integer> getData() {
        return data;
    }

    public long getTimeElapsed() {
        return timeElapsed.getNano();
    }

    public int getComparisons(){
        return comparisons;
    }

    public int getSorts(){
        return swap;
    }
}

