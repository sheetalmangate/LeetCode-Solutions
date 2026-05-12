package arrays;

import java.util.HashMap;

public class TwoSum {
	
	public static int[] solution(int[] nums, int target) {
        
		int value = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] result = new int[2];
		
		for(int i = 0; i< nums.length; i++ ) {
			
			value = target - nums[i];
			
			if(map.containsKey(value)) {
				
				result[0] = map.get(value);
				result[1] = i;
			}
			
			map.put(nums[i], i);
		}
		
		return result;
    }
	
}