package own;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecodLargestNumber {
	public static void main(String[] args) {
		int[]data= {3,2,11,4,6,7,2,3,3,3,6,8,7};
		Set<Integer> num=new TreeSet<>();
		for (int i = 0; i < data.length; i++) {
			num.add(data[i]);
		}
		List<Integer> bigNumber=new ArrayList<Integer>(num);
		int size=bigNumber.size();
		System.out.println(size);
		
	}

}
