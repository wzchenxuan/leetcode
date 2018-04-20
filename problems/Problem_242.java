package leetCode;

public class Problem_242 {
	
	public static boolean isAnagram(String s, String t) {
		//解题思路来自讨论区
		//定义一个长度为26的int数组存放字母信息
		int[] arr = new int[26];

		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 'a']++;
		}
		
		for (int i = 0; i < t.length(); i++) {
			arr[t.charAt(i) - 'a']--;
			if (arr[t.charAt(i) - 'a'] < 0) {
				return false;
			}
		}
		
		for (int i : arr) {
			if (i != 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isAnagram("a", "b"));
		
	}
}
