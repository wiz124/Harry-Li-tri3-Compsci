package challenges.sortalgo;

import java.time.Duration;
import java.time.Instant;

public class selectionsort extends Allsort {
    public selectionsort(int size) {
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
        for (int i = 0; i < data.size() - 1; i++) {

            // find smallest num between (i + 1) element and last element
            int position = i;
            for (int j = i; j < data.size(); j++) {
                if (data.get(j) < data.get(position))
                    position = j;
                comparisons++;
            }

            // Swap smallest number to current array position
            int min = data.get(position);
            data.set(position, data.get(i));
            data.set(i, min);
            swap++;
        }

    }
}
