/*
Problem: 283. Move Zeroes
Difficulty: Easy

Approach:
- Traverse the array and move all non-zero elements to the front.
- Keep track of the next position using a pointer (count).
- After placing all non-zero elements, fill the remaining positions with 0.

Time Complexity: O(n)
Space Complexity: O(1)

*/

class Solution {
    public void moveZeroes(int[] nums) {
        int index=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            } 
            //[1,0,0,2,3] it makes array like [1,2,3,2,3] and index=2 
        }
        //index start from index=2 so we make other 0
        while(index<nums.length){ 
                nums[index]=0;
                index++;
            }
    }
}