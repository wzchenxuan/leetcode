import java.util.ArrayList;
import java.util.List;

public class Problem_821 {
	public static void main(String[] args) {
		int[] result=shortestToChar("loveleetcode",'e'); //Expected: [3,2,1,0,1,0,0,1,2,2,1,0]
		for (int i : result) {
			System.out.print(i+" ");
		}
	}

	public static int[] shortestToChar(String S, char C) {
		List<Integer> index=new ArrayList<>();
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == C) {
				index.add(i);
			}
		}
		int [] result=new int[S.length()];
		for (int i = 0; i < S.length(); i++) {
			int min=Integer.MAX_VALUE;
			for (int j : index) {
				min=Math.min(min, Math.abs(j-i));
			}
			result[i]=min;
		}
		return result;
	}
}
