import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		// Set<Integer> set = new HashSet<Integer>();
		// Set<Integer> set = new LinkedHashSet<Integer>(); //display data in the order,
		// element is added
		// Set<Integer> set = new TreeSet<Integer>();
		/*
		 * for (int i = 30; i > 0; i--) { set.add(i); } for (Integer integer : set) {
		 * System.out.println(integer); }
		 */

		Set<String> set = new TreeSet<String>();

		for (int i = 30; i > 0; i--) {
			set.add("A " + i);
		}
		for (String integer : set) {
			System.out.println(integer);
		}
	}

}
