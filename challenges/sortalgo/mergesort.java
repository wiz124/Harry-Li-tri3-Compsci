package challenges.sortalgo;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class mergesort extends Allsort {

    public mergesort(int size) {
        size(size);
    }

    public void size(int size) {
        Instant start = Instant.now();
        super.size(size);
        sort();
        Instant end = Instant.now();
        this.timeElapsed = Duration.between(start, end);
    }

    public void sort() {
        // start of recursion in dividing up array
        divide(0, data.size() - 1);
    }

    // dividing arraylist and prepping for merge
    public void divide(int start, int end) {
        if (start < end && (end - start) >= 1) {
            int mid = (end + start) / 2;
            // recursion
            divide(start, mid);
            divide(mid + 1, end);
            merger(start, mid, end);
        }
    }

    public void merger(int start, int mid, int end) {

        // arraylist that will the new sorted array
        ArrayList<Integer> mergedSortedArray = new ArrayList<>();

        int leftIndex = start;
        int rightIndex = mid + 1;

        // merging array pieces
        while (leftIndex <= mid && rightIndex <= end) {
            if (data.get(leftIndex) <= data.get(rightIndex)) {
                // noswaps here
                mergedSortedArray.add(data.get(leftIndex));
                leftIndex++;
            } else {
                mergedSortedArray.add(data.get(rightIndex));
                rightIndex++;
            }
            comparisons++;
        }

        // Either of below while loop will execute
        while (leftIndex <= mid) {
            mergedSortedArray.add(data.get(leftIndex));
            leftIndex++;
        }

        while (rightIndex <= end) {
            mergedSortedArray.add(data.get(rightIndex));
            rightIndex++;
        }

        int i = 0;
        int j = start;

        while (i < mergedSortedArray.size()) {
            data.set(j, mergedSortedArray.get(i++));
            j++;
        }

    }

}
