package ArraysProblem;

public class RemoveDuplicatesFromSorted {

    public int removeDuplicates(int[] nums) {
        int insertIndex = 1;

        for(int i = 1 ; i < nums.length ; i++) {
            //we skip to next index if we see a duplicate element
            if(nums[i-1] != nums[i]) {
                //storing the unique element at insertIndex and increment the insertIndex by 1
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }
}
