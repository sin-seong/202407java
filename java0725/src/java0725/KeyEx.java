package java0725;

import java.util.HashMap;

public class KeyEx {

	public static void main(String[] args) {
//		HashMap<Integer, String>hashMap = new HashMap<Integer, String>();//<키,벨류>
//		hashMap.put(1, "근근근");
//		hashMap.put(2, "펠릭스");
//		String val = hashMap.get(2);
//		System.out.println(val);
	
		Key key1 = new Key(100);
		Key key2 = new Key(100);
		System.out.println(key1.hashCode());
		System.out.println(key2.hashCode());
		if(key1.equals(key2)) {
			System.out.println("같다");
		}
		
		HashMap<Key, String>hashMap = new HashMap<>();//<키,벨류>
		hashMap.put(new Key(1), "근근근");
		String val = hashMap.get(new Key(1));
		System.out.println(val);
	}

}
