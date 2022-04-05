package challenges.sortalgo;

import java.util.ArrayList;

public class allsort {
    public void sort(ArrayList<Integer> array) {

    }
}

class bubblesort extends allsort {

    @Override
    public void sort(ArrayList<Integer> array) {
        // traverse and repeat traversing array
        int swap = 0;
        int compare = 0;
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = array.size() - 1; j > i; j--) {
                // compare elements
                compare++;
                if (array.get(j - 1) > array.get(j)) {
                    // Swap
                    int tmp = array.get(j - 1);
                    array.set(j - 1, array.get(j));
                    array.set(j, tmp);
                    swap++;
                }
            }
        }
        System.out.println("swaps: " + swap);
        System.out.println("comparisons: " + compare);
    }

}

class selectionsort extends allsort {
    @Override
    public void sort(ArrayList<Integer> array) {
        int swap = 0;
        int compare = 0;
        for (int i = 0; i < array.size() - 1; i++) {

            // find smallest num between (i + 1) element and last element
            int position = i;
            for (int j = i; j < array.size(); j++) {
                if (array.get(j) < array.get(position))
                    position = j;
                compare++;
            }

            // Swap smallest number to current array position
            int min = array.get(position);
            array.set(position, array.get(i));
            array.set(i, min);
            swap++;
        }
        System.out.println("swaps: " + swap);
        System.out.println("comparisons: " + compare);
    }
}

class Insertionsort extends allsort {
    @Override
    public void sort(ArrayList<Integer> array) {
        int compare = 0;
        int swap = 0;
        // traverse array
        for (int j = 1; j < array.size(); j++) {
            int current = array.get(j);
            int i = j - 1;

            // find place to insert
            while ((i > -1) && (array.get(i) > current)) {
                // swap if out of order
                array.set(i + 1, array.get(i));
                i--;
                compare = compare + 2;
                swap++;
            }
            // insert
            array.set(i + 1, current);

        }
        System.out.println("Swap: " + swap);
        System.out.println("comparisons: " + compare);
    }
}

class mergesort extends allsort {
    private ArrayList<Integer> input;
    private int compare = 0;

    @Override
    public void sort(ArrayList<Integer> array) {
        input = array;
        // start of recursion in dividing up array
        divide(0, array.size() - 1);
        System.out.println("Comparison: " + compare);
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
            if (input.get(leftIndex) <= input.get(rightIndex)) {
                // noswaps here
                mergedSortedArray.add(input.get(leftIndex));
                leftIndex++;
            } else {
                mergedSortedArray.add(input.get(rightIndex));
                rightIndex++;
            }
            compare++;
        }

        // Either of below while loop will execute
        while (leftIndex <= mid) {
            mergedSortedArray.add(input.get(leftIndex));
            leftIndex++;
        }

        while (rightIndex <= end) {
            mergedSortedArray.add(input.get(rightIndex));
            rightIndex++;
        }

        int i = 0;
        int j = start;

        while (i < mergedSortedArray.size()) {
            input.set(j, mergedSortedArray.get(i++));
            j++;
        }

    }

}
