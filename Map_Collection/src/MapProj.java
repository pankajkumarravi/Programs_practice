import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapProj {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Pankaj kumar");
		map.put(3, "Neeraj kumar");
		map.put(2, "mohan kumar");
		map.put(10, "Rohan kumar");
		map.put(6, "Jatan veer");
		map.put(7, "komal");
		map.put(9, "Kajal");
		/*
		 * //way 1 for (Map.Entry<Integer, String> entry : map.entrySet()) {
		 * System.out.println("Key : "+entry.getKey()+" value : "+entry.getValue());
		 * 
		 * }
		 */
		// Other Way or alternative way2

		/*
		 * for (Integer key :map.keySet()) { System.out.println("Key : "+key
		 * +" value : "+map.get(key)); }
		 */
		// WAY 3

		Iterator<Entry<Integer, String>> entry = map.entrySet().iterator();
		while (entry.hasNext()) {
			Entry<Integer, String> temp=entry.next(); //Note if entry.next() is called on each time in so it will print half of the ele from Map
			System.out.println("key : " +temp.getKey()+ " value : "+temp.getValue());

		}

	}
}
