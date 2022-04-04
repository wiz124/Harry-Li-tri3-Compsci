{% include navigation.html %}
# Insertion Sorting Algorithms analysis:
### Terms to know:
  - time complexity 
      - amount of computer time it takes to run the algorithm
  - space complexity
      - amount of memory required by the algorithm until complete execution
## Insertion Sort:
How it works:
  - let n=0
  - compare nth element to (n+1)th element in array
  - if these elements are out of order, then finds place to insert (n+1)th element in previously sorted/compared elements to make previously sorted/compared elements in order
  - keep traversing array to find unordered elements and inserting smallest element in correct place among previously sorted elements
  - basically sorts array one element at a time
``` java
 for (int j = 1; j < array.size(); j++) {
            int current = array.get(j);
            int i = j-1;
            //find place to insert

            while ((i > -1) && (array.get(i) > current)) {
                array.set(i+1,array.get(i));
                i--;
                compare=compare+2;
                swap++;
            }
            //insert
            array.set(i+1, current);


        }
```
### Big O complexity:
  - case time complexity
      - Worst case and average case: O(n^2), nothing changes no matter how many insertions as long as there are insertions to be made
      - best case: O(n), due to having only to iterate one for loop when data already sorted
      - not very good at sorting larger pieces of data
  - space compelexity
      - O(1), algorithm just keeps track of nth element position to resume comparison operation. 
     
### Analytics:
About 6.3 to 6.1 million swaps occurred for each test on average

About 12.5 to 12.6 comparisons were made for each test on average

total seconds taken for the 12 tests was .385 seconds

average time taken for each test was .0321 seconds

shortest time taken was .0269 seconds

longest time takesn was .0638 seconds
