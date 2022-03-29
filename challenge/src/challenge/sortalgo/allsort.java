package challenge.sortalgo;

import java.util.ArrayList;
import java.util.Collections;

public class allsort {
    public void sort(ArrayList<Integer> array){

    }
}
class bubblesort extends allsort{
    public void sort(ArrayList<Integer> array){

        int temp;
        int n =array.size();
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = array.size() - 1; j > i; j--) {
                if (array.get(j - 1) > array.get(j)) {
                    //Swap
                    int tmp = array.get(j - 1);
                    array.set(j -1, array.get(j));
                    array.set(j, tmp);
                }
            }
        }

    }

}
class selectionsort extends allsort{
    public void sort(ArrayList<Integer> array){

    }
}
class Insertionsort extends allsort{
    public void sort(ArrayList<Integer> array){

    }
}
class mergesort extends allsort{
    public void sort(ArrayList<Integer> array) {

    }
}