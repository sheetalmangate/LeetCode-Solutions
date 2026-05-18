/**
* LeetCode : Move Zeros
*
*/


package arrays;

import java.util.Arrays;


public class MoveZeroes {
	
	public static void solution(int[] nums) {
		
		int j = 0;
		
		for( int i =0; i<nums.length; i++ ) {
			
			if( nums[i] != 0 ) {
				
				if( i != j ) {
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
				j++;
			}
			
		}
		
    }
	
	public static void main(String[] args ) {
		
		int[] nums = {0,1,0,3,12};
		MoveZeroes.solution(nums);
	}
}
