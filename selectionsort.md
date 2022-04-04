# Selection Sorting Algorithms analysis:
### Terms to know:
  - time complexity 
      - amount of computer time it takes to run the algorithm
  - space complexity
      - amount of memory required by the algorithm until complete execution
## Selection Sort:
How it works:
  - loops through nth element to last element of array
  - always begins with n=0 and n increments by 1 each time elements are traversed
  - each time we traverse array, we find smallest element and swap it with nth position element
``` java
for (int i = 0; i < array.size()-1; i++) {

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
```
### Big O complexity:
  - case time complexity
      - Worst case, best case, and average case: O(N^2)
      - the number of comparisons are constant for each case due to the nature of the double for loops
      - given this, selection sort more inefficient as data set becomes bigger 
  - space complexity 
      - O(1): algorithm just needs to keep track of elements for swapping and smallest element in unsorted array
      - requires very little memory 
     
### Analytics:
All tests showed 4999 swaps 

12502499 comparisons made for each test

total time taken for the tests was .422 seconds

average time for each test was .0352 seconds

longest time taken was .0618 seconds

shortest time taken was .0279 seconds
