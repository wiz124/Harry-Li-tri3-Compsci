# Merge Sorting Algorithms analysis:
### Terms to know:
  - time complexity 
      - amount of computer time it takes to run the algorithm
  - space complexity
      - amount of memory required by the algorithm until complete execution
## Merge Sort:
How it works:
  - splits array into pieces of 2
  - these pieces are then sorted
  - then pieces are merged and sorted until all data merged and sorted
  - basically a case of divide and conquer
``` java
//method begin
divide(0,array.size()-1);
//method end


public void divide(int start, int end) {
        if (start < end && (end - start) >= 1) {
            int mid = (end + start) / 2;
            //recursion
            divide(start, mid);
            divide(mid + 1,end );
            merger(start, mid, end);
        }
    }
    public void merger(int start, int mid, int end){

        //arraylist that will be the new sorted array
        ArrayList<Integer> mergedSortedArray = new ArrayList<>();

        int leftIndex = start;
        int rightIndex = mid+1;

        while(leftIndex<=mid && rightIndex<=end){
            if(input.get(leftIndex)<=input.get(rightIndex)){
                mergedSortedArray.add(input.get(leftIndex));
                leftIndex++;
            }else{
                mergedSortedArray.add(input.get(rightIndex));
                rightIndex++;
            }
            compare++;
        }

        //Either of below while loop will execute
        while(leftIndex<=mid){
            mergedSortedArray.add(input.get(leftIndex));
            leftIndex++;
        }

        while(rightIndex<=end){
            mergedSortedArray.add(input.get(rightIndex));
            rightIndex++;
        }

        int i = 0;
        int j = start;


        while(i<mergedSortedArray.size()){
            input.set(j, mergedSortedArray.get(i++));
            j++;
        }

    }
```
### Big O complexity:
  - case time complexity 
      - best case, worst case, and average case: O(n*log(n))
      - ability to divide work makes it very fast
  - space complexity
      - O(n), amount of subarrays increases as data set increases
      - larger datasets requires more memory
### Analytics:
No swaps in merge sort needed

Around 55 thousand comparisons done



