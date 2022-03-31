{% include navigation.html %}

## Sorting Algorithms analysis:

#### Bubble Sort:
How it works: 
  -swaps adjacent elements if they are in the wrong order
  -keeps traversing the array and swapping until array sorted
``` java
//traverse and repeat traversing array
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = array.size() - 1; j > i; j--) {
                //compare elements
                if (array.get(j - 1) > array.get(j)) {
                    //Swap
                    int tmp = array.get(j - 1);
                    array.set(j -1, array.get(j));
                    array.set(j, tmp);
                }
            }
        }
```
