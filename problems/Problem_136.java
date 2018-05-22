import java.util.HashMap;

public class Problem_136 {
	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] {1,2,1,2,3}));
	}
	
	public static int singleNumber(int[] nums) {
	    HashMap<Integer, Integer> map=new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			}else {
				map.put(nums[i], map.get(nums[i])+1);
			}
		}
		for (int i : nums) {
			if (map.get(i) == 1) {
				return i;
			}
		}
	    return 0;
	}
}
