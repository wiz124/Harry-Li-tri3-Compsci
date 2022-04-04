{% include navigation.html %}

# Bubble Sorting Algorithms analysis:
## Terms to know:
  - time complexity 
      - amount of computer time it takes to run the algorithm
  - space complexity
      - amount of memory required by the algorithm until complete execution
#### Bubble Sort:
How it works: 
  - swaps adjacent elements if they are in the wrong order
  - keeps traversing the array and swapping until array sorted
  

``` java
//traverse and repeat traversing array
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = array.size() - 1; j > i; j--) {
                //compare elements
                if (array.get(j - 1) > array.get(j)) {
                    //Swap
                    int temp = array.get(j - 1);
                    array.set(j -1, array.get(j));
                    array.set(j, temp);
                }
            }
        }
```
## Big O complexity: 
  - case time complexity:
      - has two loops which the inner loop does O(n) comparisons
      - worst case: O(n2), we assume that array fully disorganized and bubble sort has to keep sorting
      - average case: O(n2), we assume array partially sorted
      - best case: O(n), we assume array is fully sorted
      - bubble sort becomes more inefficient with larger data sets
  - space complexity: O(1)
      - bubble sort requires very little memory 
      - only needs to keep track of the extra variable during swapping
### Analytics:
Overall, around 6.1 million to 6.3 million swaps were made from the 12 tests

12497500 comparisons were made each test

total time of bubble sort was 1.67 seconds

average time of bubble sort was .14 seconds

Highest time was .236 seconds

Lowest time was .124 seconds
