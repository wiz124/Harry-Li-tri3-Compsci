package challenges.sortalgo;

import java.time.Duration;
import java.time.Instant;

public class Insertionsort extends Allsort {
    public Insertionsort(int size) {
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

        // traverse array
        for (int j = 1; j < data.size(); j++) {
            int current = data.get(j);
            int i = j - 1;

            // find place to insert
            while ((i > -1) && (data.get(i) > current)) {
                // swap if out of order
                data.set(i + 1, data.get(i));
                i--;
                comparisons += 2;
                swap++;
            }
            // insert
            data.set(i + 1, current);

        }

    }
}
