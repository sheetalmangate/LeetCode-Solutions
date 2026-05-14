/**
* LeetCode : Find K Distant Indices
*
*/

package arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class FindKDistantIndices {
	
	public static List<Integer> solution(int[] nums, int key, int k) {
        
		List<Integer> j = new ArrayList<>();
		LinkedHashSet<Integer> temp = new LinkedHashSet<>(); 
		
		for(int i = 0; i<nums.length; i++ ) {
			
			if(nums[i] == key ) j.add(i);
		}
		
		for(int i = 0; i<j.size(); i++ ) {
			
			for(int n = 0; n < nums.length; n++ ) {
				
				if(Math.abs(n - j.get(i)) <= k )
					temp.add(n);
			}
		}
		
		return new ArrayList<>(temp);
    }
	
}