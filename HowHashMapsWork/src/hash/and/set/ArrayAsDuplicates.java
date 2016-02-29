package hash.and.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class ArrayAsDuplicates {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(3);
		list.add(2);
		
		Set<Integer> duplicates = new HashSet(Arrays.asList(list));
		
		for(Integer e : duplicates) {
			System.out.println(e);
		}
	}
}
