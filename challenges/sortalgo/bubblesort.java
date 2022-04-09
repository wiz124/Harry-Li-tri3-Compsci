package challenges.sortalgo;

import java.time.Duration;
import java.time.Instant;

public class bubblesort extends Allsort {
    public bubblesort(int size) {
        size(size);
    }

    public void size(int size) {
        //start sort test
        Instant start = Instant.now();
        super.size(size);
        sort();
        Instant end = Instant.now();
        this.timeElapsed = Duration.between(start, end);
    }

    public void sort() {
        // traverse and repeat traversing array
        for (int i = 0; i < data.size() - 1; i++) {
            for (int j = data.size() - 1; j > i; j--) {
                // compare elements
                comparisons++;
                if (data.get(j - 1) > data.get(j)) {
                    // Swap
                    int tmp = data.get(j - 1);
                    data.set(j - 1, data.get(j));
                    data.set(j, tmp);
                    swap++;
                }
            }
        }

    }

}
