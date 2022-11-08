package own;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MissingElement {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,7,8,9,10};
		Arrays.sort(arr);
		Set<Integer>num=new TreeSet<>();
		
		for(int i=0;i<arr.length;i++) {
			int j=i+1;
			if(j!=arr[i]) {
				System.out.println(j);
				break;
	}

}
}
}