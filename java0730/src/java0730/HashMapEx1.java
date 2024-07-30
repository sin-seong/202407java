package java0730;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();// 키 벨류 순
		map.put("신용권",85);  //키를 기준으로 하기에 키 중복이면 하나만 출력
		map.put("신용권",95);
		map.put("신용권",75);
		map.put("홍만세",65);
		System.out.println(map.size());
		System.out.println(map.get("신용권")); //최종 데이터만 출력 
	
		Set<String> ks = map.keySet();
		for(String str : ks) {
			System.out.println(str);
			System.out.println(map.get(str));
		}
		Set<Map.Entry<String, Integer>> er = map.entrySet();
		for (Map.Entry<String, Integer> ke : er){
		String k = ke.getKey();
		Integer v = ke.getValue();
		String msg = MessageFormat.format("키는{0}이고, 값은 {1}이다",k,v);
		System.out.println(msg);
	}
	}
}
